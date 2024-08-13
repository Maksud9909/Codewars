import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class XX {
    static class SearchWord {
        String word;
        int popularity;
        int index;

        public SearchWord(String word, int popularity, int index) {
            this.word = word;
            this.popularity = popularity;
            this.index = index;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line1 = reader.readLine().split(" ");
        int n = Integer.parseInt(line1[0]);
        int q = Integer.parseInt(line1[1]);

        List<SearchWord> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] line = reader.readLine().split(" ");
            String word = line[0];
            int popularity = Integer.parseInt(line[1]);
            list.add(new SearchWord(word, popularity, i + 1));
        }

        list.sort(Comparator.comparing(sw -> sw.word));

        StringBuilder prefix = new StringBuilder();
        LinkedList<Integer> answers = new LinkedList<>();

        for (int i = 0; i < q; i++) {
            String[] request = reader.readLine().split(" ");
            String symbol = request[0];
            if (symbol.equals("+")) {
                prefix.append(request[1]);
            } else {
                if (prefix.length() > 0) {
                    prefix.setLength(prefix.length() - 1);
                }
                if (!answers.isEmpty()) {
                    answers.removeLast();
                }
                if (!answers.isEmpty()) {
                    writer.write(answers.getLast() + "\n");
                    continue;
                }
            }

            String subPrefix = prefix.toString();
            int low = 0, high = list.size();
            while (low < high) {
                int mid = (low + high) / 2;
                if (list.get(mid).word.compareTo(subPrefix) < 0) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            int leftIndex = low;

            low = 0;
            high = list.size();
            while (low < high) {
                int mid = (low + high) / 2;
                if (list.get(mid).word.compareTo(subPrefix + Character.MAX_VALUE) <= 0) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            int rightIndex = low;

            int bestIndex = -1;
            int highestPopularity = -1;

            for (int j = leftIndex; j < rightIndex; j++) {
                SearchWord sw = list.get(j);
                if (sw.word.startsWith(subPrefix) && sw.popularity > highestPopularity) {
                    bestIndex = sw.index;
                    highestPopularity = sw.popularity;
                }
            }

            answers.add(bestIndex);
            writer.write(bestIndex + "\n");
        }

        writer.flush();
        writer.close();
        reader.close();
    }
}
