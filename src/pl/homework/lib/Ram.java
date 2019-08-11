package pl.homework.lib;

import pl.homework.ex.HighFrequencyException;
import pl.homework.ex.LowFrequencyException;
import pl.homework.ex.TemperatureExeededException;

public class Ram extends Part implements Turnable {
    public static final double TEMP_DEPENDENCY = 0.15;
    public static final int MAX_TEMPERATURE = 70;

    private double temperature;
    private int clocking;
    private int amount;

    public Ram(String model, String producer, String sn, double temperature, int clocking, int amount) throws LowFrequencyException, TemperatureExeededException {
        super(model, producer, sn);
        if (clocking >= 0) {
            this.clocking = clocking;
        } else {
            throw new LowFrequencyException();
        }
        if (temperature > MAX_TEMPERATURE) {
            throw new TemperatureExeededException();
        } else {
            this.temperature = temperature;
        }
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) throws TemperatureExeededException {
        if (temperature > MAX_TEMPERATURE) {
            throw new TemperatureExeededException();
        } else {
            this.temperature = temperature;
        }
    }

    public double getClocking() {
        return clocking;
    }

    public void setClocking(int clocking) throws LowFrequencyException {
        if (clocking >= 0) {
            this.clocking = clocking;
        } else {
            throw new LowFrequencyException();
        }
    }

    @Override
    public void turnUpClocking(int frequency) throws HighFrequencyException {
        if ((temperature + frequency*TEMP_DEPENDENCY) >= MAX_TEMPERATURE) {
            throw new HighFrequencyException();
        } else {
            clocking += frequency;
            temperature += frequency*TEMP_DEPENDENCY;
        }
    }

    @Override
    public void turnDownClocking(int frequency) throws LowFrequencyException {
        if (frequency >= clocking) {
            throw new LowFrequencyException();
        } else {
            clocking -= frequency;
            temperature -= frequency*TEMP_DEPENDENCY;
        }
    }

    @Override
    public String toString() {
        return ">>> RAM wielkość: " + amount + super.toString() + "; częstotliwość taktowania: " + clocking + "; temperatura: " + temperature + "\n";
    }
}

