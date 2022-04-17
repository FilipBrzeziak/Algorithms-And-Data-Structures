public class Main {
    public static void main(String[] args) throws FullQueueException, EmptyQueueException {

        //magazyn1
        Magazyn magazyn1 = new Magazyn();

        System.out.println("\nMagazyn 1:");
        Klient marian = new Klient("Marian Kowalski");
        marian.dodajZamowienie("plyty CD", 12, 0.99);
        marian.dodajZamowienie("tusz do drukarki", 3, 4);
        marian.dodajZamowienie("telefon xiaomi", 1, 1299);
        Klient karol = new Klient("Karol Marcyniuk");
        karol.dodajZamowienie("kabel HDMI", 2, 24.99);
        karol.dodajZamowienie("zegarek Apple", 1, 6999);
        karol.dodajZamowienie("Telewizor OLED", 1, 2899);
        Klient celina = new Klient("Celina Radziwil");
        celina.dodajZamowienie("sluchawki samsung", 2, 79);
        celina.dodajZamowienie("procesor AMD", 1, 599);
        celina.dodajZamowienie("suszarka do wlosow", 1, 129);
        magazyn1.dodajZamowienie(marian);
        magazyn1.dodajZamowienie(karol);
        magazyn1.dodajZamowienie(celina);
        magazyn1.realizujZgloszenie();
        magazyn1.realizujZgloszenie();
        magazyn1.realizujZgloszenie();

        //magazyn2
        Magazyn magazyn2 = new Magazyn();

        System.out.println("\nMagazyn 2:");
        Klient karolina = new Klient("Karolina Marczynska");
        karolina.dodajZamowienie("telefon Huwawei", 1, 2999);
        karolina.dodajZamowienie("drukarka", 1, 299);
        karolina.dodajZamowienie("sprezone powietrze", 14, 10.99);
        Klient maciej = new Klient("Maciej Sikorski");
        maciej.dodajZamowienie("tablet LG", 1, 999);
        maciej.dodajZamowienie("karta graficzna", 1, 2999);
        maciej.dodajZamowienie("monitor AOC", 3, 599);
        Klient daniel = new Klient("Daniel Kozar");
        daniel.dodajZamowienie("ladowarka 18V", 2, 59);
        daniel.dodajZamowienie("kalkulator naukowy", 1, 99);
        daniel.dodajZamowienie("pamiec RAM 8gb", 4, 229);
        magazyn2.dodajZamowienie(karolina);
        magazyn2.dodajZamowienie(maciej);
        magazyn2.dodajZamowienie(daniel);
        magazyn2.realizujZgloszenie();
        magazyn2.realizujZgloszenie();
        magazyn2.realizujZgloszenie();

        //firma
        System.out.println("\nFirma:");
        Firma firma = new Firma();
        firma.dodajMagazyn(magazyn1);
        firma.dodajMagazyn(magazyn2);
        firma.przychodFirmy();

    }
}
