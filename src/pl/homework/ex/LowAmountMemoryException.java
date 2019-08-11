package pl.homework.ex;

public class LowAmountMemoryException extends Exception {
    public LowAmountMemoryException() {
        super("Zbyt mała ilość pamięci RAM");
    }
}
