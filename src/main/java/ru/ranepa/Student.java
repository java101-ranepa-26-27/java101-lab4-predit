package ru.ranepa;

public class Student {
    private final long id;
    private final String name;
    private final GradeBook grades;

    Student(long id, String name, GradeBook grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double average() {
        return grades.average();
    }

    public String report() {
        return "Студент " + name + " (№" + id + "): " + grades.describe();
    }
}
