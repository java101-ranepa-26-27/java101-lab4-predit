package ru.ranepa;

public class Teacher extends Person {
    private final String subject;

    Teacher(long id, String name, String subject) {
        super(id, name);
        this.subject = subject;
    }

    @Override
    public String report() {
        return "Преподаватель " + getName() +
                " (№" + getId() + "): предмет — " + subject;
    }
}