package ro.siit.homework4;

public class StockItem {
    private int quantity;
    private Product product;

    public StockItem(Product product, int quantity){
        this.quantity = quantity;
        this.product = product;
    }

    @Override
    public String toString() {
        return "StockItem{" +
                "quantity=" + quantity +
                ", product=" + product +
                '}';
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
