package CodeWars;

public class DeleteVowevls {
    public static String disemvowel(String str) {
        return str.replaceAll("[aeiouAEIOU]","");
    }
}
