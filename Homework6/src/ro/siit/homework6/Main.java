package ro.siit.homework6;

public class Main {
    public static void main(String[] args) {
        try {
            Repository repo = new Repository();
            Student paul = new Student("Ionescu", "Paul", 1991, 2, 14, "m", "123");
            repo.add(paul);
            repo.add(new Student("Moromete", "Oana",1993,06,17,"f","234"));
//            repo.add(new Student("Gavrila", "Maria",1993,07,28,"a","456"));
//            repo.add(new Student("", "Vasile",1990,11,30,"m","234"));
            System.out.println(repo);
//            repo.list(29);
            repo.list(26);
            repo.delete("234");
//            repo.delete("111");
            System.out.println(repo);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}
