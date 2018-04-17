package Lessons;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Roma");
        person.setAge(5);

        System.out.println("Name: " + person.getName() + ", " + "age: " + person.getAge());
    }
}

class Person{
   private String name;
   private int age;


   public void setName(String userName){
       if(userName.isEmpty()){
           System.out.println("Error!");
       }
       else {
           name = userName;
       }
   }

   public String getName(){
       return name;
   }

    public void setAge(int userAge){
        if (userAge < 0){
            System.out.println("Error!");
        }
        else {
            age = userAge;
        }
    }

    public int getAge(){
        return age;
    }

   int calculateYearsToRetirement(){
       int years = 65 - age;
       return years;
   }
   void speak(){
       for (int i = 0; i < 3; i++) {
           System.out.println("Имя " + name + ", " + "возраст " + age + " года");
       }
   }

   void sayHello(){
       System.out.println("Hello");
   }
}
