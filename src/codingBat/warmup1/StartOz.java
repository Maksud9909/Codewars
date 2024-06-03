package codingBat.warmup1;

public class StartOz {
    public String startOz(String str) {
        if (str.length() >= 2 && str.startsWith("oz")){
            return "oz";
        } else if (str.length() >= 2 &&str.startsWith("o")) {
            return "o";
        } else if (str.length() >= 2 && str.substring(1,2).startsWith("z")) {
            return "z";
        }
        return "";
    }

}
