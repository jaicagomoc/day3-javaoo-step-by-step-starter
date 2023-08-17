package ooss;

public class Student extends Person {
    private Klass klass;
    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        StringBuilder printOutput = new StringBuilder();
        printOutput.append(" I am a student.");
        if (klass != null) {
            if (klass.getLeader() == this) {
                printOutput.append(" I am the leader of class ").append(klass.getNumber()).append(".");
            } else {
                printOutput.append(" I am in class ").append(klass.getNumber()).append(".");
            }
        }
        return super.introduce() + printOutput;
    }

    public boolean join(Klass klass) {
        this.klass = klass;
        return false;
    }

    public boolean isIn(Klass klass) {
        return this.klass != null && this.klass.getNumber() == klass.getNumber();
    }
}