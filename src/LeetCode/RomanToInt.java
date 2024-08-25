package LeetCode;

public class RomanToInt { // MCMXCIV
    public int romanToInt(String str) {
        int result = 0;

        char [] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'I')
                result++;
            else if (arr[i] == 'V')
                result+=5;
            else if (arr[i] == 'X')
                result+=10;
            else if (arr[i] == 'L')
                result+=50;
            else if (arr[i] == 'C')
                result+=100;
            else if (arr[i] == 'D')
                result+=500;
            else if (arr[i] == 'M')
                result+=1000;
            else {
                result+=0;
            }
        }
        return result;
    }
}
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000