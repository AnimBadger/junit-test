package dev.stephen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {
    @Test
    void fiftyNineReturnF(){
        var grader = new Grader();
        assertEquals('F', grader.determineGrade(59));
    }
    @Test
    void zeroReturnF(){
        var grader = new Grader();
        assertEquals('F', grader.determineGrade(0));
    }@Test
    void thirtyTwoReturnF(){
        var grader = new Grader();
        assertEquals('F', grader.determineGrade(32));
    }
    @Test
    void sixtyNineReturnD(){
        var grader = new Grader();
        assertEquals('D', grader.determineGrade(69));
    }
    @Test
    void seventyNineReturnF(){
        var grader = new Grader();
        assertEquals('C', grader.determineGrade(79));
    }
    @Test
    void eightNineReturnF(){
        var grader = new Grader();
        assertEquals('B', grader.determineGrade(89));
    }
    @Test
    void NinetyNineReturnF(){
        var grader = new Grader();
        assertEquals('A', grader.determineGrade(99));
    }
    @Test
    void negativeThrowsIllegalException(){
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class, () -> {
            grader.determineGrade(-1);
        });
    }
    @Test
    void overHundredThrowsIllegalException(){
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class, () -> {
            grader.determineGrade(1000);
        });
    }

}