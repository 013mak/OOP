package Seminar2;

public abstract class Actor implements ActorBehaviour{
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    protected final String name;
    public Actor(String name) {
        this.name = name;
    }
    public abstract String getName();

    @Override
    public String toString() {
        return "Actor{" +
                "isTakeOrder=" + isTakeOrder +
                ", isMakeOrder=" + isMakeOrder +
                ", name='" + name + '\'' +
                '}';
    }
}

