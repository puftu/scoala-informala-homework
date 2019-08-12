package ro.siit.homework6;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

public class Repository {
    Set<Student> set;

    public Repository() {
        set = new TreeSet<>(new NameComparator());
    }

    public Set add(Student a) {
        set.add(a);
        return set;
    }

    ;

    public Set delete(String a) {
        if (a.equals("")) {
            throw new IllegalArgumentException("ID should not be empty");

        } else {
            boolean exists = false;
            for (Student s : set) {

                if (s.getCnp().equals(a)) {
                    exists = true;
                    set.remove(s);
                    break;
                }

            }
            if (exists == false) {
                throw new IllegalArgumentException("ID does not exist");
            }
        }
        return set;
    }

    public void list(int a) {
        if (a <= 0) {
            throw new IllegalArgumentException("Age should be greater than 0");
        }

        for (Student s : set) {
            if (LocalDate.now().getYear() - s.getDateOfBirth().getYear() == a) {
                System.out.println(s);
                return;
            } else {
                throw new IllegalArgumentException("There is nobody with this age");
            }

        }

    }

    @Override
    public String toString() {
        return "Repository{" +
                "set=" + set +
                '}';
    }
}
