package CodeWars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Sorter {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("math");
        list.add("Algebra");
        list.add("Fiziks");
        sort(list);
        System.out.println(list);

    }
    public static List<String> sort(List<String> textbooks) {
        //Cramming right before a test can't be that bad?
        Collections.sort(textbooks, Comparator.comparing(String::toLowerCase));
        return textbooks;
    }
}
