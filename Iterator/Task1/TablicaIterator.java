import java.util.Iterator;
import java.util.NoSuchElementException;

public class TablicaIterator<T> implements Iterator<T> {

    private int pozycja = 0;
    private T[] tablica;

    public TablicaIterator(T[] tablica) {
        this.tablica = tablica;
    }

    @Override
    public boolean hasNext() {
        if (pozycja >= tablica.length || tablica[pozycja] == null) {
            return false;
        }
        return true;
    }

    @Override
    public T next() throws NoSuchElementException {
        if (hasNext()) {
            return tablica[pozycja++];
        } else {
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
