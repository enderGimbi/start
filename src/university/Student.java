package university;

public class Student {
    private String firstname;
    private String middlename;
    private String lastname;
    private int numberOfGroup;
    private int studentTicket;
    private int avgmark;

    public Student() {
        this.firstname = "noname";
        this.middlename = "";
        this.lastname = "";
        this.numberOfGroup = 0;
        this.studentTicket = 0;
        this.avgmark = 0;
    }

    public Student(String firstname, String middlename, String lastname, int numberOfGroup, int studentTicket) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.numberOfGroup = numberOfGroup;
        this.studentTicket = studentTicket;
    }

    public Student(String firstname, String middlename, String lastname, int numberOfGroup, int studentTicket, int avgmark) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.numberOfGroup = numberOfGroup;
        this.studentTicket = studentTicket;
        this.avgmark = avgmark;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public int getStudentTicket() {
        return studentTicket;
    }

    public void setStudentTicket(int studentTicket) {
        this.studentTicket = studentTicket;
    }

    public int getAvgmark() {
        return avgmark;
    }

    public void setAvgmark(int avgmark) {
        this.avgmark = avgmark;
    }

    @Override
    public String toString() {
        return String.format("ФИО: %s%s%s\nНомер группы: %s\nНомер студака: %s\nСредняя оценка: %s",firstname,middlename,lastname,numberOfGroup,studentTicket,avgmark);
    }
}
