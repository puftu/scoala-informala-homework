package ro.siit.homework7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {


        String fileLine;

        // We read data from a csv file
        try {
            BufferedReader inputStream = new BufferedReader(new FileReader("E:\\SIIT\\scoala-informala-homework\\src\\ro\\siit\\homework7\\AthleteData.txt"));
            // We create a set where we will put our Athlete objects and we implement a comparator that will automatically sort by final standing
            Set<Athlete> set = new TreeSet<>(new TimeComparator());
            System.out.println("Final Standings:");

            // We separate the csv file into multiple strings and we use those string to create Athlete objects
            while ((fileLine = inputStream.readLine()) != null) {
                String[] data = fileLine.split(",");

                String e1 = data[0];
                String e2 = data[1];
                String e3 = data[2];
                String e4 = data[3];
                String e5 = data[4];
                String e6 = data[5];
                String e7 = data[6];
                set.add(new Athlete(e1, e2, e3, e4, e5, e6, e7));

            }
            int i = 1;
            for (Athlete a : set){
                System.out.println(i+"." + a.getName() + " " + a.getFinalTime());
                i++;

            }

//            System.out.println(set);
        } catch (IOException io) {
            System.out.println("File IO exception" + io.getMessage());
        }
    }
}