package beans.controller;

import beans.IAddOperation;

public class AddOperation implements IAddOperation {
    @Override
    public int calculate(int a, int b) {
        return a+b;
    }
}
