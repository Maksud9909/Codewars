package codingBat.Warmup2;


import java.util.HashMap;
import java.util.Map;

public class WordMultiply {
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String,Integer> map = new HashMap<>();
        Map<String,Boolean> result = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i])){
                map.put(strings[i],map.get(strings[i]) + 1);
            }else {
                map.put(strings[i],1);
            }
        }
        for (int i = 0; i < map.size(); i++) {
            if (map.get(strings[i]) % 2 == 0){
                result.put(strings[i],true);
            }
            result.put(strings[i],false);
        }
        return result;
    }
}
