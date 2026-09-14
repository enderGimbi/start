package src;

import university.Student;
import university.StudentsGroup;
import university.Trainees;

public class Main {
    public static void main(String[] args) {
        Trainees a = new StudentsGroup(1,"ПМиК",1);
        Student nn = new Student();
        a.addStudent(nn);
        a.increaseAvgMark(nn);
        a.increaseAvgMark(nn);



        System.out.printf("%s",a);
    }
}