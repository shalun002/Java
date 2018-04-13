package Lessons;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int value;
        do {
            System.out.println("Enter 5");
            value = scaner.nextInt();
        } while(value != 5);
        System.out.println("You entered 5");
    }
}