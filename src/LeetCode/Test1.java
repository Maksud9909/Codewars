package LeetCode;

public class Test1 {
    public static void main(String[] args) {
        Person person = new Person("Maksud",19);

    }
}


class Person {
    String name;
      int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getInfo(){
        System.out.println(name + " " + age);
    }
}


class Employee extends Person{

    public Employee(String name, int age) {
        super(name, age);
    }
}


