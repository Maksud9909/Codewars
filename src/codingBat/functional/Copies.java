package codingBat.functional;
import java.util.List;
import java.util.stream.Collectors;

public class Copies {
    public List<String> copies3(List<String> strings) {
        return strings.stream().map(s -> s + s + s).collect(Collectors.toList());
    }

}
