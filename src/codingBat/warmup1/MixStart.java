package codingBat.warmup1;

public class MixStart {
    public boolean mixStart(String str) {
        if (str.length() >=3){
            return str.substring(1,3).startsWith("ix");
        }
        return false;
    }

}
