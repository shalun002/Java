package com.myCompany.Cycles_new;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        int range = 100;

        System.out.println("Ваша задача угадать число от 0 до " + range);


        int number = (int)(Math.random() * range);

        while (true){
            System.out.println("Введите число");
            int input_number = scaner.nextInt();

                if(input_number == number){
                    System.out.println("Вы угадали");
                    break;
                }
                else if (input_number > number){
                    System.out.println("Загаданное число меньше");
                }
                else{
                    System.out.println("Загаданное число больше");
                }
        }
        scaner.close();
    }

}
