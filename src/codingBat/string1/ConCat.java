package codingBat.string1;

public class ConCat {
    public static void main(String[] args) {
        String a = "cbc";
        String another = a.substring(0,1);
        System.out.println(another);

    }
    public String conCat(String a, String b) {
        if (a.isEmpty() || b.isEmpty()){
            return a + b;
        }
        if (a.substring(a.length() - 1).equals(b.substring(0,1))){
            return a.substring(0,a.length() - 1) + b;
        }
        return a + b;
    }

}
