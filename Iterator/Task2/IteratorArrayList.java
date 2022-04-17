import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorArrayList<T> implements Iterator<T> {

    private int pozycja = 0;
    private ArrayList<T> arrayList;

    public IteratorArrayList(ArrayList<T> anArrayList) {
        this.arrayList = anArrayList;
    }

    @Override
    public boolean hasNext() {
        return pozycja < arrayList.size();
    }

    @Override
    public T next() throws NoSuchElementException {
        if (hasNext()) {
            return arrayList.get(pozycja++);
        } else {
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
