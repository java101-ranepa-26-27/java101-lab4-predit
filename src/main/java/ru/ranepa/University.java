    package ru.ranepa;

    public class University {
        private final Person[] people = new Person[100];
        private final GradeBook[] gradeBooks = new GradeBook[100];

        private int peopleCount = 0;
        private int bookCount = 0;
        private long nextId = 1;

        public Student enroll(String name) {
            long id = nextId++;

            GradeBook book = new GradeBook(id);
            Student student = new Student(id, name, book);

            people[peopleCount] = student;
            peopleCount++;

            gradeBooks[bookCount] = book;
            bookCount++;

            return student;
        }

        public Teacher hireTeacher(String name, String subject) {
            long id = nextId++;

            Teacher teacher = new Teacher(id, name, subject);

            people[peopleCount] = teacher;
            peopleCount++;

            return teacher;
        }

        public Person findById(long id) {
            for (int i = 0; i < peopleCount; i++) {
                if (people[i].getId() == id) {
                    return people[i];
                }
            }

            throw new IllegalArgumentException("человек не найден");
        }

        public Person findByName(String name) {
            for (int i = 0; i < peopleCount; i++) {
                if (people[i].getName().equals(name)) {
                    return people[i];
                }
            }

            throw new IllegalArgumentException(
                    "человек с именем " + name + " не найден");
        }

        public int getPeopleCount() {
            return peopleCount;
        }

        public Person getPerson(int index) {
            return people[index];
        }

        public void grade(long id, int grade) {
            for (int i = 0; i < peopleCount; i++) {
                if (people[i].getId() == id) {

                    if (people[i] instanceof Student) {
                        for (int j = 0; j < bookCount; j++) {
                            if (gradeBooks[j].getStudentId() == id) {
                                gradeBooks[j].addGrade(grade);
                                return;
                            }
                        }

                        throw new IllegalArgumentException("зачётка не найдена");
                    }

                    throw new IllegalArgumentException(
                            "преподавателю нельзя поставить оценку");
                }
            }

            throw new IllegalArgumentException("человек не найден");
        }

        public double average(long id) {
            for (int i = 0; i < bookCount; i++) {
                if (gradeBooks[i].getStudentId() == id) {
                    return gradeBooks[i].average();
                }
            }

            throw new IllegalArgumentException("зачётка не найдена");
        }
    }