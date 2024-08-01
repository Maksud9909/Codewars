package codingBat.functional2;

import java.util.List;
import java.util.stream.Collectors;

public class No2 {
    public List<Integer> two2(List<Integer> nums) {
        return nums.stream().map(integer -> integer * 2).filter(integer -> integer%10!=2).collect(Collectors.toList());
    }

}
