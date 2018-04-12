package Lessons;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите что-нибудь");
        String str = scanner.nextLine();

        System.out.println("Вы ввели " + str);




    }
}
