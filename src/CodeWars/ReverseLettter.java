package CodeWars;

import com.sun.source.tree.IfTree;
import org.junit.jupiter.api.Test;

import javax.sound.midi.MidiFileFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseLettter {

    public static String reverseLetter(final String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)){
                builder.append(ch);
        }

        }
        return builder.toString();
    }

//    public static String reverseLetter2(String str) {
//        StringBuilder reversedStr = new StringBuilder();
//        for (int i = str.length() - 1; i >= 0; i--) {
//            char currentChar = str.charAt(i);
//            if (Character.isLetter(currentChar)) {
//                reversedStr.append(currentChar);
//            }
//        }
//        return reversedStr.toString();
//    }
}


 class SampleTest {
     public static void main(String[] args) {
         SampleTest sampleTest = new SampleTest();
         sampleTest.testSomething();
     }
    @Test
    public void testSomething() {
//        doTest("krishan", "nahsirk");
        doTest("ultr53o?n", "nortlu");
        doTest("ab23c", "cba");
        doTest("krish21an", "nahsirk");
    }
    private void doTest(final String str, final String expected) {
        assertEquals(expected, ReverseLettter.reverseLetter(str));
    }
}