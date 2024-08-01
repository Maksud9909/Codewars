package codingBat.functional;
import java.util.List;
import java.util.stream.Collectors;

public class Doubling {
    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream().map(integer -> integer * integer).collect(Collectors.toList());
    }

}
