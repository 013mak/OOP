package Seminar1;

public class Tea extends Product{

    private int temperature;
    private int volume;

    public Tea(String name, int price, int temperature, int volume) {
        super(name, price);
        this.temperature = temperature;
        this.volume = volume;
        }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Name:" + getName() + ", Price:" + getPrice() + ", Temperature:" + temperature + ", Volume:" + volume;
    }

}
