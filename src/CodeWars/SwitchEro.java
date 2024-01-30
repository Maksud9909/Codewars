package CodeWars;

public class SwitchEro {
    public static String switcheroo(String x) {
        char [] array = x.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'a'){
                array[i] = 'b';
            } else if (array[i] == 'b') {
                array[i] = 'a';
            }
        }
        return new String(array);
    }
}
