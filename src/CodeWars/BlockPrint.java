package CodeWars;

public class BlockPrint {
    public static String firstNonRepeatingLetter(String s){
        int nonReapitingIndex = 0;
        
        String letter = null;


        char ch [] = s.toCharArray();

        for (int i = 1; i < ch.length; i++) {
            if (ch[i] != ch[nonReapitingIndex]){
                letter = String.valueOf(ch[i]);
            }
        }
        return letter;
    }
}
