package LeetCode;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IsPalindrome {
    public static void main(String[] args) {
        IsPalindrome isPalindrome = new IsPalindrome();
        System.out.println(isPalindrome.isPalindrome(101));
    }
    public boolean isPalindrome(int x) {
        boolean isPalindrome = false;
        String res = String.valueOf(x);

        List<Character> list = new ArrayList<>();
        for (Character ch:res.toCharArray()){
            list.add(ch);
        }


        ListIterator<Character> listIterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());

        while (listIterator.hasNext() && reverseIterator.hasPrevious()){
            if (listIterator.next() != reverseIterator.previous()){
                return isPalindrome;
            }
        }

        return true;
    }
}
