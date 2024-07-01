package LeetCode;

public class Longest {
    public static void main(String[] args) {
        String name = "aaa";
    }
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null){
            return "";
        }
        String prefix = strs[0]; // Start with the first string as the initial prefix

        for (int i = 1; i < strs.length ; i++) {
            while (strs[i].lastIndexOf(prefix) !=0){
                if (prefix.isEmpty()){
                    return "";
                }
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
