public class Klient {
    private String nazwaKlienta;
    private ListQueue<Zamowienie> kolejkaKlienta;

    public Klient(String nazwaKlienta) {
        this.nazwaKlienta = nazwaKlienta;
        this.kolejkaKlienta = new ListQueue<Zamowienie>();
    }

    public void dodajZamowienie(String nazwaTowaru, int liczbaSztuk, double cenaJednostkowa) throws FullQueueException {
        kolejkaKlienta.enqueue(new Zamowienie(nazwaTowaru, liczbaSztuk, cenaJednostkowa));
    }

    public ListQueue<Zamowienie> getKolejkaKlienta() {
        return kolejkaKlienta;
    }

    public String getNazwaKlienta() {
        return nazwaKlienta;
    }

    public void setKolejkaKlienta(ListQueue<Zamowienie> kolejkaKlienta) {
        this.kolejkaKlienta = kolejkaKlienta;
    }

    public void setNazwaKlienta(String nazwaKlienta) {
        this.nazwaKlienta = nazwaKlienta;
    }
}
