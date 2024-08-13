package Yandex;
import java.util.Scanner;
import java.util.ArrayList;

public class TextFormatter2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] words = input.split("(?<=,)|(?=,)|\\s+");
        int maxWordLength = 0;
        for (String word : words) {
            maxWordLength = Math.max(maxWordLength, word.length());
        }
        int len = maxWordLength * 3;

        ArrayList<String> lines = new ArrayList<>();
        StringBuilder currentLine = new StringBuilder();

        for (String word : words) {
            if (!word.equals(",") && currentLine.length() > 0 &&
                    currentLine.length() + word.length() + (currentLine.toString().endsWith(",") ? 0 : 1) > len) {
                lines.add(currentLine.toString().trim());
                currentLine = new StringBuilder();
            }

            if (!word.equals(",")) {
                if (currentLine.length() > 0 && !currentLine.toString().endsWith(",")) {
                    currentLine.append(" ");
                }
                currentLine.append(word);
            } else {
                currentLine.append(word);
                if (currentLine.length() < len && !words[words.length - 1].equals(word)) {
                        currentLine.append(" ");
                }
            }
        }

        if (currentLine.length() > 0) {
            lines.add(currentLine.toString().trim());
        }

        for (String line : lines) {
            System.out.println(line);
        }
    }
}