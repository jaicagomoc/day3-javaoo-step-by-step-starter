package ooss;

import java.util.Objects;

public class Klass {

    private final int i;

    public Klass(int i) {

        this.i = i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klass klass = (Klass) o;
        return i == klass.i;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i);
    }
}
