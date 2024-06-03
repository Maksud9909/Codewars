package codingBat.warmup1;

public class Front3 {
    public String front3(String str) {
        if (str.length() == 0) {
            return str;
        }
        if (str.length() < 3){
            return str + str + str;
        }
        String result =  str.substring(0,3);
        return result + result + result;
    }

}
