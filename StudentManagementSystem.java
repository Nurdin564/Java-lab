import java.util.*;

class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int age;
    private Set<String> courses;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.courses = new HashSet<>(); 
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public Set<String> getCourses() { return courses; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name); 
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Courses: " + courses;
    }
}

class StudentManager {
    private Set<Student> students = new TreeSet<>();
    private Map<String, Set<Student>> courseIndex = new HashMap<>();

    public void addStudent(int id, String name, int age) {
        Student student = new Student(id, name, age);
        if (students.contains(student)) {
            System.out.println("Студент " + name + " уже существует.");
        } else {
            students.add(student);
            System.out.println("Студент " + name + " добавлен.");
        }
    }

    public void removeStudent(int id) {
        Student studentToRemove = null;
        for (Student student : students) {
            if (student.getId() == id) {
                studentToRemove = student;
                break;
            }
        }
        if (studentToRemove != null) {
            students.remove(studentToRemove);
            for (String course : studentToRemove.getCourses()) {
                courseIndex.get(course).remove(studentToRemove);
            }
            System.out.println("Студент с ID " + id + " удален.");
        } else {
            System.out.println("Студент с ID " + id + " не найден.");
        }
    }

    public void updateStudent(int id, String newName, Integer newAge, Set<String> newCourses) {
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student); 

                if (newName != null) student.setName(newName);
                if (newAge != null) student.setAge(newAge);
                if (newCourses != null) {
                    student.getCourses().clear();
                    student.getCourses().addAll(newCourses);
                }

                students.add(student);
                System.out.println("Данные студента обновлены: " + student);
                return;
            }
        }
        System.out.println("Студент с ID " + id + " не найден.");
    }


    public void displayAllStudents() {
        students.forEach(System.out::println);
    }

    public void searchStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("Найден студент: " + student);
                return;
            }
        }
        System.out.println("Студент с ID " + id + " не найден.");
    }

    public void listStudentsByCourse(String course) {
        Set<Student> enrolledStudents = courseIndex.get(course);
        if (enrolledStudents != null && !enrolledStudents.isEmpty()) {
            System.out.println("Студенты, записанные на курс '" + course + "':");
            enrolledStudents.forEach(System.out::println);
        } else {
            System.out.println("Никто не записан на этот курс.");
        }
    }


    public void enrollStudentInCourse(int id, String course) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.addCourse(course);
                courseIndex.putIfAbsent(course, new HashSet<>());
                courseIndex.get(course).add(student);
                System.out.println("Курс '" + course + "' добавлен студенту " + student.getName());
                return;
            }
        }
        System.out.println("Студент с ID " + id + " не найден.");
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.addStudent(101, "Alice", 20);
        manager.addStudent(102, "Bob", 21);
        manager.addStudent(103, "Charlie", 22);

        manager.enrollStudentInCourse(101, "Java Programming");
        manager.enrollStudentInCourse(102, "Data Structures");
        manager.enrollStudentInCourse(103, "Java Programming");
        manager.enrollStudentInCourse(101, "Machine Learning");

        System.out.println("\nСписок студентов (отсортировано по имени):");
        manager.displayAllStudents();

        System.out.println("\nПоиск студента 102:");
        manager.searchStudent(102);

        System.out.println("\nКто записан на 'Java Programming'?");
        manager.listStudentsByCourse("Java Programming");

        System.out.println("\nОбновление студента 101:");
        manager.updateStudent(101, "Alice Johnson", 21, Set.of("Python", "AI"));

        System.out.println("\nУдаление студента 102:");
        manager.removeStudent(102);

        System.out.println("\nИтоговый список студентов (по имени):");
        manager.displayAllStudents();
    }
}
