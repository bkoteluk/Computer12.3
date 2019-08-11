package pl.homework.lib;

public abstract class Unit extends Part implements Turnable{
    private double temperature;
    private int clocking;

    public Unit(String model, String producer, String sn) {
        super(model, producer, sn);
    }

    public Unit(String model, String producer, String sn, double temperature, int clocking) {
        super(model, producer, sn);
        setTemperature(temperature);
        setClocking(clocking);
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getClocking() {
        return clocking;
    }

    public void setClocking(int clocking) {
        this.clocking = clocking;
    }
}
