package codingBat.Map_1;
import java.util.HashMap;
import java.util.Map;
public class MapShare {
    public Map<String, String> mapShare(Map<String, String> map){
        map.remove("c");
        if (map.containsKey("a")){
            map.put("b",map.get("a"));
        }
        return map;
    }

}
