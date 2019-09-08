package ro.siit.homework4;

public class Animal extends Product {

    private int storageTemp;

    public Animal(String name, double price, double weight, String selfLife, int storageTemp) {
        super(name, price, weight, selfLife);
        this.storageTemp = storageTemp;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", weight=" + getWeight() +
                ", selfLife='" + getSelfLife() + '\'' +
                ", storageTemp=" + storageTemp +
                '}';
    }
}
