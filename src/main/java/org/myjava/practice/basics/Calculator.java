package org.myjava.practice.basics;

import java.util.Scanner;

public class Calculator {
    public void add(int a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextByte();
        int b = scanner.nextByte();
        Calculator calculator = new Calculator();
        calculator.add(a,b);
    }
}
