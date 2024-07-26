package codingBat.string1;

public class MiddleThree {
    public String middleThree(String str) {
        int mid = str.length() / 2;
        return str.substring(mid - 1,mid) + str.substring(mid,mid+1);
    }

}
