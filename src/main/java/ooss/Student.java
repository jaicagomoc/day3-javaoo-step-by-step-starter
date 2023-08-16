package ooss;

public class Student extends Person {


    private Klass klass;
    private Klass klass1;

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a student. I am in class 1.";
    }

    public void join(Klass klass) {
        this.klass = klass;
    }

    public boolean isIn(Klass klass) {
       return this.klass != null && this.klass.equals(klass);
    }

}
