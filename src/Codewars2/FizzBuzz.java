package Codewars2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;



public class FizzBuzz {
    public byte[] fizzBuzzTest(int value){
        byte [] result = new byte[0];

        if (value%5 == 0 && value%3 == 0){
            return "FizzBuzz".getBytes();
        }else if (value%5 == 0){
            return "Buzz".getBytes();
        }else if (value%3 == 0) {
            return "Fizz".getBytes();
        }
        throw new RuntimeException("Not implemented yet");
    }
}




class FizzBuzzTest {

    @Test
    public void testFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertArrayEquals("FizzBuzz".getBytes(), fizzBuzz.fizzBuzzTest(15));
        assertArrayEquals("Buzz".getBytes(), fizzBuzz.fizzBuzzTest(10));
        assertArrayEquals("Fizz".getBytes(), fizzBuzz.fizzBuzzTest(9));
    }

    @Test
    public void testNotFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertThrows(RuntimeException.class, () -> fizzBuzz.fizzBuzzTest(7));
    }
}
