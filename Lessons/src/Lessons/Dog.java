package Lessons;

public class Dog extends Animal {

    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }
    public void bark(){
        System.out.println("I am barking");
    }

    public void showName(String name){
        System.out.println("Dog name is - " + name);
    }

}
