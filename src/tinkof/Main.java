package tinkof;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] tasks = new int[n][3];

        for (int i = 0; i < n; i++) {
            tasks[i][0] = scanner.nextInt(); // day
            tasks[i][1] = scanner.nextInt(); // time
            tasks[i][2] = scanner.nextInt(); // deadline
        }

        for (int i = 0; i < n; i++) {
            int day = tasks[i][0];
            int time = tasks[i][1];
            int deadline = tasks[i][2];

            if (day + time <= deadline) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}