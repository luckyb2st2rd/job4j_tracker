package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    private static int minus(int b) {
        return b - x;
    }

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int i) {
        return i / x;
    }

    public int sumAllOperation(int z) {
        return sum(z) + multiply(z) + divide(z) + minus(z);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int result1 = calculator.multiply(5);
        System.out.println(result1);
        int result2 = Calculator.minus(10);
        System.out.println(result2);
        int result3 = calculator.divide(10);
        System.out.println(result3);
        int result4 = calculator.sumAllOperation(10);
        System.out.println(result4);
    }
}
