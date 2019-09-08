package ro.siit.homework4;

public class Main {
    public static void main(String[] args) {

        Store store = Menu.initiateStore();

        Product lapte = new Animal("lapte", 5.0, 1.0, "20/08/2019", 5);
        Product yogurt = new Animal("yogurt", 3.0, 0.3, "17/08/2019", 5);
        Product sourCream = new Animal("sourCream", 7.0, 0.3, "15/08/2019", 5);
        Product cartofi = new Vegetal("cartofi", 4, 1.0, "30/06/2020", "A,B,C");
        Product morcovi = new Vegetal("morcovi", 5, 1.0, "30/10/2019", "K,D,C");
        StockItem stockLapte = new StockItem(lapte, 5);
        StockItem stockYogurt = new StockItem(yogurt, 10);
        StockItem stockSourCream = new StockItem(sourCream, 8);
        StockItem stockCartofi = new StockItem(cartofi, 20);
        StockItem stockMorcovi = new StockItem(morcovi, 12);
        SoldItem sellLapte1 = new SoldItem(lapte, 5, "27/07/2019");
        SoldItem sellSourCream = new SoldItem(sourCream, 3, "27/07/2019");
        SoldItem sellYogurt = new SoldItem(yogurt, 2, "26/07/2019");
        SoldItem sellMorcovi = new SoldItem(morcovi, 5, "27/07/2019");
        SoldItem sellCartofi = new SoldItem(cartofi, 3, "26/07/2019");

        store.add(stockLapte);
        store.add(stockYogurt);
        store.add(stockSourCream);
        store.add(stockCartofi);
        store.add(stockMorcovi);
        System.out.println(store);
        store.add(stockLapte);
        System.out.println(store);
        store.sell(sellLapte1);
        store.sell(sellSourCream);
        store.sell(sellYogurt);
        store.sell(sellMorcovi);
        store.sell(sellCartofi);
        System.out.println(store);

        store.list("26/07/2019");


    }


}
