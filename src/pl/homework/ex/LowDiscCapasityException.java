package pl.homework.ex;

public class LowDiscCapasityException extends RuntimeException {
    public LowDiscCapasityException() {
        super("Pojemność dysku musi być większa od 0");
    }
}
