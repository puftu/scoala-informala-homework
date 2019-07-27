package ro.siit.homework4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Store {

    static Map<String, StockItem> stock;
    static List<SoldItem> sold;

    @Override
    public String toString() {
        return "Store{" +
                "stock=" + stock +
                ", sold=" + sold +
                '}';
    }

    public Store() {
        this.stock = new HashMap<>();
        this.sold = new ArrayList<>();
    }

    public static void add(StockItem product) {

        stock.forEach((k, v) -> {

            if (v.getProduct().getName() == product.getProduct().getName()) {
                int tQ = v.getQuantity() + product.getQuantity();
                v.setQuantity(tQ);
            }
        });


    }



    public static void sell(SoldItem product) {

        stock.forEach((k, v) -> {

            if (v.getProduct().getName() == product.getProduct().getName()) {
                if ((v.getQuantity() - product.getQuantity()) < 0) {
                    System.out.println("The stock is only " + v.getQuantity())
                    ;
                } else {
                    int rQ = v.getQuantity() - product.getQuantity();
                    v.setQuantity(rQ);
                    sold.add(product);
                }
            }
        });


    }

    public static void list(String s) {

        for(SoldItem temp :sold){
            if( temp.getSaleDate().endsWith(s)){
                System.out.println(temp);
            }
        }


    }
}



