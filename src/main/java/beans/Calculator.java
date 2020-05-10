package beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Calculator implements ICalculator {

    @Autowired
    private IAddOperation addOperation;

    @Override
    public int calculate(int a, int b) {
        return addOperation.calculate(a, b);
    }
}
