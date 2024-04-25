package Yandex;

import java.util.Scanner;

import java.util.Scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение строки задания и последовательности нажатий клавиш
        String task = scanner.nextLine();
        String keyPresses = scanner.nextLine();

        // Проверка, справился ли пользователь с заданием
        String result = checkTyping(task, keyPresses);
        System.out.println(result);

        scanner.close();
    }

    public static String checkTyping(String task, String keyPresses) {
        StringBuilder typedString = new StringBuilder(); // Инициализируем строку, которую набирает пользователь
        int cursorPosition = 0; // Инициализируем позицию курсора

        // Проходимся по каждому символу в последовательности нажатий клавиш
        for (char keyPress : keyPresses.toCharArray()) {
            if (keyPress == '<') {
                // Обработка управляющих конструкций
                String controlCommand = keyPresses.substring(0, 7); // Получаем управляющую конструкцию
                keyPresses = keyPresses.substring(7); // Обрезаем последовательность нажатий

                switch (controlCommand) {
                    case "<delete>":
                        // Удаление символа после текущей позиции курсора
                        if (cursorPosition < typedString.length()) {
                            typedString.deleteCharAt(cursorPosition);
                        }
                        break;
                    case "<bspace>":
                        // Удаление символа перед текущей позицией курсора
                        if (cursorPosition > 0) {
                            cursorPosition--;
                            typedString.deleteCharAt(cursorPosition);
                        }
                        break;
                    case "<left>":
                        // Курсор перемещается влево на один символ
                        if (cursorPosition > 0) {
                            cursorPosition--;
                        }
                        break;
                    case "<right>":
                        // Курсор перемещается вправо на один символ
                        if (cursorPosition < typedString.length()) {
                            cursorPosition++;
                        }
                        break;
                }
            } else {
                // Добавление символа в строку
                typedString.insert(cursorPosition, keyPress);
                cursorPosition++;
            }
        }

        // После всех операций сравниваем полученную строку с заданием
        return typedString.toString().equals(task) ? "Yes" : "No";
    }
}
