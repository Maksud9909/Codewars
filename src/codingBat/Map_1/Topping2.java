package codingBat.Map_1;

import java.util.Map;

public class Topping2 {
    public Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream")){
            map.put("yogurt",map.get("ice cream"));
        }
        if (map.containsKey("spinach")){
            map.put("spinach","nuts");
        }
        return map;
    }

}
