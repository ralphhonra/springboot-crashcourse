package com.example.springboot_crashcourse.session2.calculator_tdd_style;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void init(){
        calculator = new Calculator();
    }

    // TESTS FOR SUM

    @Test
    @DisplayName("This tests the calculator sum with integer inputs")
    void sumOfIntegers(){
        assertEquals(5, calculator.sum(2, 3));
    }

    @Test
    @DisplayName("This tests the calculator sum with long inputs")
    void sumOfLongs(){
        assertEquals(5L, calculator.sum(2L, 3L));
    }

    @Test
    @DisplayName("This tests the calculator sum with short inputs")
    void sumOfShorts(){
        assertEquals((short) 5, calculator.sum((short) 2, (short) 3));
    }

    @Test
    @DisplayName("This tests the calculator sum with double inputs")
    void sumOfDoubles(){
        assertEquals(5.0, calculator.sum(2.0, 3.0));
    }

    @Test
    @DisplayName("This tests the calculator sum with float inputs")
    void sumOfFloats(){
        assertEquals(5.0f, calculator.sum(2.0f, 3.0f));
    }

    // TESTS FOR DIFFERENCE

    @Test
    @DisplayName("This tests the calculator difference with integer inputs")
    void differenceOfIntegers(){
        assertEquals(-1, calculator.difference(2, 3));
    }

    @Test
    @DisplayName("This tests the calculator difference with long inputs")
    void differenceOfLongs(){
        assertEquals(-1L, calculator.difference(2L, 3L));
    }

    @Test
    @DisplayName("This tests the calculator difference with short inputs")
    void differenceOfShorts(){
        assertEquals((short) -1, calculator.difference((short) 2, (short) 3));
    }

    @Test
    @DisplayName("This tests the calculator difference with double inputs")
    void differenceOfDoubles(){
        assertEquals(-1.0, calculator.difference(2.0, 3.0));
    }

    @Test
    @DisplayName("This tests the calculator difference with float inputs")
    void differenceOfFloats(){
        assertEquals(-1.0f, calculator.difference(2.0f, 3.0f));
    }

    // TESTS FOR MULTIPLICATION

    @Test
    @DisplayName("This tests the calculator multiply with integer inputs")
    void multiplyOfIntegers(){
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    @DisplayName("This tests the calculator multiply with long inputs")
    void multiplyOfLongs(){
        assertEquals(6L, calculator.multiply(2L, 3L));
    }

    @Test
    @DisplayName("This tests the calculator multiply with short inputs")
    void multiplyOfShorts(){
        assertEquals((short) 6, calculator.multiply((short) 2, (short) 3));
    }

    @Test
    @DisplayName("This tests the calculator multiply with double inputs")
    void multiplyOfDoubles(){
        assertEquals(6.0, calculator.multiply(2.0, 3.0));
    }

    @Test
    @DisplayName("This tests the calculator multiply with float inputs")
    void multiplyOfFloats(){
        assertEquals(6.0f, calculator.multiply(2.0f, 3.0f));
    }

    // TEST FOR DIVISION

    @Test
    @DisplayName("This tests the calculator divide with integer inputs")
    void divideWithValidInputsOfIntegers(){
        assertEquals(4, calculator.divide(12, 3));
    }

    @Test
    @DisplayName("This tests the calculator divide with long inputs")
    void divideWithValidInputsOfLongs(){
        assertEquals(4L, calculator.divide(12L, 3L));
    }

    @Test
    @DisplayName("This tests the calculator divide with short inputs")
    void divideWithValidInputsOfShorts(){
        assertEquals((short) 4, calculator.divide((short) 12, (short) 3));
    }

    @Test
    @DisplayName("This tests the calculator divide with double inputs")
    void divideWithValidInputsOfDoubles(){
        assertEquals(4.0, calculator.divide(12.0, 3.0));
    }

    @Test
    @DisplayName("This tests the calculator divide with float inputs")
    void divideWithValidInputsOfFloats(){
        assertEquals(4.0f, calculator.divide(12.0f, 3.0f));
    }

    @Test
    @DisplayName("This tests the calculator with zero denominator for integer inputs")
    void divideWithZeroDenominatorOfIntegers(){
        Exception exception = assertThrows(ArithmeticException.class,
                () -> calculator.divide(1, 0));
        assertTrue(exception.getMessage().toLowerCase().contains("/ by zero"));
    }

    @Test
    @DisplayName("This tests the calculator with zero denominator for long inputs")
    void divideWithZeroDenominatorOfLongs(){
        Exception exception = assertThrows(ArithmeticException.class,
                () -> calculator.divide(1L, 0L));
        assertTrue(exception.getMessage().toLowerCase().contains("/ by zero"));
    }

    @Test
    @DisplayName("This tests the calculator with zero denominator for short inputs")
    void divideWithZeroDenominatorOfShorts(){
        Exception exception = assertThrows(ArithmeticException.class,
                () -> calculator.divide((short) 1, (short) 0));
        assertTrue(exception.getMessage().toLowerCase().contains("/ by zero"));
    }

    @Test
    @DisplayName("This test the calculator with zero denominator for double inputs")
    void divideWithZeroDenominatorOfDoubles(){
        assertEquals(Double.POSITIVE_INFINITY, calculator.divide(100.0, 0.0));
        assertEquals(Double.NEGATIVE_INFINITY, calculator.divide(-100.0, 0.0));
    }

    @Test
    @DisplayName("This test the calculator with zero denominator for float inputs")
    void divideWithZeroDenominatorOfFloats(){
        assertEquals(Float.POSITIVE_INFINITY, calculator.divide(100.0f, 0.0f));
        assertEquals(Float.NEGATIVE_INFINITY, calculator.divide(-100.0f, 0.0f));
    }


}