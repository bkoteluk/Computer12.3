package pl.homework.ex;

public class LowFrequencyException extends Exception {
    public LowFrequencyException() {
        super("Zbyt niskie taktowanie - komputer przestanie działać");
    }
}
