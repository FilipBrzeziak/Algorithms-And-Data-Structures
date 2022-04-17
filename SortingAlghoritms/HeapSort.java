package Algorytmy;

public class HeapSort {
    public void sort(Integer tablica[]) {
        for (int i = tablica.length / 2 - 1; i >= 0; i--)
            heapify(tablica, tablica.length, i);

        for (int i = tablica.length - 1; i > 0; i--) {

            int temp = tablica[0];
            tablica[0] = tablica[i];
            tablica[i] = temp;
            heapify(tablica, i, 0);
        }
    }

    public void heapify(Integer tablica[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && tablica[l] > tablica[largest]) {
            largest = l;
        }

        if (r < n && tablica[r] > tablica[largest]) {
            largest = r;
        }

        if (largest != i) {
            int swap = tablica[i];
            tablica[i] = tablica[largest];
            tablica[largest] = swap;

            heapify(tablica, n, largest);
        }
    }


    // Driver code
    public static void main(String args[]) {
        Integer tablica[] = {94, 1, 12, 77, 5, 11};
        HeapSort algorytm = new HeapSort();
        algorytm.sort(tablica);
        System.out.println("HeapSort");
        for (int i = 0; i < tablica.length; ++i) {
            System.out.print(tablica[i] + " ");
        }
    }
}
