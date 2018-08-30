package com.kodilla.calculator;

public class Calculator {

    public int addAToB(int a, int b) {
        return a+b;
    }

    public int subtractBFromA(int a, int b) {
        return a-b;
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator();

        int a = 7;
        int b = 4;

        System.out.println(a + " + " + b + " = " + calculator.addAToB(a, b));
        System.out.println(a + " - " + b + " = " + calculator.subtractBFromA(a, b));
    }
}
