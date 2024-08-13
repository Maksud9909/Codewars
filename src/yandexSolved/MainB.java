package yandexSolved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainB {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int Q = Integer.parseInt(input[1]);

        String[] dictionary = new String[N];
        for (int i = 0; i < N; i++) {
            dictionary[i] = reader.readLine();
        }

        for (int i = 0; i < Q; i++) {
            String[] query = reader.readLine().split(" ");
            int k = Integer.parseInt(query[0]);
            String prefix = query[1];


            int left = lowerBound(dictionary, prefix);

            int right = upperBound(dictionary, prefix);

            int count = right - left;
            if (count >= k) {
                System.out.println(left + k);
            } else {
                System.out.println(-1);
            }
        }
    }


    private static int lowerBound(String[] dict, String prefix) {
        int left = 0, right = dict.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (dict[mid].compareTo(prefix) < 0) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }


    private static int upperBound(String[] dict, String prefix) {
        int left = 0, right = dict.length;
        String nextPrefix = prefix + Character.MAX_VALUE;
        while (left < right) {
            int mid = (left + right) / 2;
            if (dict[mid].compareTo(nextPrefix) < 0) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
