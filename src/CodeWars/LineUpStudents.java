package CodeWars;

import java.util.Arrays;
import java.util.Comparator;

public class LineUpStudents {
    public static String[] lineupStudents(String students){
        String[] namesArray = students.split("\\s+");
        Arrays.sort(namesArray, Comparator.comparingInt(String::length).reversed());

        return namesArray;
    }
}
