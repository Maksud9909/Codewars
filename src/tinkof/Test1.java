package tinkof;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        //Tect1
        String inputText1 = "a1b2c3";
        System.out.println(replacePasswords(inputText1));

        // Тест 2
        String inputText2 = "code12345";
        System.out.println(replacePasswords(inputText2));

        // Тест 3
        String inputText3 = "aaacodebcode1code2code3bbb";
        System.out.println(replacePasswords(inputText3));

        // Тест 4
        String inputText4 = "code999andcodec1andcocode888";
        System.out.println(replacePasswords(inputText4));
    }


    private static String replacePasswords(String text) {
        String result = text.replaceAll("code\\d+", "???");

        return result;
    }
}
