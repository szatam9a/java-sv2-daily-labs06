package day02.numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumbersMainTest {

    PerfectNumbers perfectNumbers;

    {
        perfectNumbers = new PerfectNumbers();
    }

    @Test
    void aPerfectNumberTest(){
        assertEquals(true, perfectNumbers.isPerfectNumber(6));
    }
    @Test
    void aNonPerfectNumberTest(){
        assertEquals( false , perfectNumbers.isPerfectNumber(9));
    }
}