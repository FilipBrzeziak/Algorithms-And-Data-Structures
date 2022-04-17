
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class ListaKart {

    private ArrayList<Karta> arraylist;

    public ListaKart() {
        this.arraylist = new ArrayList<>();
    }

    public void utworzListe() {
        Random random = new Random();
        int randomWartosc;
        int randomKolor;

        while ((randomWartosc = random.nextInt(14)) != 0) {
            randomKolor = random.nextInt(4);

            if (arraylist.isEmpty()) {
                arraylist.add(new Karta(randomWartosc, randomKolor));
            } else {

                for (int i = 0; i < arraylist.size(); i++) {

                    if (arraylist.get(i).getWartosc() >= randomWartosc) {

                        if (arraylist.get(i).getKolor() >= randomKolor) {

                            arraylist.add(i, new Karta(randomWartosc, randomKolor));
                            break;
                        }

                        break;
                    } else if (i == arraylist.size() - 1) {

                        arraylist.add(new Karta(randomWartosc, randomKolor));
                        break;
                    }

                }
            }
        }
        System.out.println("Lista została utworzona!");
    }


    public void wyswietlListe() {
        System.out.println("Lista kart:");
        for (Karta karta : arraylist) {
            System.out.println(karta.toString());
        }
    }

    public void wyswietlWartosc(int wartosc) {
        System.out.println("Lista kart o wybranej wartosci:");
        IteratorArrayList<Karta> iterator = new IteratorArrayList<>(arraylist);
        while (iterator.hasNext()) {
            Karta karta = iterator.next();
            if (karta.getWartosc() == wartosc) {
                System.out.println(karta.toString());
            }
        }
    }

    public void wyswietlKolor(int kolor) {
        System.out.println("Lista kart o wybranym kolorze:");
        IteratorArrayList<Karta> iterator = new IteratorArrayList<>(arraylist);
        while (iterator.hasNext()) {
            Karta karta = iterator.next();
            if (karta.getKolor() == kolor) {
                System.out.println(karta.toString());
            }
        }
    }

    public void usunPowtorki() {
        TreeSet<Karta> treeSet = new TreeSet<>();
        treeSet.addAll(arraylist);
        arraylist.clear();
        arraylist.addAll(treeSet);
        System.out.println("Powtorki zostaly usuniete!");

    }

    public void wyswietlLiczbeElementow() {
        System.out.println("Liczba elemetow listy to: " + arraylist.size());
    }

    public ArrayList<Karta> getArraylist() {
        return arraylist;
    }

    public void setArraylist(ArrayList<Karta> arraylist) {
        this.arraylist = arraylist;
    }
}
