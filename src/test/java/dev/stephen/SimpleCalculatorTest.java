package dev.stephen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    void twoPlusTwoIsFour(){
        var calculator = new SimpleCalculator();
        assertEquals(4, calculator.addTwoNumbers(2, 2));
    }
    @Test
    void twoPlusTenIsTwelve(){
        var calculator = new SimpleCalculator();
        assertEquals(12, calculator.addTwoNumbers(10,2));
    }

}