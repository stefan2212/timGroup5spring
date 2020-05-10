package beans;

import org.springframework.stereotype.Service;

@Service("calculatorBean")
public interface ICalculator {
     int calculate(int a, int b);
}
