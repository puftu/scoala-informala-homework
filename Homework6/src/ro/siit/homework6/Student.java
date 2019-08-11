package ro.siit.homework6;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    private String cnp;

    public Student(String firstName, String lastName, int year, int month, int day, String gender, String cnp) {

        if (firstName == "" || lastName == "") {
            throw new IllegalArgumentException("Last name and first name should not be empty");
        } else {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        LocalDate i = LocalDate.now();
        if (year < 1900 || year > (i.getYear() - 18)) {
            throw new IllegalArgumentException("date of birth between 1900 and current year - 18 ");
        } else {
            this.dateOfBirth = LocalDate.of(year, month, day);
        }

        if (gender.toLowerCase().endsWith("m") || gender.toLowerCase().endsWith("f")) {

            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Gender should be M or F");
        }


        this.cnp = cnp;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName) &&
                Objects.equals(dateOfBirth, student.dateOfBirth) &&
                Objects.equals(gender, student.gender) &&
                Objects.equals(cnp, student.cnp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dateOfBirth, gender, cnp);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", cnp='" + cnp + '\'' +
                '}';
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
