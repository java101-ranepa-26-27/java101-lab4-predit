package ru.ranepa;

public class Main {
    public static void main(String[] args) {
        University university = new University();
        Student anna = university.enroll("Анна");
        System.out.println(anna.report());

        // TODO: сценарий
        // 1. принять преподавателя
        // 2. поставить Анне оценки
        // 3. напечатать всех одним циклом
        // 4. попробовать оценить преподавателя — отказ
        // 5. найти человека по имени
        // 6. напечатать средний балл
    }
}
