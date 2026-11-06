package ru.ranepa;

import java.util.ArrayList;
import java.util.List;

public class University {
    private final List<Student> students = new ArrayList<>();
    private final List<GradeBook> gradeBooks = new ArrayList<>();
    private long nextId = 1;

    public Student enroll(String name) {
        long id = nextId++;
        GradeBook book = new GradeBook(id);
        Student student = new Student(id, name, book);
        students.add(student);
        gradeBooks.add(book);
        return student;
    }

    public Student findById(long id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        throw new IllegalArgumentException("студент не найден");
    }

    public List<Student> all() {
        return new ArrayList<>(students);
    }

    public void grade(long id, int grade) {
        // TODO: найти зачётку по номеру и вызвать addGrade;
        //       если зачётки нет — IllegalArgumentException.
    }

    public double average(long id) {
        for (GradeBook book : gradeBooks) {
            if (book.getStudentId() == id) {
                return book.average();
            }
        }
        throw new IllegalArgumentException("зачётка не найдена");
    }
}
