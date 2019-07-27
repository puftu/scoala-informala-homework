package ro.siit.homework4;

public class Vegetal extends Product {

    private String vitamins;

    public Vegetal(String name, double price, double weight, String selfLife, String vitamins) {
        super(name, price, weight, selfLife);
        this.vitamins = vitamins;
    }

    @Override
    public String toString() {
        return "Vegetal{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", weight=" + getWeight() +
                ", selfLife='" + getSelfLife() + '\'' +
                ", vitamins='" + vitamins + '\'' +
                '}';
    }
}
