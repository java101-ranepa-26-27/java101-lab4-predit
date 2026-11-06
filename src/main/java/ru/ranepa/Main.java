package ru.ranepa;

public class Main {
    public static void main(String[] args) {
        University university = new University();
        Student anna = university.enroll("Анна");
        Teacher viktor = university.hireTeacher("Виктор", "история");
        Student boris = university.enroll("Борис");

        university.grade(anna.getId(), 4);
        university.grade(anna.getId(), 5);
        university.grade(anna.getId(), 3);

        System.out.println("Все люди университета:");

        for (int i = 0; i < university.getPeopleCount(); i++) {
            System.out.println(university.getPerson(i).report());
        }

        try {
            university.grade(viktor.getId(), 5);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println(university.findByName("Виктор").report());
        try {
            university.findByName("Иван");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println("Средний балл Анны: " +
                university.average(anna.getId()));


        // TODO: сценарий
        // 1. принять преподавателя
        // 2. поставить Анне оценки
        // 3. напечатать всех одним циклом
        // 4. попробовать оценить преподавателя — отказ
        // 5. найти человека по имени
        // 6. напечатать средний балл
    }
}
