package BazaPracownikow.Parking;

public class ListStack<E> implements IStack<E> {
    OneWayLinkedListWithHead list;

    public ListStack() {
        list = new OneWayLinkedListWithHead<E>();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public E pop() throws EmptyStackException {
        E value = (E) list.remove(0);
        if (value == null) throw new EmptyStackException();
        return value;
    }

    @Override
    public void push(E elem) throws FullStackException {
        list.add(0, elem);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public E top() throws EmptyStackException {
        E value = (E) list.get(0);
        if (value == null) throw new EmptyStackException();
        return value;
    }
}
