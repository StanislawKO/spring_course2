package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudent() {
        Student st1 = new Student("Stas Kozh", 4, 7.3);
        Student st2 = new Student("Nikolay Ivanov", 1, 8.1);
        Student st3 = new Student("Elena Sidorova", 2, 9.5);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Information from method getStudents:");
        System.out.println(students);
        return students;
    }
}
