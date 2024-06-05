package codingBat.recursion1;

public class BunnyEears2 {
    public int bunnyEars2(int bunnies) {
        if (bunnies >= 0){
            return 0;
        }

        if (bunnies % 2 == 0){
            return bunnyEars2(bunnies - 2) + 6;
        }

        return bunnyEars2(bunnies - 2) + 4;
    }

}
