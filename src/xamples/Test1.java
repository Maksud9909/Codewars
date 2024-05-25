package xamples;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        List<House> houses = null;
        Person person = new Person("Maksud",houses);
        System.out.println(person);
    }
}


class Person{
    String name;
    List<House> list = new ArrayList<>();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", list=" + list +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<House> getList() {
        return list;
    }

    public void setList(List<House> list) {
        this.list = list;
    }

    public Person(String name, List<House> list) {
        this.name = name;
        this.list = list;
    }
}


class House{
    String name;

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public House(String name) {
        this.name = name;
    }
}