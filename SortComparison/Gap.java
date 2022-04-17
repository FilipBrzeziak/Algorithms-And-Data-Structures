import java.util.ArrayList;
import java.util.LinkedList;

public class Gap {

    //przerwa z podpunktu A
    public static ArrayList<Integer> gapA(Integer[] tablica) {
        ArrayList<Integer> arrayListA = new ArrayList<>();
        int i = 1;
        arrayListA.add(i);
        while (i < tablica.length) {
            i = 3 * i + 1;
            arrayListA.add(i);
        }
        return arrayListA;
    }

    //przerwa z podpunktu B
    public static ArrayList<Integer> gapB(Integer[] tablica) {
        ArrayList<Integer> arrayListB = new ArrayList<>();
        int k = 1;
        int i = 0;
        while (i < tablica.length) {
            i = (int) Math.pow(2, k) - 1;
            arrayListB.add(i);
            k++;
        }

        return arrayListB;
    }

    //przerwa z podpunktu C
    public static ArrayList<Integer> gapC(Integer[] tablica) {
        ArrayList<Integer> arrayListC = new ArrayList<>();
        int k = 0;
        int i = 0;
        while (i < tablica.length) {
            i = (int) Math.pow(2, k) + 1;
            arrayListC.add(i);
            k++;
        }
        return arrayListC;
    }

    //przerwa z podpunktu D
    public static ArrayList<Integer> gapD(Integer[] tablica) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int wynik = 0;
        int ostatni = 1;
        int przedostatni = 1;
        arrayList.add(przedostatni);
        arrayList.add(ostatni);
        while (wynik < tablica.length) {
            wynik = ostatni + przedostatni;
            arrayList.add(wynik);
            przedostatni = ostatni;
            ostatni = wynik;
        }
        return arrayList;
    }

    //przerwa z podpunktu E
    public static ArrayList<Integer> gapE(Integer[] tablica) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int wynik = 0;
        linkedList.add(tablica.length / 2);
        while (wynik >= 1) {
            wynik = (int) (linkedList.getLast() * 0.75);
        }
        arrayList.addAll(linkedList);
        return arrayList;
    }
}
