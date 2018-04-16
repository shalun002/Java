package Lessons;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Sergey";
        person.age = 32;
        person.speak();
        person.sayHello();
        System.out.println();
    }
}

class Person{
   String name;
   int age;

   void speak(){
       for (int i = 0; i < 3; i++) {
           System.out.println("Имя " + name + ", " + "возраст " + age + " года");
       }
   }

   void sayHello(){
       System.out.println("Hello");
    }
}
