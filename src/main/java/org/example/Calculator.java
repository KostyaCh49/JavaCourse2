package org.example;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = scanner.nextInt();
        char operator = scanner.next().charAt(0);
        int secondNum = scanner.nextInt();

        int result = 0;
        if (operator == '+') {
            result = firstNum + secondNum;
        } else if (operator == '-') {
            result = firstNum - secondNum;
        } else if (operator == '*') {
            result = firstNum * secondNum;
        } else if (operator == '/') {
            if (secondNum == 0) {
                System.out.println("Can't divide by zero!");
            } else {
                result = firstNum / secondNum;
            }
        }
        System.out.print("Result: " + result);
    }
}
