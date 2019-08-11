package pl.homework.ex;

public class HighFrequencyException extends Exception {
    public HighFrequencyException() {
        super("Niedopuszczalnie wysoka częstotliwość taktowania");
    }
}
