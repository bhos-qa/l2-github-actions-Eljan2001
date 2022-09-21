package org.example;

class Calculator {
    int multiplicate(int x, int y){
        return x*y;
    }
}


public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.multiplicate(2,5));
    }
}