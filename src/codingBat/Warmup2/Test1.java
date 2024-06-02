package codingBat.Warmup2;

public class Test1 {
    public int last2(String str) {
        if (str.length() < 2) return 0;

        String end = str.substring(str.length()-2);
        int counter = 0;

        for (int i=0; i<str.length()-2; i++) {
            String sub = str.substring(i, i+2);
            if (sub.equals(end)) {  // Use .equals() with strings
                counter++;
            }
        }
        return counter;
    }
}
