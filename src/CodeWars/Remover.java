package CodeWars;



import java.util.Arrays;

public class Remover {
    public static void main(String[] args) {
        int [] num = {5,2,1,3,5,5};
        System.out.println(Arrays.toString(removeSmallest(num)));
    }
    public static int[] removeSmallest(int[] array) {
        if (array == null || array.length == 0) {
            return new int[0]; // Return an empty array for empty input
        }

        int minIndex = 0;

        // Find the index of the minimum value
        for (int i = 1; i < array.length; i++) { // 5,2,1,3,5,5
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }

        // Create a new array without the element at the minimum index
        int[] result = new int[array.length - 1];
        System.arraycopy(array, 0, result, 0, minIndex);
        System.arraycopy(array, minIndex + 1, result, minIndex, array.length - minIndex - 1);

        return result;
    }
}
