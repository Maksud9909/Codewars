package xamples;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String name = "Kevin";
        List<String> list = new ArrayList<>();
        int times = 10;
        System.out.println(times + fill(list, name + name, times)); // KevinKevin



    }
    public static int fill(Collection<String> collection, String str, int times){
        String shrunk = shrink(str); // string with length 5
        times = (times + shrunk.length()) / 2; // 7
        for (int i = 0; i < times / 2; i++) {
            collection.add(shrunk);
        }
        return times;
    }

    public static String shrink(String str){ // Maksud, 6
        int newLength = str.length() / 2 + str.length() % 2;
        char[] chars = new char[newLength]; // 6
        for (int i = 0; i < str.length(); i+=2) { // 6
            chars[i / 2] = str.charAt(i); // 3
        }
        return new String(chars); // 3 length
    }
}

