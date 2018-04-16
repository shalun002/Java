package Lessons;

public class Array_of_String {
    public static void main(String[] args) {
        String[] str = new String[3];
        str[0] = "Hello";
        str[1] = "World";
        str[2] = "Java";

        for (int i = 0; i < str.length; i++){
            System.out.println(str[i]);
        }
        System.out.println();

        for (String string: str) {
            System.out.println(string);
        }

        System.out.println();

        int[] numbers = {1, 2, 3};
        int sum = 0;

        for (int num: numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
}
