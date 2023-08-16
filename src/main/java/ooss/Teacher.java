package ooss;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private Klass klass;
    private List<Klass> assignedClasses = new ArrayList<>();;
    public Teacher(int id, String name, int age) {
        super(id, name, age);
        assignedClasses = new ArrayList<>();
    }
    @Override

    public String introduce() {
        StringBuilder printOutput = new StringBuilder();
        printOutput.append("My name is ").append(name).append(". I am").append(age)
                .append(" years old. I am a teacher.");
        if (!assignedClasses.isEmpty()){
            String classesString = assignedClasses.stream()
                    .map(klass -> "" + klass.getNumber())
                    .collect(Collectors.joining(", "));
            printOutput.append("I teach Class ").append(classesString).append(".");
        }
        return printOutput.toString();
    }
    public void assignTo(Klass klass) {
        assignedClasses.add(klass);
    }

    public boolean belongsTo(Klass klass) {
        return assignedClasses.contains(klass);
    }

    public boolean isTeaching(Student student) {
        for (Klass klass : assignedClasses) {
            if (student.join(klass)) {
                return true;
            }
        }
        return true;
    }

}