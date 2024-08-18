package LeetCode;

public class Test1 {
    public static void main(String[] args) {


    }
}


class Person{
     static String name;
     static int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void getPerson(){
        System.out.println(name + " " + age);
    }


}


class Employee extends Person{

    public Employee(String name, int age) {
        super(name, age);
    }


}


interface Go{

    default void getMessage(){
        System.out.println("Hello");
    }
}