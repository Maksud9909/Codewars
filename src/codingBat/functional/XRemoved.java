package codingBat.functional;


import java.util.List;
import java.util.stream.Collectors;

public class XRemoved {
    public List<String> noX(List<String> strings) {
        return strings.stream().map(s ->  s.replace("x","")).collect(Collectors.toList());
    }

}
