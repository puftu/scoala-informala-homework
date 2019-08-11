package ro.siit.homework6;

public class Main {
    public static void main(String[] args) {
        try {
            Student paul = new Student("Luchian", "Paul", 2001, 2, 14, "b", "123");
            System.out.println(paul);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

//        System.out.println(paul.dateOfBirth.getYear());

    }
}
