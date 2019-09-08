package ro.siit.homework5;

import java.util.ArrayList;
import java.util.List;

public class Hobby {
    private String name;
    private int frequency;
    private List<Adress> adress;

    public Hobby(String name, int frequency) {
        this.name = name;
        this.frequency = frequency;
        this.adress = new ArrayList<>();
    }

    public List<Adress> getAdress() {
        return adress;
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    public void addAdress(Adress a) {

        adress.add(a);
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", frequency=" + frequency +
                ", adress=" + adress +
                '}';
    }
}
