package BazaPracownikow.Parking;

public class PracownikParking {
    private String imie;
    private String nazwisko;
    private String samochod;

    public PracownikParking(String imie, String nazwisko, String samochod) {
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.samochod = samochod;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getSamochod() {
        return samochod;
    }

    @Override
    public String toString() {
        return "PracownikParking{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", samochod='" + samochod + '\'' +
                '}';
    }
}
