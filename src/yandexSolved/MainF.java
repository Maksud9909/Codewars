package yandexSolved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MainF {

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
        String[] line1 = reader.readLine().split(" ");
        int n = Integer.parseInt(line1[0]);
        int q = Integer.parseInt(line1[1]);

        List<SearchWord> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] line = reader.readLine().split(" ");
            list.add(new SearchWord(line[0], Integer.parseInt(line[1]), i + 1));
        }

        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < q; i++) {
            String[] request = reader.readLine().split(" ");
            String symbol = request[0];

            if (symbol.equals("+")) {
                prefix.append(request[1]);
            } else {
                prefix.deleteCharAt(prefix.length() - 1);
            }

            int bestIndex = -1;
            int highestPopularity = -1;
            for (SearchWord searchWord : list) {
                if (searchWord.word.startsWith(prefix.toString())) {
                    if (searchWord.popularity > highestPopularity) {
                        bestIndex = searchWord.index;
                        highestPopularity = searchWord.popularity;
                    }
                }
            }

            System.out.println(bestIndex);
        }
    }
}