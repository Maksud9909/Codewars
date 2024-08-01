package codingBat.functional;


import java.util.List;
import java.util.stream.Collectors;


public class Lower {
    public List<String> lower(List<String> strings) {
        return strings.stream().map(String::toLowerCase).collect(Collectors.toList());
    }

}
