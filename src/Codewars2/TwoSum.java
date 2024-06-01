package Codewars2;

import java.util.Arrays;
import java.util.HashMap;


public class TwoSum {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        System.out.println(Arrays.toString(twoSum(arr,4)));
    }

    public static int[] twoSum(int[] numbers, int target)
    {
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] + numbers[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}



// public static int[] twoSum(int[] numbers, int target) {
//
//
//        HashMap<Integer,Integer> map = new HashMap<>();
//
//
//        for (int i = 0; i < numbers.length; i++) { // 4
//            int found = target - numbers[i]; // получили разницу теперь пытаемся найти ее в arr
//
//
//            if (map.containsKey(found)){// проверяем есть ли она
//                return new int[]{map.get(found), i};
//            }
//            map.put(numbers[i],i);
//        }
//        return new int[]{};
//    }