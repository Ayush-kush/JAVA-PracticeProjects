package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Teacher> teachers;
    private List<Student> students;

    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher newTeacher) {
        this.teachers.add(newTeacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student newStudent) {
        this.students.add(newStudent);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent += moneySpent;
    }
    public int getTotalProfit(){
        return (totalMoneyEarned-totalMoneySpent);
    }
}
