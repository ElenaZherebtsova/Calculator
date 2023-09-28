package pro.sky.Calculator.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ParametrizedCalcServiceTest {

    CalcService calcService = new CalcService();
    @ParameterizedTest
    @MethodSource ("provideNums")
    void calcPlus(int num1, int num2) {
        long    result = calcService.calcPlus(num1, num2);

        assertEquals((long)num1 + num2, result);
    }

    @ParameterizedTest
    @MethodSource ("provideNums")
    void calcMinus(int num1, int num2) {
        long    result = calcService.calcMinus(num1, num2);

        assertEquals((long)num1 - num2, result);

    }

    @ParameterizedTest
    @MethodSource ("provideNums")
    void calcMultiply(int num1, int num2) {
        long    result = calcService.calcMultiply(num1, num2);

        assertEquals((long)num1 * num2, result);
    }

    @ParameterizedTest
    @MethodSource ("provideNums")
    void calcDivide(int num1, int num2) {
        double   result = calcService.calcDivide(num1, num2);
        System.out.println(result);
        assertEquals((double) num1 / num2, result);
    }
    private static Stream<Arguments> provideNums() {
        return Stream.of(
                Arguments.of(4, 3),
                Arguments.of(3, -6),
                Arguments.of(Integer.MAX_VALUE, Integer.MAX_VALUE)

        );
    }
}