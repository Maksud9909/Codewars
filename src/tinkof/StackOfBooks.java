package tinkof;

import java.util.*;

public class StackOfBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение входных данных
        int n = scanner.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }

        // Вызов функции для организации книг в стопки
        organizeBooks(n, heights);
    }

    static void organizeBooks(int n, int[] heights) {
        // Сортируем высоты книг по неубыванию
        Arrays.sort(heights);

        // Инициализируем переменные
        StringBuilder result = new StringBuilder();
        int currentHeight = heights[0];
        int currentCount = 1;

        // Проходим по высотам книг и формируем стопки
        for (int i = 1; i < n; i++) {
            if (heights[i] == currentHeight) {
                currentCount++;
            } else {
                for (int j = 0; j < currentCount; j++) {
                    result.append(currentHeight).append(" ");
                }
                currentHeight = heights[i];
                currentCount = 1;
            }
        }

        // Добавляем последнюю стопку
        for (int j = 0; j < currentCount; j++) {
            result.append(currentHeight).append(" ");
        }

        // Выводим результат
        System.out.println(result.toString().split(" ").length);
        System.out.println(result.toString().trim());
    }
}




//public static void main(String[] args) {
//
//    }
//    public static void sortBooks(int quantity, int [] height){
//        Arrays.sort(height);
//
//
//
//    }