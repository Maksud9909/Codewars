package codingBat.functional2;

import java.util.List;
import java.util.stream.Collectors;

public class NoZ {
    public List<String> noZ(List<String> strings) {
        return strings.stream().filter(s -> !s.contains("z")).collect(Collectors.toList());
    }

}
