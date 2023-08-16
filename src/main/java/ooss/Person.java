package ooss;

import java.util.Objects;

public class Person {
    private final int id;
    protected final String name;
    protected final int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public String introduce() {
        return String.format("My name is %s. I am %d years old.",name,age);
    }

    public boolean equals(Object otherItem) {
        if (this == otherItem) return true;
        if (otherItem == null || getClass() != otherItem.getClass()) return false;
        Person person = (Person) otherItem;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}