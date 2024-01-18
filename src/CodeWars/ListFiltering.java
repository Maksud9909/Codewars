package CodeWars;

import java.util.List;
import java.util.stream.Collectors;

public class ListFiltering {
    public static List<Object> filterList(final List<Object> list) {
     return    list.stream().
             filter(item->item instanceof Integer).
             map(itme->(Integer)itme).
             collect(Collectors.toList());
    }
}
