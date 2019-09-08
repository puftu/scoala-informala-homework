package ro.siit.homework4;

public class Menu {

    public static  Store initiateStore(){
        Product lapte = new Animal("lapte", 5.0, 1.0, "20/08/2019", 5);
        Product oua = new Animal("oua", 1.0, 0.1, "22/08/2019", 5);
        Product cheese = new Animal("cheese", 15.0, 1.0, "20/11/2019", 5);
        Product yogurt = new Animal("yogurt", 3.0, 0.3, "17/08/2019", 5);
        Product sourCream = new Animal("sourCream", 7.0, 0.3, "15/08/2019", 5);
        Product cartofi = new Vegetal("cartofi", 4, 1.0,"30/06/2020","A,B,C");
        Product morcovi = new Vegetal("morcovi", 5, 1.0,"30/10/2019","K,D,C");
        Product ceapa = new Vegetal("ceapa", 4, 1.0,"30/06/2020","A,D,");

        StockItem stockLapte = new StockItem(lapte, 0);
        StockItem stockOua = new StockItem(oua, 0);
        StockItem stockCheese = new StockItem(cheese, 0);
        StockItem stockYogurt = new StockItem(yogurt, 0);
        StockItem stockSourCream = new StockItem(sourCream, 0);
        StockItem stockCartofi = new StockItem(cartofi, 0);
        StockItem stockMorcovi = new StockItem(morcovi, 0);
        StockItem stockCeapa = new StockItem(ceapa, 0);


//        System.out.println(item1);

        Store store = new Store();

        store.stock.put("1", stockLapte);
        store.stock.put("2", stockOua);
        store.stock.put("3", stockCheese);
        store.stock.put("4", stockYogurt);
        store.stock.put("5", stockSourCream);
        store.stock.put("6", stockCartofi);
        store.stock.put("7", stockMorcovi);
        store.stock.put("8", stockCeapa);


        return store;
    }
}
