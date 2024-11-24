package Seminar1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Product> products = new ArrayList<Product>();
        products.add(new Tea("Зеленый", 25, 90, 100));
        products.add(new Tea("Черный", 40, 80, 150));
        products.add(new Tea("С молоком", 50, 60, 200));


        HotDrinksVendingMachine hdVM = new HotDrinksVendingMachine(products);
        System.out.println(hdVM);

        hdVM.getProduct("Черный", 150, 80);
        System.out.println(hdVM);

    }
}
