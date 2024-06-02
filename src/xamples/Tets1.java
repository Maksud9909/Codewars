package xamples;

public class Tets1 {
    public static void main(String[] args) {
        System.out.println(pow(5));
    }

    public static int pow(int a){
        if (a == 0){
            return 1;
        }
        return a * pow(--a);
    }
}
