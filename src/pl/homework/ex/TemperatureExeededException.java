package pl.homework.ex;

public class TemperatureExeededException extends Exception {
    public TemperatureExeededException() {
        super("Zbyt wysoka temperatura");
    }
}
