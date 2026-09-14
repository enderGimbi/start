package src.university;

import java.util.ArrayList;

public class StudentsGroup implements Trainees {
    private int numberOfGroup;
    private String facultyName;
    private int course;
    private ArrayList<Student> listOfStudents;

    public StudentsGroup() {
        this.numberOfGroup = 0;
        this.facultyName = "noname";
        this.course = 0;
        this.listOfStudents = new ArrayList<>();
    }

    public StudentsGroup(int numberOfGroup, String facultyName, int course) {
        this.numberOfGroup = numberOfGroup;
        this.facultyName = facultyName;
        this.course = course;
        this.listOfStudents = new ArrayList<>();
    }

    public StudentsGroup(int numberOfGroup, String facultyName, int course, ArrayList<Student> listOfStudents) {
        this.numberOfGroup = numberOfGroup;
        this.facultyName = facultyName;
        this.course = course;
        this.listOfStudents = listOfStudents;
    }

    public void expulsion(Student a) {
        this.listOfStudents.remove(a);
    }

    public void increaseAvgMark(Student a) {
        for (Student listOfStudent : this.listOfStudents) {
            if (listOfStudent == a) {
                listOfStudent.setAvgmark(listOfStudent.getAvgmark() + 1);
                return;
            }
        }
    }

    public void addStudent(Student newStudent){
        this.listOfStudents.add(newStudent);
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(ArrayList<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    @Override
    public String toString() {
        return String.format("Номер группы: %s\nНазвание факультета: %s\nНомер курса: %s\nСписок студентов: \n%s",numberOfGroup,facultyName,numberOfGroup,listOfStudents);
    }
}
