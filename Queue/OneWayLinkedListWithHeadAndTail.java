import java.util.AbstractList;
import java.util.Iterator;

public class OneWayLinkedListWithHeadAndTail<E> extends AbstractList<E> {
    //element
    private class Element {
        private E value;
        private Element next;

        public Element(E value) {
            this.value = value;
            next = null;
        }

        public E getValue() {
            return value;
        }

        public Element getNext() {
            return next;
        }

        public void setValue(E value) {
            this.value = value;
        }

        public void setNext(Element next) {
            this.next = next;
        }
    }

    //iterator
    private class InnerIterator implements Iterator<E> {
        Element actElem;

        public InnerIterator() {
            this.actElem = head;
        }

        @Override
        public boolean hasNext() {
            return (actElem != null);
        }

        @Override
        public E next() {
            E value = actElem.getValue();
            actElem = actElem.getNext();
            return value;
        }
    }

    //metody listy
    Element head = null;
    Element tail = null;

    @Override
    public boolean add(E element) {
        Element newElem = new Element(element);

        if (head == null) {
            head = newElem;
            tail = newElem;
            return true;
        } else {

            tail.setNext(newElem);
            tail = newElem;
            return true;
        }
    }

    @Override
    public void add(int index, E element) {
        if (index < 0) return;

        Element newElem = new Element(element);

        if (index == 0) {
            newElem.setNext(head);
            head = newElem;
            return;
        }

        Element actElem = getElement(index - 1);

        if (actElem == null)
            return;

        newElem.setNext(actElem.getNext());
        actElem.setNext(newElem);
    }

    @Override
    public E get(int index) {
        Element actElem = getElement(index);
        return (actElem == null ? null : actElem.getValue());
    }

    @Override
    public E set(int index, E value) {
        Element actElem = getElement(index);

        if (actElem == null)
            return null;

        E oldValue = actElem.getValue();
        actElem.setValue(value);
        return oldValue;
    }

    @Override
    public E remove(int index) {
        if (head == null)
            return null;

        if (index == 0) {
            E oldValue = head.getValue();
            head = head.getNext();
            return oldValue;
        }

        Element actElem = getElement(index - 1);

        if (actElem == null || actElem.getNext() == null) {
            return null;
        }

        E oldValue = actElem.getNext().getValue();
        actElem.setNext(actElem.getNext().getNext());
        return oldValue;
    }

    @Override
    public boolean isEmpty() {
        return (head == null);
    }

    @Override
    public void clear() {
        head = null;
    }

    public Element getElement(int index) {
        Element actElem = head;

        while (index > 0 && actElem != null) {
            actElem = actElem.getNext();
            index--;
        }

        return actElem;
    }

    @Override
    public int size() {
        int pos = 0;
        Element actElem = head;

        while (actElem != null) {
            actElem = actElem.getNext();
            pos++;
        }

        return pos;
    }

    @Override
    public Iterator<E> iterator() {
        return new InnerIterator();
    }
}
