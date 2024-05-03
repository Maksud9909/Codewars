package LeetCode;

public class NumberOfBit {
    public static void main(String[] args) {

    }
    public int hammingWeight(int n) {
        String binary = Integer.toBinaryString(n);
        int res = 0;

        for (int i = 0; i < binary.length(); i++) {
            char ch = binary.charAt(i);

            int getNum = Character.getNumericValue(ch);

            res += getNum;

        }
        return res;
    }
}
