package Lessons;

import java.util.Random;

public class Multidimensional_arrays {
    public static void main(String[] args) {
        Random random = new Random();

        int row = 8;
        int col = 5;
        int [][] number = new int[row][col];
        for (int i = 0; i < number.length; i++){
            for (int j = 0; j < number[i].length; j++){
                number[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < number.length; i++){
            for (int j = 0; j < number[i].length; j++){
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }
}
