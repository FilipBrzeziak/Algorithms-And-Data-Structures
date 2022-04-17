import java.util.Random;
import java.util.Iterator;

public class ListaKart {

    private OneWayLinkedListWithHead<Karta> linkedList;
    private TablicaKart tablicaKart;

    public ListaKart() {
        this.linkedList = new OneWayLinkedListWithHead<>();
        this.tablicaKart = new TablicaKart();
    }

    public void utworzListe() {
        Random random = new Random();
        Iterator<Karta> iterator = linkedList.iterator();
        tablicaKart.wyczysc();
        linkedList.clear();
        int randomWartosc;
        int randomKolor;

        while ((randomWartosc = random.nextInt(15)) != 0) {
            if (randomWartosc != 14) {
                randomKolor = random.nextInt(4);


                //jezeli karta juz wystepuje to jej nie dodaje
                if (tablicaKart.czyKartaJuzJest(randomWartosc, randomKolor)) {
                    continue;
                }

                //jezeli nie wystepuje to szukam dla niej miejsca
                int pozycja = 0;
                while (iterator.hasNext()) {
                    pozycja++;
                    Karta karta = iterator.next();
                    if (karta.getWartosc() == randomWartosc) {
                        if (karta.getKolor() >= randomKolor) {
                            break;
                        }
                    }
                    if (!karta.isZnacznik()) {
                        break;
                    } else if (karta.getWartosc() > randomWartosc) {
                        break;
                    }
                }
                //dodanie kart do linkedlisty i tablicy
                linkedList.add(pozycja, new Karta(randomWartosc, randomKolor, true));
                tablicaKart.dodajKarte(randomWartosc, randomKolor, true);
            }

            //dodanie kart zakrytej
            else {
                linkedList.add(new Karta(-1, -1, false));
            }
        }
        System.out.println("Lista została utworzona!");
    }


    public void wyswietlListe() {
        Iterator<Karta> iterator = linkedList.iterator();
        System.out.println("Lista kart:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void wyswietlLiczbeElementow() {
        System.out.println("Liczba kart razem: " + linkedList.size());
        System.out.println("Liczba kart odkrytych: " + tablicaKart.ileKart());
        System.out.println("Liczba kart zakrytych: " + (linkedList.size() - tablicaKart.ileKart()));
    }

    public void wyswietlWartosc(int wartosc) {
        Iterator<Karta> iterator = linkedList.iterator();
        System.out.println("Lista kart o wybranej wartosci:");
        int karty = 0;
        while (iterator.hasNext()) {
            Karta karta = iterator.next();
            if (karta.getWartosc() == wartosc) {
                System.out.println(karta.toString());
                karty++;
            }
        }
        if (karty == 0) {
            System.out.println("Uwaga! Brak kart o podanej wartosci");
        }
    }

    public void wyswietlKolor(int kolor) {

        Iterator<Karta> iterator = linkedList.iterator();
        System.out.println("Lista kart o wybranym kolorze:");
        int karty = 0;
        while (iterator.hasNext()) {
            Karta karta = iterator.next();
            if (karta.getKolor() == kolor) {
                System.out.println(karta.toString());
                karty++;
            }
        }
        if (karty == 0) {
            System.out.println("Uwaga! Brak kart o podanej wartosci");
        }
    }

    public void usunZakryte() {
        Iterator<Karta> iterator = linkedList.iterator();
        int pozycja = 0;
        while (iterator.hasNext()) {
            Karta karta = iterator.next();
            if (!karta.isZnacznik()) {
                linkedList.remove(pozycja);
            }
            pozycja++;
        }

        System.out.println("Karty zakryte zostaly usuniete!");

    }
}
