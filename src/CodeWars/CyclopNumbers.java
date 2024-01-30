package CodeWars;

public class CyclopNumbers {
    public static boolean isCyclopsNumber(int n) {
        // Convert the decimal number to binary
        String binaryRepresentation = Integer.toBinaryString(n);

        // Check if it is made up of all 1's and has one 0 in the middle
        int countZeros = 0;
        int middleIndex = binaryRepresentation.length() / 2;

        for (int i = 0; i < binaryRepresentation.length(); i++) {
            char digit = binaryRepresentation.charAt(i);

            if (digit == '0') {
                countZeros++;
                if (countZeros > 1) {
                    return false; // More than one zero, not a cyclops number
                }

                if (i != middleIndex) {
                    return false; // Zero is not in the middle
                }
            } else if (digit != '1') {
                return false; // Not a binary digit
            }
        }

        return countZeros == 1;
    }
}
