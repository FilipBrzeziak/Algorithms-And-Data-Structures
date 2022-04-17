package Algorytmy;

public class SelectSort {
    public void sort(Integer tablica[]) {
        for (int i = 0; i < tablica.length - 1; i++) {
            int elementMinimalny = i;
            for (int j = i + 1; j < tablica.length; j++) {
                if (tablica[j] < tablica[elementMinimalny])
                    elementMinimalny = j;
            }

            int tablicaPomocnicza = tablica[elementMinimalny];
            tablica[elementMinimalny] = tablica[i];
            tablica[i] = tablicaPomocnicza;
        }
    }

    public static void main(String args[]) {
        Integer tablica[] = {94, 1, 12, 77, 5, 11};
        SelectSort algorytm = new SelectSort();
        algorytm.sort(tablica);
        System.out.println("SelectSort");
        for (int i = 0; i < tablica.length; ++i) {
            System.out.print(tablica[i] + " ");
        }

    }
}
