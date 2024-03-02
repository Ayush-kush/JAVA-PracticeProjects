package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Teacher tony = new Teacher(1,"Tony", 30000);
        Teacher bruce = new Teacher(2,"Bruce", 10000);
        Teacher rogers = new Teacher(3,"Rogers", 20000);
        List<Teacher> teachersList = new ArrayList<>();
        teachersList.add(tony);
        teachersList.add(bruce);
        teachersList.add(rogers);

        Student arun = new Student(1,"Arun", 6);
        Student anurag = new Student(2,"Anurag", 7);
        Student animesh = new Student(3,"Animesh", 7);
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(arun);
        studentsList.add(anurag);
        studentsList.add(animesh);


        School itm = new School(teachersList,studentsList);

        animesh.payFees(10000);
        System.out.println(itm.getTotalMoneyEarned());


    }
}