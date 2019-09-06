package ro.siit.hw8;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate birthDate;
    private Enum.Gender gender;

    public Person(String name, String birthDate, int gender) {
        this.name = name;
        this.birthDate = LocalDate.parse(birthDate);
        this.gender = Enum.Gender.getGender(gender);
    }
    public Person(String name, String birthDate, String gender) {
        this.name = name;
        this.birthDate = LocalDate.parse(birthDate);
        this.gender = Enum.Gender.getGender(gender);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", gender=" + gender +
                '}';
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getName() {
        return name;
    }

    public Enum.Gender getGender() {
        return gender;
    }
}
