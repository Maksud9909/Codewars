package CodeWars;

import java.util.Arrays;

public class FindOddCubes {
    public static void main(String[] args) {
        System.out.println(cubeOdd(new int[] {1, 2, 3, 4}));
    }
    public static int cubeOdd(int arr[]) {
        return Arrays.stream(arr).map(item -> item*item*item).filter(item->item%2!=0).sum();


    }
}
