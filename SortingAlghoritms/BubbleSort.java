package Algorytmy;

public class BubbleSort {
    public void sort(Integer tablica[]) {
        for (int i = 0; i < tablica.length - 1; i++)
            for (int j = 0; j < tablica.length - i - 1; j++)
                if (tablica[j] > tablica[j + 1]) {
                    int tablicaPomocnicza = tablica[j];
                    tablica[j] = tablica[j + 1];
                    tablica[j + 1] = tablicaPomocnicza;
                }
    }

    // Driver method to test above
    public static void main(String args[]) {
        Integer tablica[] = {94, 1, 12, 77, 5, 11};
        BubbleSort algorytm = new BubbleSort();
        algorytm.sort(tablica);
        System.out.println("BubbleSort");
        for (int i = 0; i < tablica.length; ++i) {
            System.out.print(tablica[i] + " ");
        }
    }
}
