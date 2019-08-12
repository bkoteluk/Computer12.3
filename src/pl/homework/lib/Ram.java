package pl.homework.lib;

import pl.homework.ex.HighFrequencyException;
import pl.homework.ex.LowAmountMemoryException;
import pl.homework.ex.LowFrequencyException;
import pl.homework.ex.TemperatureExcededException;

public class Ram extends Unit  {
    public static final double TEMP_DEPENDENCY = 0.15;
    public static final int MAX_TEMPERATURE = 70;

    private int amount;

    public Ram(String model, String producer, String serialNumber, double temperature, int clocking, int amount) throws LowFrequencyException, TemperatureExcededException, LowAmountMemoryException {
        super(model, producer, serialNumber);
        if (clocking >= 0) {
            setClocking(clocking);
        } else {
            throw new LowFrequencyException();
        }
        if (temperature > MAX_TEMPERATURE) {
            throw new TemperatureExcededException();
        } else {
            setTemperature(temperature);
        }
        setAmount(amount);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) throws LowAmountMemoryException {
        if (amount <= 0) {
            throw new LowAmountMemoryException();
        } else {
            this.amount = amount;
        }
    }

    @Override
    public void turnUpClocking(int frequency) throws HighFrequencyException {
        if ((getTemperature() + frequency*TEMP_DEPENDENCY) >= MAX_TEMPERATURE) {
            throw new HighFrequencyException();
        } else {
            setClocking(getClocking()+ frequency);
            setTemperature(getTemperature() + frequency*TEMP_DEPENDENCY);
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
        return ">>> RAM wielkość: " + amount + super.toString() + "; częstotliwość taktowania: " + getClocking() + "; temperatura: " + getTemperature() + "\n";
    }
}

