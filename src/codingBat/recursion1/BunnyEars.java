package codingBat.recursion1;

public class BunnyEars {
    public int bunnyEars(int bunnies) {
        if (bunnies == 0){
            return 0;
        }
        return 2 + bunnyEars(bunnies-1);
    }

}
