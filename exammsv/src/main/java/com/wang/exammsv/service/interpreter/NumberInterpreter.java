package com.wang.exammsv.service.interpreter;

public class NumberInterpreter implements Interpreter {

    private final double number;
    NumberInterpreter(double number) {
        this.number = number;
    }
    NumberInterpreter(String number) {
        this.number = Double.valueOf(number);
    }

    @Override
    public double interpret() {
        return this.number;
    }
}
