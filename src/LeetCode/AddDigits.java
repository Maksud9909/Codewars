package LeetCode;

public class AddDigits {
    public int addDigits(int num) { // 38
        if (num <= 9) return num;  // base case

        int total = 0;

        while (num > 0){
            total += num % 10;  // add last digit    38 % 10 = 8
            num /= 10; // remove last digit   38 / 10 = 3
        }
        return addDigits(total); // recursion
    }
}
