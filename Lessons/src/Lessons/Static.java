package Lessons;

public class Static {
    public static void main(String[] args) {
        System.out.println(Math.mult(12, 3));
        System.out.println(Math.summ(25, 2));
        //System.out.println(Math.x);

        Math math = new Math();
        int newX = math.x * 3;

        System.out.println(newX);
        System.out.println(math.x);

    }
}

class Math {

    public static int x = 12;

    public static int summ(int a, int b) {
        return a + b;
    }

    public static int mult(int a, int b) {
        return a * b;
    }
}

