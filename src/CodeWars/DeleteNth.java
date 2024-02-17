package CodeWars;

import java.util.*;

public class DeleteNth {
    public static void main(String[] args) {
        int [] arr = new int[]{1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1};
        System.out.println(Arrays.toString(deleteNth(arr,3)));




    }
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        Map<Integer, Integer> countMap = new HashMap<>(); // {1, 1, 3, 3, 7, 2, 2, 2, 2 } 3
        List<Integer> result = new ArrayList<>(); // 1 1

        for (int num : elements) { // 1 1 3
            int count = countMap.getOrDefault(num, 0); // получаем число
            if (count < maxOccurrences) {
                result.add(num);
                countMap.put(num, count + 1);
            }
        }


        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }
}
