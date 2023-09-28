package pro.sky.Calculator.service;

import org.junit.jupiter.api.Test;
import pro.sky.Calculator.exceptions.DivideException;

import static org.junit.jupiter.api.Assertions.*;

class CalcServiceTest {

    private CalcService calcService =
            new CalcService();

    private int num1 = 3;
    private int num2 = 4;

    //    Проверка сложения.
    @Test
    void calcPlus_shoudReturnPositiveNumWhenNum1AndNum2ArePositive() {

        long result = calcService.calcPlus(num1, num2);

        assertEquals(num1 + num2, result);
    }

    @Test
    void calcPlus_shoudReturnNegativeNumWhenNum1IsPositiveAndNum2AreNegativeAndNum2IsBigger() {
        int num2 = -8;
        long result  = calcService.calcPlus(num1, num2);

        assertEquals(num1 + num2, result);
    }

    //    Проверка вычитания.
    @Test
    void calcMinus_shouldReturnPositiveNumWhenNum1AndNum2ArePositiveAndNum1IsBigger() {
        num1 = 10;

        long result = calcService.calcMinus(num1, num2);
        assertEquals(num1 - num2, result);
    }

    @Test
    void calcMinus_shouldNegativeResultWhenNum2IsNegativeAndNum2IsBigger() {
        num2 = -15;

        long result = calcService.calcMinus(num1, num2);
        assertEquals((long)num1 - num2, result);
    }


    //    Проверка умножения.
    @Test
    void calcMultiply_shouldNegativeResultWhenNum1OrNum2IsNegative() {
        num1 = -2;

        long result = calcService.calcMultiply(num1, num2);
        assertEquals(num1 * num2, result);
    }

    @Test
    void calcMultiply_shouldPositiveResultWhenNum1AndNum2AreNegative() {
        num1 = -2;
        num2 = -6;

        long result = calcService.calcMultiply(num1, num2);
        assertEquals(num1 * num2, result);
    }

    //    Проверка деления.
    @Test
    void calcDivide_shoudReturnPositiveNumWhenNum1AndNum2ArePositive() {
        double result = calcService.calcDivide(num1, num2);
        assertEquals((double) num1 / num2, result);
    }

    @Test
    void calcDivide_shoudReturnNegativeNumWhenNum1OrNum2AreNegative() {
        int num1 = -12;

        double result = calcService.calcDivide(num1, num2);
        assertEquals((double) num1 / num2, result);
    }

    @Test
    void calcDivide_shoudReturnPositiveNumWhenNum1AndNum2AreNegative() {
        int num1 = -12;
        int num2 = -3;

        double result = calcService.calcDivide(num1, num2);
        assertEquals((double) num1 / num2, result);
    }

    @Test
    void calcDivide_shouldThrowExceptoinwhenNum2IsNull() {
        num2 = 0;

        DivideException result = assertThrows(DivideException.class,
                () -> calcService.calcDivide(num1, num2));
        assertEquals("Делить на ноль нельзя!", result.getMessage());
    }


}