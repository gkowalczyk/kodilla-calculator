package com.kodilla;

 class CalculatorApp {

    public int getSum(int a, int b) {
        return a + b;
    }

    public int getSubtract(int a, int b) {
        return a - b;
    }
}

    public class calculator {
    public static void main(String[] args) {

       CalculatorApp calculator = new CalculatorApp();
      int sum= calculator.getSubtract(2,3);
      int sub= calculator.getSum(1,4);
        System.out.println("Sum a,b = " + sum);
        System.out.println("Sub a,b = " + sub);
    }

}
