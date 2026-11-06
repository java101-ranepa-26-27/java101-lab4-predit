package ru.ranepa;

public class Student extends Person {
    private final GradeView grades;

    Student(long id, String name, GradeView grades) {
        super(id, name);
        this.grades = grades;
    }

    public double average() {
        return grades.average();
    }

    @Override
    public String report() {
        return "Студент " + getName() +
                " (№" + getId() + "): " + grades.describe();
    }
}
