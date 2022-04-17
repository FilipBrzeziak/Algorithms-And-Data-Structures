package Algorytmy;

public class MergeSort {
    public void merge(Integer tablica[], int a, int b, int c) {
        int liczba1 = b - a + 1;
        int liczba2 = c - b;

        int lewa[] = new int[liczba1];
        int prawa[] = new int[liczba2];

        for (int i = 0; i < liczba1; ++i)
            lewa[i] = tablica[a + i];
        for (int j = 0; j < liczba2; ++j)
            prawa[j] = tablica[b + 1 + j];

        int i = 0, j = 0;

        int indeks = a;
        while (i < liczba1 && j < liczba2) {
            if (lewa[i] <= prawa[j]) {
                tablica[indeks] = lewa[i];
                i++;
            } else {
                tablica[indeks] = prawa[j];
                j++;
            }
            indeks++;
        }

        while (i < liczba1) {
            tablica[indeks] = lewa[i];
            i++;
            indeks++;
        }

        while (j < liczba2) {
            tablica[indeks] = prawa[j];
            j++;
            indeks++;
        }
    }

    public void sort(Integer arr[], int minalnyIndeks, int maksymalnyIndeks) {
        if (minalnyIndeks < maksymalnyIndeks) {
            int m = minalnyIndeks + (maksymalnyIndeks - minalnyIndeks) / 2;

            sort(arr, minalnyIndeks, m);
            sort(arr, m + 1, maksymalnyIndeks);

            merge(arr, minalnyIndeks, m, maksymalnyIndeks);
        }
    }

    public static void main(String args[]) {
        Integer tablica[] = {94, 1, 12, 77, 5, 11};
        MergeSort algorytm = new MergeSort();
        algorytm.sort(tablica, 0, tablica.length - 1);
        System.out.println("MergeSort");
        for (int i = 0; i < tablica.length; ++i) {
            System.out.print(tablica[i] + " ");
        }
    }
}
