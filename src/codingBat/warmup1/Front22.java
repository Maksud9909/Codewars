package codingBat.warmup1;

public class Front22 {
    public String front22(String str) {
        String front;
        if (str.isEmpty()){
            return str;
        }
        if (str.length() < 4){
            return str + str + str;
        }

        front = str.substring(0,2);
        return front + front + str + front + front;
    }

}
