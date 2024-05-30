package LeetCode;

public class RemoveDuplicates {
    public String removeDuplicates(String s) {
        char[] stack = new char[s.length()]; // create at the same size as String
        int i = 0; // index

        for (int j = 0; j < s.length(); j++) {
            char current_char = s.charAt(j); // char

            if (i > 0 && stack[i-1] == current_char){
                i--;
            }else {
                stack[i] = current_char;
                i++;
            }
        }
        return new String(stack,0,i);
    }
}
