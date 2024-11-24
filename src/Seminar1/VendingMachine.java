package Seminar1;

import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {

    Product getProduct(String name);

//    private List<Product> productList;
//    private Integer money;
//
//    public VendingMachine() {
//        this.productList = initProduct();
//        this.money = 0;
//    }
//
//    public Product getProduct(String name) {
//        for (Product product : productList) {
//            if (product.getName().equals(name)) {
//                money += product.getPrice();
//                return product;
//            }
//        }
//        return null;
//    }
//
//    private List<Product> initProduct() {
//        List<Product> products = new ArrayList<Product>();
//        products.add(new Product("Вода", 25));
//        products.add(new Product("Печенье", 40));
//        products.add(new Product("Чипсы", 50));
//        return products;
//    }



}
