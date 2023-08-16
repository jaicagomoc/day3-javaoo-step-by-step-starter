package ooss;

public class Student extends Person {

    private Klass klass;
    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        return super.introduce()+ " I am a student. I am in class " + klass.getNumber() + ".";
    }

    public boolean join(Klass klass) {
        this.klass = klass;
        return false;
    }

    public boolean isIn(Klass klass) {
        return this.klass != null && this.klass.getNumber() == klass.getNumber();
    }
}