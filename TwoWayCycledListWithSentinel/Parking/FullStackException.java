package BazaPracownikow.Parking;

public class FullStackException extends Exception {
    public FullStackException() {
        super("Stos jest pełny");
    }
}
