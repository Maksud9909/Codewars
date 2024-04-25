package Yandex;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("input.txt"));
        FileWriter writer = new FileWriter("output.txt");

        // Чтение никнейма из ввода
        String nickname = scanner.nextLine();

        // Проверка никнейма и запись результата
        writer.write(checkNickname(nickname));

        // Закрытие файлов
        scanner.close();
        writer.close();
    }

    public static String checkNickname(String nickname) {
        // Проверяем длину никнейма
        if (nickname.length() < 8) {
            return "NO";
        }

        // Переменные для отслеживания наличия цифры, заглавной и прописной буквы
        boolean hasDigit = false;
        boolean hasUppercase = false;
        boolean hasLowercase = false;

        // Проверяем каждый символ никнейма
        for (int i = 0; i < nickname.length(); i++) {
            char ch = nickname.charAt(i);
            if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            }
        }

        // Если все условия выполнены, возвращаем "YES", иначе "NO"
        if (hasDigit && hasUppercase && hasLowercase) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
