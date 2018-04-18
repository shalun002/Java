package Lessons;



public class RobotManager
{
    public static void main(String[] args) {
        Robot robot1 = new Robot("Test Robot 1");
        Robot robot2 = new Robot("Test Robot 2");
        System.out.println(robot1);
        System.out.println(robot2);
    }
}
class Robot
{
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name = " + name;
    }
}
