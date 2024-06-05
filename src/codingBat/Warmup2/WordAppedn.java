package codingBat.Warmup2;

import java.util.HashMap;
import java.util.Map;

public class WordAppedn {
    public String wordAppend(String[] strings) {
        StringBuilder builder = new StringBuilder();
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i])){
                map.put(strings[i],map.get(strings[i]) + 1);
            }else {
                map.put(strings[i],1);
            }
            if (map.get(strings[i]) % 2 == 0){
                builder.append(strings[i]);
            }
        }
        return builder.toString();
    }

}
