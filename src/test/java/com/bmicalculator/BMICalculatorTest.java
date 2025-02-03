package com.bmicalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BMICalculatorTest {

    @Test
    public void testContructor(){
        BMICalculator bmiCalc = new BMICalculator("Max", "Mustermann", 180, 75, 'm');
        assertEquals("Max", bmiCalc.getFirstname());
        assertEquals("Mustermann", bmiCalc.getLastname());
        assertEquals(180, bmiCalc.getBodyHeight());
        assertEquals(75, bmiCalc.getBodyWeight());
        assertEquals('m', bmiCalc.getGender());
    }
    @Test
    public void testCalculateBMI(){
        BMICalculator bmiCalc = new BMICalculator("Test", "User", 170, 70, 'm');
        assertEquals(24.22, bmiCalc.calculateBMI(), 0.01);
    }
}
