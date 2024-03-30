package Codewars2;

import java.util.Arrays;

public class Posibilities {
    public static void main(String[] args) {
        System.out.println(isAllPossibilities(new int[]{6,0,4}));
    }
    public static boolean isAllPossibilities(int[] arg) {
        int length = arg.length;
        boolean[] visited = new boolean[length];

        for (int num : arg) {
            if (num < 0 || num >= length || visited[num]) {
                return false;
            }
            visited[num] = true;
        }

        return true;
    }
}
