public class PracownikGodzinowy extends Pracownik {

    private double stawka;
    private int liczbaGodzin;

    public PracownikGodzinowy() {
        super();
        this.liczbaGodzin = 160;
        this.stawka = 45;
    }

    public PracownikGodzinowy(String nazwisko, String imie, long PESEL, String stanowisko, int staz, double stawka, int liczbaGodzin) {
        super(nazwisko, imie, PESEL, stanowisko, staz);
        this.liczbaGodzin = liczbaGodzin;

    }

    public double Pensja() {
        return stawka * liczbaGodzin;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + liczbaGodzin + ", " + stawka;
    }

    public int getLiczbaGodzin() {
        return liczbaGodzin;
    }

    public double getStawka() {
        return stawka;
    }

    public void setLiczbaGodzin(int liczbaGodzin) {
        this.liczbaGodzin = liczbaGodzin;
    }

    public void setStawka(double stawka) {
        this.stawka = stawka;
    }
}
