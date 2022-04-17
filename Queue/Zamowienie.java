public class Zamowienie {
    private String nazwaTowaru;
    private int liczbaSztuk;
    private double cenaJednostkowa;

    public Zamowienie(String nazwaTowaru, int liczbaSztuk, double cenaJednostkowa) {
        this.cenaJednostkowa = cenaJednostkowa;
        this.liczbaSztuk = liczbaSztuk;
        this.nazwaTowaru = nazwaTowaru;
    }

    public double getCenaJednostkowa() {
        return cenaJednostkowa;
    }

    public int getLiczbaSztuk() {
        return liczbaSztuk;
    }

    public String getNazwaTowaru() {
        return nazwaTowaru;
    }

    public void setCenaJednostkowa(double cenaJednostkowa) {
        this.cenaJednostkowa = cenaJednostkowa;
    }

    public void setLiczbaSztuk(int liczbaSztuk) {
        this.liczbaSztuk = liczbaSztuk;
    }

    public void setNazwaTowaru(String nazwaTowaru) {
        this.nazwaTowaru = nazwaTowaru;
    }

    @Override
    public String toString() {
        return "Zamowienie{" +
                "nazwaTowaru='" + nazwaTowaru + '\'' +
                ", liczbaSztuk=" + liczbaSztuk +
                ", cenaJednostkowa=" + cenaJednostkowa +
                '}';
    }
}
