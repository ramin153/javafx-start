package sample.tableView;

public class Student {

    private final String firstName;
    private final String lastName;
    private final Long studentId;

    public Student(String firstName, String lastName, Long studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getStudentId() {
        return studentId;
    }
}
