
public class Karta implements Comparable<Karta> {

    private int wartosc;
    private int kolor;
    private boolean znacznik;

    //konstruktor karty
    public Karta(int wartosc, int kolor, boolean znacznik) {
        this.wartosc = wartosc;
        this.kolor = kolor;
        this.znacznik = znacznik;
    }

    //metoda wyswietlajaca wartosc karty w sposob tekstowy
    public String wartosc(int wartosc) {
        String tekst = "Blad";
        switch (wartosc) {
            case 1: {
                tekst = "as";
                break;
            }
            case 2: {
                tekst = "2";
                break;
            }
            case 3: {
                tekst = "3";
                break;
            }
            case 4: {
                tekst = "4";
                break;
            }
            case 5: {
                tekst = "5";
                break;
            }
            case 6: {
                tekst = "6";
                break;
            }
            case 7: {
                tekst = "7";
                break;
            }
            case 8: {
                tekst = "8";
                break;
            }
            case 9: {
                tekst = "9";
                break;
            }
            case 10: {
                tekst = "10";
                break;
            }
            case 11: {
                tekst = "walet";
                break;
            }
            case 12: {
                tekst = "dama";
                break;
            }
            case 13: {
                tekst = "krol";
                break;
            }

        }
        return tekst;
    }

    //metoda wyswietlajaca kolor karty w sposob tekstowy
    public String kolor(int kolor) {
        String tekst = "Blad";
        switch (kolor) {
            case 0: {
                tekst = "kier";
                break;
            }
            case 1: {
                tekst = "karo";
                break;
            }
            case 2: {
                tekst = "trefl";
                break;
            }
            case 3: {
                tekst = "pik";
                break;
            }

        }
        return tekst;
    }

    //getery i setery
    public int getKolor() {
        return kolor;
    }

    public int getWartosc() {
        return wartosc;
    }

    public boolean isZnacznik() {
        return znacznik;
    }

    public void setKolor(int kolor) {
        this.kolor = kolor;
    }

    public void setWartosc(int wartosc) {
        this.wartosc = wartosc;
    }

    public void setZnacznik(boolean znacznik) {
        this.znacznik = znacznik;
    }

    @Override
    public String toString() {
        if (!znacznik) {
            return "()";
        } else {
            return wartosc(getWartosc()) + " " + kolor(getKolor());
        }
    }

    @Override
    public int compareTo(Karta o) {
        int result = this.wartosc - (o.getWartosc());
        if (result == 0) {
            result = this.kolor - (o.getKolor());
        }
        return result;
    }
}
