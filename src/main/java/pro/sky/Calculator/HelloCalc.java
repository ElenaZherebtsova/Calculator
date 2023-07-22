package pro.sky.Calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCalc {
    private CalcService helloService = new CalcService();

    @GetMapping(path = "/calculator")
    public String hello() {
        return helloService.hello();
    }

    @GetMapping(path = "/calculator/plus")
    public String calcPlus(@RequestParam("num1") int num1,
                           @RequestParam("num2") int num2) {
        return helloService.calcPlus(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String calcMinus(@RequestParam("num1") int num1,
                            @RequestParam("num2") int num2) {
        return helloService.calcMinus(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String calcMultiply(@RequestParam("num1") int num1,
                               @RequestParam("num2") int num2) {
        return helloService.calcMultiply(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String calcDivide(@RequestParam("num1") int num1,
                             @RequestParam("num2") int num2) {
        return helloService.calcDivide(num1, num2);

    }

}
