package codingBat.Map_1;

import java.util.Map;

public class MapAB4 {
    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")){
            if (map.get("a").length() > map.get("b").length()){
                map.put("c",map.get("a"));
            } else if (map.get("a").length() < map.get("b").length()) {
                map.put("c",map.get("b"));
            }else {
                map.put("b","");
                map.put("a","");
            }
        }
        return map;
    }

}
