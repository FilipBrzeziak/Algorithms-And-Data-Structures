import java.io.Serializable;

public abstract class Pracownik implements Serializable {

    private String nazwisko;
    private String imie;
    private long PESEL;
    private String stanowisko;
    private int staz;

    public Pracownik() {
        this.nazwisko = "Kowalski";
        this.imie = "Marian";
        this.PESEL = 465487999;
        this.stanowisko = "Miner";
        this.staz = 4;
    }

    public Pracownik(String nazwisko, String imie, long PESEL, String stanowisko, int staz) {
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.PESEL = PESEL;
        this.stanowisko = stanowisko;
        this.staz = staz;
    }

    public abstract double Pensja();

    public void Wyswietl() {
        System.out.printf("I %-10s I %-10s I %-12o I %-12s I %5o I%10.2fI\n", nazwisko, imie, PESEL, stanowisko, staz, Pensja());
    }

    @Override
    public String toString() {
        return nazwisko + ", " + imie + ", " + PESEL + ", " + stanowisko + ", " + staz + ", " + String.format("%.2f", Pensja());
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public int getStaz() {
        return staz;
    }

    public long getPESEL() {
        return PESEL;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setPESEL(long PESEL) {
        this.PESEL = PESEL;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public void setStaz(int staz) {
        this.staz = staz;
    }
}
