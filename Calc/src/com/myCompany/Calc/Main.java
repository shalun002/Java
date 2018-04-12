package com.myCompany.Calc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Выберите действие");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");

        Scanner scaner = new Scanner(System.in);

        int operator = scaner.nextInt();

        System.out.println("Введите первое число");
        int fistNumber = scaner.nextInt();
        System.out.println("Введите второе число");
        int secondNumber = scaner.nextInt();

        int result;
        if (operator == 1){
            result = fistNumber + secondNumber;
        }
        else if (operator == 2){
            result = fistNumber - secondNumber;
        }
        else if (operator == 3){
            result = fistNumber * secondNumber;
        }
        else {
            result = fistNumber / secondNumber;
        }

        System.out.println("Результат = " + result);

    }
}
