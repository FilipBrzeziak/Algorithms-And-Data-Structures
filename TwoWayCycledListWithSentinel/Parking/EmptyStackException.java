package BazaPracownikow.Parking;

public class EmptyStackException extends Exception {
    public EmptyStackException() {
        super("Stos jest pusty");
    }
}
