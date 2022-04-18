import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class OdczytPliku {
    public RedBlackTree<String> redBlackTree = new RedBlackTree<String>();

    public OdczytPliku() {
        try {
            ArrayList<Wyraz> wyrazyArrayList = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            System.out.print("Podaj nazwe pliku: ");
            String nazwa = scanner.nextLine();
            Scanner plik = new Scanner(new File(nazwa));
            int numerWiersza = 1;

            while (plik.hasNext()) {

                String[] wyrazy = plik.nextLine().split("[.,?! -  ]");

                for (String wyraz : wyrazy) {

                    ArrayList<Integer> array = new ArrayList<>();
                    array.add(numerWiersza);

                    Wyraz wyraz1 = new Wyraz(wyraz, array);
                    boolean czyJestWLiscie = false;

                    if (wyrazyArrayList.size() == 0) {
                        wyrazyArrayList.add(wyraz1);
                    } else {
                        Wyraz wyrazPomocniczy = null;
                        for (Wyraz wyrazZArray : wyrazyArrayList) {
                            if (wyraz1.string.equals(wyrazZArray.string)) {
                                czyJestWLiscie = true;
                                wyrazPomocniczy = wyrazZArray;
                            }
                        }
                        if (czyJestWLiscie) {
                            array.addAll(wyrazPomocniczy.linesArrayList);
                            Wyraz nowyWyraz = new Wyraz(wyraz, array);
                            wyrazyArrayList.add(nowyWyraz);
                            wyrazyArrayList.remove(wyrazPomocniczy);

                        } else {
                            wyrazyArrayList.add(wyraz1);
                        }
                    }
                }
                numerWiersza++;

            }

            for (Wyraz wyraz : wyrazyArrayList) {
                if (wyraz.linesArrayList != null) {
                    redBlackTree.insert(wyraz.string, wyraz.linesArrayList);
                }
            }

            System.out.println("Skrowidz:");
            redBlackTree.across1();
            System.out.println("\n\n");
            redBlackTree.inOrder();
            plik.close();

        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public RedBlackTree<String> getRedBlackTree() {
        return redBlackTree;
    }
}
