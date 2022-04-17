package BazaPracownikow.BazaPracownikow;

import java.io.Serializable;

public class Pracownik implements Serializable, Comparable {
    private String PESEL;
    private String nazwisko;
    private String imie;
    private String dataUrodzenia;
    private String stanowisko;
    private double pensja;
    private double staz;
    private double premia;
    private double przychod;

    public Pracownik(String PESEL, String nazwisko, String imie, String dataUrodzenia, String stanowisko, double pensja, double staz) {
        this.PESEL = PESEL;
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.dataUrodzenia = dataUrodzenia;
        this.stanowisko = stanowisko;
        this.pensja = pensja;
        this.staz = staz;
        this.premia = premia(staz, pensja);
        this.przychod = pensja + premia;
    }

    public double premia(double staz, double pensja) {
        double obliczonaPremia = 0;
        if (staz >= 20) {
            obliczonaPremia = pensja * 0.2;
        }
        if (staz >= 10 && staz < 20) {
            obliczonaPremia = pensja * 0.1;
        }
        return obliczonaPremia;
    }


    public String getStanowisko() {
        return stanowisko;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public double getPrzychod() {
        return przychod;
    }

    public String getImie() {
        return imie;
    }

    public String getPESEL() {
        return PESEL;
    }

    public String getDataUrodzenia() {
        return dataUrodzenia;
    }

    public double getPensja() {
        return pensja;
    }

    public double getPremia() {
        return premia;
    }

    public double getStaz() {
        return staz;
    }

    @Override
    public int compareTo(Object o) {
        return this.getPESEL().compareTo(((Pracownik) o).PESEL);
    }

    public void setStaz(double staz) {
        this.staz = staz;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public void setPESEL(String PESEL) {
        this.PESEL = PESEL;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setPremia(double premia) {
        this.premia = premia;
    }

    public void setDataUrodzenia(String dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    public void setPrzychod(double przychod) {
        this.przychod = przychod;
    }

    @Override
    public String toString() {
        return "BazaPracownikow.PracownikParking{" +
                "PESEL='" + PESEL + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", imie='" + imie + '\'' +
                ", dataUrodzenia='" + dataUrodzenia + '\'' +
                ", stanowisko='" + stanowisko + '\'' +
                ", pensja=" + pensja +
                ", staz=" + staz +
                ", premia=" + premia +
                ", przychod=" + przychod +
                '}';
    }
}
