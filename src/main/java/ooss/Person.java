package ooss;

public class Person {

    private final String name;
    private final int age;

    public Person(int id, String name, int age
    ) {
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        return String.format("My name is %s. I am %d years old.",name,age);
    }
}
