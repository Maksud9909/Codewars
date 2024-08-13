package yandexSolved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class MainA {
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder result = new StringBuilder();
//
//        String text = reader.readLine();
//
//        int maxLength = 0;
//        LinkedList<String> words = new LinkedList<>();
//        StringBuilder word = new StringBuilder();
//
//        for (char c : text.toCharArray()) {
//            if (Character.isLetter(c)) {
//                word.append(c);
//            } else if (c == ',' || c == ' ') {
//                if (!word.isEmpty()) {
//                    words.add(word.toString());
//                    maxLength = Math.max(maxLength, word.length());
//                    word = new StringBuilder();
//                }
//                if (c == ',') {
//                    String lastWord = words.removeLast() + ",";
//                    words.add(lastWord);
//                }
//            }
//        }
//
//        if (!word.isEmpty()) {
//            words.add(word.toString());
//            maxLength = Math.max(maxLength, word.length());
//        }
//
//        maxLength *= 3;
//        StringBuilder line = new StringBuilder();
//
//        for (String s : words) {
//            if (line.length() > 0 && line.length() + 1 + s.length() > maxLength) {
//                result.append(line).append("\n");
//                line = new StringBuilder(s);
//            } else {
//                if (line.length() > 0) {
//                    line.append(" ");
//                }
//                line.append(s);
//            }
//        }
//
//        if (!line.isEmpty()) {
//            result.append(line);
//        }
//
//        System.out.println(result);
//    }
}
