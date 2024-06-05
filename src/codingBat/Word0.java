package codingBat;


import java.util.HashMap;
import java.util.Map;

public class Word0 {
    public Map<String, Integer> word0(String[] strings) {
        Map<String,Integer> map =  new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i],0);
        }
        return map;
    }

}
