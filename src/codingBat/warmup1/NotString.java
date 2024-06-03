package codingBat.warmup1;

public class NotString {
    public String notString(String str) {
        if (str.substring(0,3).contains("not") && str.length() > 3){
            return str;
        }

        return "not " + str;
    }
}
