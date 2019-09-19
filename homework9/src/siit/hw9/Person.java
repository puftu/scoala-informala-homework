package siit.hw9;

import java.time.LocalDate;

public class Person {

    private String first_name;
    private String last_name;
    private LocalDate birthdate;

    public Person(String first_name, String last_name, String birthdate) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.birthdate = LocalDate.parse(birthdate);
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}
