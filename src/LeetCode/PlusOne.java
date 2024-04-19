package LeetCode;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int [] ints = {9,8,7,6,5,4,3,2,1};
        PlusOne plusOne = new PlusOne();
        System.out.println(Arrays.toString(plusOne.plusOne(ints)));
    }


    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1; // Начинаем с 1, так как мы хотим добавить 1 к числу

        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10; // Оставляем только единицы
            carry = sum / 10; // Переносим десятки на следующий разряд
        }

        // Если у нас остался перенос после обработки всех цифр
        if (carry > 0) {
            int[] result = new int[n + 1];
            result[0] = carry;
            System.arraycopy(digits, 0, result, 1, n);
            return result;
        } else {
            return digits;
        }
    }






//    public int[] plusOne(int[] digits) { // [1,4,3]
//        StringBuilder finalRes = new StringBuilder();
//
//        for (int i = 0; i < digits.length; i++) {
//            finalRes.append(digits[i]); // 987654321
//        }
//        String parse = finalRes.toString();
//
//            int res = Integer.parseInt(parse);
//        res+=1;
//
//        String numberStr = Integer.toString(res);
//        char[] charArray = numberStr.toCharArray();
//        int[] intArray = new int[charArray.length];
//
//        for (int i = 0; i < charArray.length; i++) {
//            intArray[i] = charArray[i] - '0'; // Вычитание '0' из символа цифры преобразует его в соответствующее целое число.
//        }
//
//
//
//
//        return intArray;
//    }
}
