package pro.sky.Calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class CalcService {

    public String hello() {
        return "Добрро пожаловать в калькулятор!";
    }

    public String calcPlus(int num1, int num2) {
        int summ = num1 + num2;
        return num1 + " + " + num2 + " = " + summ;
    }


    public String calcMinus(int num1, int num2) {
        int minus = num1 - num2;
        return num1 + " - " + num2 + " = " + minus;
    }


    public String calcMultiply(int num1, int num2) {
        int multiply = num1 * num2;
        return num1 + " * " + num2 + " = " + multiply;
    }


    public String calcDivide(int num1, int num2) {
        int divide = num1 / num2;
        return num1 + " / " + num2 + " = " + divide;
    }

}
