package LeetCode;

import java.util.*;

import static java.util.Arrays.*;

public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> numbers = new ArrayList<>(); // здесь хранятся числа которых нет в nums

        for (int i = 1; i < nums.length; i++) {
            numbers.add(i); //  1 2 3
        }

        Set<Integer> set = new HashSet<>();
        for (Integer num : nums) {
            set.add(num);
        }


        for (int i = 0; i < nums.length; i++) {
            if (numbers.contains(nums[i])) {
                numbers.remove((Integer) nums[i]); //  мы нашли числа нужные нам.
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            set.add(numbers.get(i));
        }
        return numbers;
    }



}



