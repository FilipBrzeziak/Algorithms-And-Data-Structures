package Algorytmy;

public class QuickSort {
    public void sort(Integer tablica[], int minimalnyIndeks, int maksymalnyIndeks) {
        quickSort(tablica, minimalnyIndeks, maksymalnyIndeks);
    }

    static int podzial(Integer[] tablica, int low, int high) {
        int pivot = tablica[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (tablica[j] < pivot) {
                i++;
                swap(tablica, i, j);
            }
        }
        swap(tablica, i + 1, high);
        return (i + 1);
    }

    public void quickSort(Integer[] tablica, int minimalnyIndeks, int maksymalnyIndeks) {
        if (minimalnyIndeks < maksymalnyIndeks) {
            int podzial = podzial(tablica, minimalnyIndeks, maksymalnyIndeks);
            quickSort(tablica, minimalnyIndeks, podzial - 1);
            quickSort(tablica, podzial + 1, maksymalnyIndeks);
        }
    }

    public static void swap(Integer[] tablica, int i, int j) {
        int temp = tablica[i];
        tablica[i] = tablica[j];
        tablica[j] = temp;
    }

    public static void main(String[] args) {
        Integer tablica[] = {94, 1, 12, 77, 5, 11};
        QuickSort algorytm = new QuickSort();
        algorytm.quickSort(tablica, 0, tablica.length - 1);
        System.out.println("QuickSort");
        for (int i = 0; i < tablica.length; ++i) {
            System.out.print(tablica[i] + " ");
        }
    }
}
