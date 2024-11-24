package Seminar2;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour{

    List<Actor> queue = new ArrayList<Actor>();
    List<Actor> actorList = new ArrayList<>();
    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println("Пришел " + actor);
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actorList) {
        for (Actor actor : actorList) {
            System.out.println(actor + "вышел из магазина с заказом");
        }

    }

    @Override
    public void update() {
    takeOrders();
    giveOrders();
    releaseFromQueue();

    }

    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue) {
            if (!actor.isMakeOrder){
                actor.setMakeOrder(true);
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor : queue) {
           if (actor.isMakeOrder){
               actor.setTakeOrder(true);
           }
        }
    }

    @Override
    public void releaseFromQueue() {
        for (int i = 0; i < queue.size(); i++) {
            if (queue.get(i).isTakeOrder) {
                actorList.add(queue.get(i));
                queue.remove(i);


            }
            //        for (Actor actor : queue) {
//            if (actor.isTakeOrder){
//                actorList.add(actor);
//                queue.remove(actor);
//
//            }
//        }
        }
        releaseFromMarket(actorList);
    }
    @Override
    public String toString() {
        return "Market{" +
                "queue=" + queue +
                ", actorList=" + actorList +
                '}';
    }
}
