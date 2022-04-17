public class PracownikEtatowy extends Pracownik {

    private double etat;
    private double stawka;

    public PracownikEtatowy() {
        super();
        this.etat = 0.5;
        this.stawka = 2700;
    }

    public PracownikEtatowy(String nazwisko, String imie, long PESEL, String stanowisko, int staz, double etat, double stawka) {
        super(nazwisko, imie, PESEL, stanowisko, staz);
        this.etat = 1;
        this.stawka = 2700;
    }

    public double Pensja() {
        return etat * stawka;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + etat + ", " + stawka;
    }

    public double getEtat() {
        return etat;
    }

    public double getStawka() {
        return stawka;
    }

    public void setStawka(double stawka) {
        this.stawka = stawka;
    }

    public void setEtat(double etat) {
        this.etat = etat;
    }
}
