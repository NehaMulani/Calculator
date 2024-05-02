package com.example.calculator.domain;

public class Calculator {
    private String operation;
    private int num1;
    private int num2;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int Total()
    {
        return num1 + num2;
    }
    public int Sub()
    {
        return num1 - num2;
    }

    public int Multiply()
    {
        return num1 * num2;
    }

    public int Divide()
    {
        if (num2 == 0){
            throw new ArithmeticException("Divisor can mot be zero");
        }
        return num1 / num2;
    }



}
