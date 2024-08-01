package codingBat.functional;

import java.util.List;
import java.util.stream.Collectors;

public class RightDigit {
    public List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream().map(integer -> {
            if (integer.equals(10) || integer < 10){
                return integer;
            }else {
                return integer % 10;
            }
        }).collect(Collectors.toList());
    }

}
