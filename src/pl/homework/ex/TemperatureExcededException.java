package pl.homework.ex;

public class TemperatureExcededException extends Exception {
    public TemperatureExcededException() {
        super("Zbyt wysoka temperatura");
    }
}
