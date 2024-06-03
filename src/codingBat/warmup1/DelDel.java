package codingBat.warmup1;

public class DelDel {
    public String delDel(String str) {
        if (str.substring(1).startsWith("del") && str.length() > 3){
            return str.substring(0,1) + str.substring(5);
        }
        return str;
    }

}
