package beans;

public class AddOperation2 implements IAddOperation {
    @Override
    public int calculate(int a, int b) {
        return a-b;
    }
}
