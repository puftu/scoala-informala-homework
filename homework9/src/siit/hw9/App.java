package siit.hw9;

import java.io.*;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void getPersonByMonth(String input, int month, String output) {

        List<Person> list = new ArrayList<>();
        try {
            BufferedReader inputStream1 = new BufferedReader(new FileReader(input));


            String fileLine;

            // We read the  file and create Person object with the data within
            while ((fileLine = inputStream1.readLine()) != null) {
                String[] data = fileLine.split(",");
                String e1 = data[0];
                String e2 = data[1];
                String e3 = data[2];

                list.add(new Person(e1, e2, e3));

            }


        } catch (IOException e) {
            System.out.println("File IO exception" + e.getMessage());
        }

        // Using Stream we filter the list of persoans by month, we sort it by first name and we save the new list
        List<Person> newlist = list.stream()
                .filter(s -> s.getBirthdate().getMonth().equals(Month.of(month)))
                .sorted((o1, o2) -> o1.getFirst_name().compareTo(o2.getFirst_name()))
                .collect(Collectors.toList());
        System.out.println(newlist);


        // We print  in a file the first and last name only of the persons in the new list
        try (PrintWriter pw = new PrintWriter(output)) {
            newlist.forEach((s -> pw.println(s.getFirst_name() + "," + s.getLast_name())));


        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");

        } catch (IOException e) {
            System.out.println("something messed up");

        }


    }
}
