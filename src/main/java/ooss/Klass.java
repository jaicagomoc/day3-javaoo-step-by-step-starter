package ooss;

import java.util.Objects;

public class Klass {
    private final int number;
    private Student leader;
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

    public void assignLeader(Student king) {
        leader = king != null ? king : null;
        if (leader == null) {
            System.out.println("It is not one of us.");
        }
    }
    public boolean isLeader(Student tom) {
        return leader != null && leader.equals(tom);
    }
}