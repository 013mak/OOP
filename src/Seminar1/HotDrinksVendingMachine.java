package Seminar1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine{

    private final List<Product> productList;
    private int money;

    public HotDrinksVendingMachine(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                money += product.getPrice();
                return product;
            }
        }
        return null;
    }
    public Tea getProduct(String name, int volume, int temperature) {
        for (Product product : productList) {
            if (product instanceof Tea) {
                if (product.getName().equals(name) && ((Tea) product).getTemperature() == temperature && ((Tea) product).getVolume() == volume){
                    money += product.getPrice();
                    return (Tea) product;
                }
            }
        }
        return null;
    }


    @Override
    public String toString() {
        return "HotDrinksVendingMachine{" +
                "productList=" + productList +
                ", money=" + money +
                '}';
    }
}
