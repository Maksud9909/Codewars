package codingBat.string1;

public class MiddleTwo {
    public String middleTwo(String str) {
        int mid = str.length() / 2;
        return str.substring(mid,mid + 1);
    }

}
