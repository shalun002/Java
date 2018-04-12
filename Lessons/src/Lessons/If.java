package Lessons;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter please digit ");

        int a = scanner.nextInt();

        if (a > 0){
            System.out.println("Ok!!!");
        }
        else {
            System.out.println("Error!!!");
        }
    }
}
