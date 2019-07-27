package ro.siit.homework4;

public class Product {
    private String name;
    private double price;
    private double weight;
    private String selfLife;


    public Product(String name, double price, double weight, String selfLife) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.selfLife = selfLife;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", selfLife='" + selfLife + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public String getSelfLife() {
        return selfLife;
    }
}
