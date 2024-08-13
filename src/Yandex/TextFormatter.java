package Yandex;
import java.util.*;

public class TextFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // Находим максимальную длину слова
        String[] words = input.split(" ");
        int maxWordLength = 0;
        for (String word : words) {
            maxWordLength = Math.max(maxWordLength, word.length());
        }

        int len = maxWordLength * 3;
        StringBuilder currentLine = new StringBuilder();
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (currentLine.length() + word.length() + (currentLine.length() > 0 ? 1 : 0) > len) {
                result.add(currentLine.toString());
                currentLine.setLength(0);
            }
            if (currentLine.length() > 0) {
                currentLine.append(" ");
            }
            currentLine.append(word);
        }

        // Добавляем последнюю строку
        if (currentLine.length() > 0) {
            result.add(currentLine.toString());
        }

        // Выводим результат
        for (String line : result) {
            System.out.println(line);
        }
    }
}
