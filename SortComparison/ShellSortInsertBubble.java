import java.util.ArrayList;

public class ShellSortInsertBubble {
    public static void sort(Integer[] tablica, int numer) {
        ArrayList<Integer> gapy = new ArrayList<>();
        switch (numer) {
            case 1:
                gapy = Gap.gapA(tablica);
                break;
            case 2:
                gapy = Gap.gapB(tablica);
                break;
            case 3:
                gapy = Gap.gapC(tablica);
                break;
            case 4:
                gapy = Gap.gapD(tablica);
                break;
            case 5:
                gapy = Gap.gapE(tablica);
                break;
        }
        gapy = Gap.gapA(tablica);
        int indeks = gapy.size() - 1;
        //insertsort
        while (indeks > 0) {
            int gap = gapy.get(indeks--);
            for (int i = gap; i < tablica.length; i++) {
                int j = i;
                while (j >= gap && tablica[j] < tablica[j - gap]) {//dwie petle wiec zlozonosc n^2
                    //petla while powoduje przesuniecie wszystskich elementow w prawo
                    //aby zrobic miejsce dla posortowanego elementu
                    swap(tablica, j, j - gap);
                    j = j - gap;
                }
            }
        }
        //bubblesort
        int gap = gapy.get(indeks);
        for (int i = gap; i < tablica.length; i++) {
            int j = i;
            while (j >= gap && tablica[j] < tablica[j - gap]) {//dwie petle wiec zlozonosc n^2
                //petla while powoduje przesuniecie wszystskich elementow w prawo
                //aby zrobic miejsce dla posortowanego elementu
                swap(tablica, j, j - gap);
                j = j - gap;
            }
        }
    }

    public static void swap(Integer[] tablica, int i, int j) {
        int temp = tablica[i];
        tablica[i] = tablica[j];
        tablica[j] = temp;
    }

    public static void main(String[] args) {
        Integer tablica[] = {94, 1, 12, 77, 5, 11};
        ShellSortInsertBubble.sort(tablica, 1);
        System.out.println("ShellSortInsertBubble");
        for (int i = 0; i < tablica.length; ++i) {
            System.out.print(tablica[i] + " ");
        }
    }
}
