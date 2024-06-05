package codingBat.Map_1;

import java.util.Map;

public class Topping1 {
    public Map<String, String> topping1(Map<String, String> map) {
        map.put("bread","butter");
        if (map.containsKey("ice cream")){
            map.put("ice cream","cherry");
        }
        return map;
    }

}
