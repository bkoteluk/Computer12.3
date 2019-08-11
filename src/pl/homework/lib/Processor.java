package pl.homework.lib;

import pl.homework.ex.HighFrequencyException;
import pl.homework.ex.LowFrequencyException;
import pl.homework.ex.TemperatureExcededException;

public class Processor extends Unit {
    public static final double TEMP_DEPENDENCY = 0.10;
    public static final int MAX_TEMPERATURE = 85;


    public Processor(String model, String producer, String sn, double temperature, int clocking) throws LowFrequencyException, TemperatureExcededException {
        super(model, producer, sn);
        if (clocking >= 0) {
            this.setClocking(clocking);
        } else {
            throw new LowFrequencyException();
        }
        if (temperature <= MAX_TEMPERATURE) {
            this.setTemperature(temperature);
        } else {
            throw new TemperatureExcededException();
        }
    }

    @Override
    public void turnUpClocking(int frequency) throws HighFrequencyException {
        if ((getTemperature() + frequency*TEMP_DEPENDENCY) >= MAX_TEMPERATURE) {
            throw new HighFrequencyException();
        } else {
            setClocking(getClocking() + frequency);
            setTemperature(getTemperature()+ frequency*TEMP_DEPENDENCY);
        }
    }

    @Override
    public void turnDownClocking(int frequency) throws LowFrequencyException {
        if (frequency >= getClocking()) {
            throw new LowFrequencyException();
        } else {
            setClocking(getClocking() - frequency);
            setTemperature(getTemperature() - frequency*TEMP_DEPENDENCY);
        }
    }

    @Override
    public String toString() {
        return ">>> procesor :" + super.toString() + "; częstotliwość taktowania: " + getClocking() + "; temperatura: " + getTemperature() + "\n";
    }
}
