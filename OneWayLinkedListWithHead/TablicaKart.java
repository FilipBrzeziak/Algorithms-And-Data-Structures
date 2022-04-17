public class TablicaKart {
    private boolean[] tablica;

    public TablicaKart() {
        this.tablica = new boolean[52];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = false;
        }
    }

    public void dodajKarte(int wartosc, int kolor, boolean znacznik) {
        tablica[(kolor * 13) + (wartosc - 1)] = znacznik;
    }

    public void wyczysc() {
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = false;
        }
    }

    public boolean czyKartaJuzJest(int wartosc, int kolor) {
        return tablica[(kolor * 13) + (wartosc - 1)];
    }

    public int ileKart() {
        int liczbaKart = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i]) {
                liczbaKart++;
            }
        }
        return liczbaKart;
    }
}
