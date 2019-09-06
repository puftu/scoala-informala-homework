package ro.siit.hw8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

import static ro.siit.hw8.Enum.Gender.FEMALE;
import static ro.siit.hw8.Enum.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        try {
            long start = System.currentTimeMillis();
            BufferedReader inputStream1 = new BufferedReader(new FileReader("E:\\SIIT\\scoala-informala-homework\\homework8\\file1.txt"));
            BufferedReader inputStream2 = new BufferedReader(new FileReader("E:\\SIIT\\scoala-informala-homework\\homework8\\file2.txt"));
            List<Person> list = new ArrayList<>();

            String fileLine;

            // We read the first file and create Person object with the data within
            while ((fileLine = inputStream1.readLine()) != null) {
                String[] data = fileLine.split(",");
                String e1 = data[0];
                String e2 = data[1];
                String e3 = data[2];

                list.add(new Person(e1, e2, e3));
            }
            // We read the second file and create Person object with the data within
            while ((fileLine = inputStream2.readLine()) != null) {
                String[] data = fileLine.split(",");
                String e1 = data[0];
                String e2 = data[1];
                String e3 = data[2];
                int e4 = Integer.parseInt(e3);

                list.add(new Person(e1, e2, e4));
            }

            LocalDate now = LocalDate.now();
//          We loop through the list and search for the females whom's birthday is today and we wish them Happy Birthday!
            for (Person a : list) {
                if (a.getGender().equals(FEMALE) && (a.getBirthDate().getMonth()) == now.getMonth() && (a.getBirthDate().getDayOfMonth()) == now.getDayOfMonth()) {
                    System.out.println("Happy Birthday " + a.getName() + " " + a.getBirthDate().getYear());
                }
            }

            System.out.println(System.currentTimeMillis() - start);

        } catch (IOException e) {
            System.out.println("File IO exception" + e.getMessage());
        }

    }
}

