public class Kolejka {
    Node przod;
    Node tyl;

    public Kolejka() {
        this.przod = null;
        this.tyl = null;
    }

    public void enqueue(Node node) {
        Node chwilowy = node;

        if (this.tyl == null) {
            this.przod = chwilowy;
            this.tyl = chwilowy;
        }

        this.tyl.next = chwilowy;
        this.tyl = chwilowy;

    }

    public void dequeue() {

        if (this.przod == null) {
            return;
        }

        Node chwilowy = this.przod;
        this.przod = this.przod.next;

        if (this.przod == null) {
            this.tyl = null;
        }

    }
}
