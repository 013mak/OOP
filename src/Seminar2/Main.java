package Seminar2;

public class Main {
    public static void main(String[] args) {
        Human man1 = new Human("Sergey");
        Human man2 = new Human("Ivan");
        Human man3 = new Human("Petr");
        Human man4 = new Human("Slon");






//        -------------------

        Market market = new Market();

        market.acceptToMarket(man1);
        market.acceptToMarket(man2);
        market.acceptToMarket(man3);
        market.acceptToMarket(man4);


        man1.setMakeOrder(true);
        man2.setMakeOrder(false);
        man3.setMakeOrder(false);
        man4.setMakeOrder(false);

        System.out.println(market.queue);
        market.update();
        System.out.println(market.queue);
    }
}
