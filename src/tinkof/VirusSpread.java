package tinkof;

import java.util.Scanner;
public class VirusSpread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();

        // Assuming Hetag starts at the center of a sufficiently large grid
        int gridSize = 100; // Adjust as needed
        boolean[][] grid = new boolean[gridSize][gridSize];
        int center = gridSize / 2;
        grid[center][center] = true;

        for (int minute = 1; minute <= minutes; minute++) {
            boolean[][] newGrid = new boolean[gridSize][gridSize];
            for (int i = 0; i < gridSize; i++) {
                for (int j = 0; j < gridSize; j++) {
                    if (grid[i][j]) {
                        // Infect neighbors
                        newGrid[i - 1][j] = true;
                        newGrid[i + 1][j] = true;
                        newGrid[i][j - 1] = true;
                        newGrid[i][j + 1] = true;
                    }
                }
            }
            grid = newGrid;
        }

        // Count infected people
        int infectedCount = 0;
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                if (grid[i][j]) {
                    infectedCount++;
                }
            }
        }
        System.out.println(infectedCount);
    }
}
