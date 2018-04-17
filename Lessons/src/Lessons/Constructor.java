package Lessons;

public class Constructor {
    public static void main(String[] args) {
        Human2 human = new Human2(22);
        human.getInfo();
    }
}

class Human2{
    private String name;
    private int age;

    public Human2(){

    }

    public Human2(int age){
        this.age = age;
    }

    public Human2(String name){
        this.name = name;
    }

    public Human2(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void getInfo(){
        System.out.println(getName() + " " + getAge());
    }
}
