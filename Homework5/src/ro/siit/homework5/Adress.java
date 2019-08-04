package ro.siit.homework5;

public class Adress {
    private String county;
    private String country;

    public Adress(String county, String country) {
        this.county = county;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "county='" + county + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
