package pro.sky.Calculator.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver;
import pro.sky.Calculator.exceptions.DivideException;

public class CalcService {

    public String hello() {
        return "Добрро пожаловать в калькулятор!";
    }

    public long calcPlus(int num1, int num2) {
        return (long) num1 + num2;
    }

    public long calcMinus(int num1, int num2) {
        return (long) num1 - num2;
    }

    public long calcMultiply(int num1, int num2) {
        return (long) num1 * num2;
    }

    public double calcDivide(int num1, int num2) {
        if (num2 == 0) {
            throw new DivideException("Делить на ноль нельзя!");
        }
        return (double) num1 / num2;
    }

}
