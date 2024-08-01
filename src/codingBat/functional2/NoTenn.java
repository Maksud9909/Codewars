package codingBat.functional2;

import java.util.List;
import java.util.stream.Collectors;

public class NoTenn {
    public List<Integer> noTeen(List<Integer> nums) {
        return nums.stream().filter(integer -> integer < 13 || integer > 19).collect(Collectors.toList());
    }

}
