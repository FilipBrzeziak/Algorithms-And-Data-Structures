public class ArrayStack<T> implements IStack<T> {

    private static final int domyslnyRozmiar = 16;
    T tablica[];
    int topindeks;

    @SuppressWarnings("unchecked")
    public ArrayStack(int rozmiar) {
        tablica = (T[]) (new Object[rozmiar]);
        topindeks = 0;
    }

    public ArrayStack() {
        this(domyslnyRozmiar);
    }

    @Override
    public boolean isEmpty() {
        return topindeks == 0;
    }

    @Override
    public boolean isFull() {
        return topindeks == tablica.length;
    }

    @Override
    public T pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        topindeks--;
        return tablica[topindeks];
    }

    @Override
    public void push(T element) throws FullStackException {
        if (isFull()) {
            throw new FullStackException();
        }
        tablica[topindeks] = element;
        topindeks++;
    }

    @Override
    public int size() {
        return topindeks;
    }

    @Override
    public T top() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return tablica[topindeks - 1];
    }

    public void reverse() throws EmptyStackException {
        T[] tablica1 = (T[]) (new Object[tablica.length]);
        int i = topindeks;
        int j = 0;

        while (!isEmpty()) {
            tablica1[i] = tablica[topindeks - 1];
            topindeks--;
            System.out.println(tablica[i]);
            System.out.println("dziala");
        }
        tablica = tablica1;
    }
}
