package ro.siit.homework4;

public class SoldItem extends StockItem {

    private  String saleDate;

    public SoldItem(Product product, int quantity, String saleDate){
        super(product, quantity);
        this.saleDate = saleDate;
    }

    public String getSaleDate() {
        return saleDate;
    }

    @Override
    public String toString() {
        return "SoldItem{" +
                "quantity=" + getQuantity()+
                ", product=" + getProduct() +
                ", saleDate='" + saleDate + '\'' +
                '}';
    }
}
