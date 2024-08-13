package yandexSolved;

import java.util.*;

public class Autocomplete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        Map<String, Integer> popularity = new HashMap<>();
        List<String> words = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            String word = sc.next();
            int pop = sc.nextInt();
            words.add(word);
            popularity.put(word, pop);
        }

        StringBuilder t = new StringBuilder();
        Map<String, Integer> prefixMap = new HashMap<>();

        for (String word : words) {
            for (int i = 1; i <= word.length(); i++) {
                String prefix = word.substring(0, i);
                int currentPop = popularity.get(word);
                if (!prefixMap.containsKey(prefix) || popularity.get(words.get(prefixMap.get(prefix))) < currentPop) {
                    prefixMap.put(prefix, words.indexOf(word));
                }
            }
        }

        for (int i = 0; i < Q; i++) {
            String query = sc.next();
            if (query.equals("+")) {
                t.append(sc.next());
            } else {
                t.deleteCharAt(t.length() - 1);
            }

            String currentPrefix = t.toString();
            System.out.println(prefixMap.getOrDefault(currentPrefix, -1) + 1);
        }
    }
}