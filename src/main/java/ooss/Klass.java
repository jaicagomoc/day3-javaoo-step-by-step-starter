package ooss;

import java.util.Objects;

public class Klass {
    private final int number;
    public Klass(int number){
        this.number = number;
    }

    @Override
    public boolean equals(Object otherItem) {
        if (this == otherItem) return true;
        if (otherItem == null || getClass() != otherItem.getClass()) return false;
        Klass klass = (Klass) otherItem;
        return number == klass.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    public Object getNumber() {
        return number;
    }
}