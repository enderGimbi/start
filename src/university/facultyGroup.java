package university;

import java.util.ArrayList;

public class facultyGroup implements Trainees {
    private String facultyName;
    private ArrayList<Student> listOfStudents;

    public facultyGroup() {
        this.facultyName = "noname";
        this.listOfStudents = new ArrayList<>();
    }

    public facultyGroup(String facultyName) {
        this.facultyName = facultyName;
        this.listOfStudents = new ArrayList<>();
    }

    public facultyGroup(String facultyName, ArrayList<Student> listOfStudents) {
        this.facultyName = facultyName;
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

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(ArrayList<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    @Override
    public String toString() {
        return String.format("Название факультета: %s\nСписок студентов: \n%s",facultyName,listOfStudents);
    }
}
