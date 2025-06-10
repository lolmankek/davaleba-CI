package org.example;

public class Calculator {
    public double add (double a, double b){
        return a+ b;
    }
    public double subtract (double a, double b){
        return a- b;
    }
    public double multiply (double a, double b){
        return a * b;
    }
    public double divide (double a, double b){
        if (a == 0 || b == 0){
            throw new ArithmeticException("cannot divide by zero");
        }
        return a / b;
    }
}
