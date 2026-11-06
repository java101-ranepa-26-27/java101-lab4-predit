package ru.ranepa;

public abstract class Person {
    private final long id;
    private final String name;

    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public abstract String report();
}