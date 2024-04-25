package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public int distributeCandies(int[] candyType) { // 1 1 2 2 3
        Set<Integer> set = new HashSet<>(); // {1, 2, 3}
        for (int i = 0; i < candyType.length; i++) {
            set.add(candyType[i]);
        }
        return Math.min(set.size(), candyType.length / 2);
    }
}


