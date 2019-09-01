package ro.siit.homework7;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Athlete {
    private int number;
    private String name;
    private String countryCode;
    LocalTime time;
    LocalTime finalTime;
    String shooting1;
    String shooting2;
    String shooting3;


    private LocalTime addtime(int a) {
        finalTime = finalTime.plus(a*10, ChronoUnit.SECONDS);
        return finalTime;
    }

    public Athlete(String number, String name, String countryCode, String time, String shooting1, String shooting2, String shooting3) {
        this.number = Integer.parseInt(number);
        this.name = name;
        this.countryCode = countryCode;
        this.time = LocalTime.parse(time);
        this.finalTime = LocalTime.parse(time);
        this.shooting1 = shooting1;
        this.shooting2 = shooting2;
        this.shooting3 = shooting3;

        int count1 = shooting1.length() - shooting1.replaceAll("o", "").length();
        addtime(count1);
        int count2 = shooting2.length() - shooting2.replaceAll("o", "").length();
        addtime(count2);
        int count3 = shooting3.length() - shooting3.replaceAll("o", "").length();
        addtime(count3);

    }


    @Override
    public String toString() {
        return "Athlete{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", time=" + time +
                ", finalTime=" + finalTime +
                ", shooting1='" + shooting1 + '\'' +
                ", shooting2='" + shooting2 + '\'' +
                ", shooting3='" + shooting3 + '\'' +
                '}';
    }

    public LocalTime getFinalTime() {
        return finalTime;
    }
}
