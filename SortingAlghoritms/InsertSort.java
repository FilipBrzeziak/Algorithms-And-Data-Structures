package Algorytmy;

public class InsertSort {
    public void sort(Integer tablica[]) {
        for (int i = 1; i < tablica.length; ++i) {
            int klucz = tablica[i];
            int j = i - 1;

            while (j >= 0 && tablica[j] > klucz) {
                tablica[j + 1] = tablica[j];
                j = j - 1;
            }
            tablica[j + 1] = klucz;
        }
    }

    public static void main(String args[]) {
        Integer tablica[] = {94, 1, 12, 77, 5, 11};
        InsertSort algorytm = new InsertSort();
        algorytm.sort(tablica);
        System.out.println("InsertSort");
        for (int i = 0; i < tablica.length; ++i) {
            System.out.print(tablica[i] + " ");
        }
    }
}
