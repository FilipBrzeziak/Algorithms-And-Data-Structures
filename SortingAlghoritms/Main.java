import Algorytmy.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //tablice dla danych losowych
        Integer[] tablica1 = new Integer[10000];
        Integer[] tablica2;
        Integer[] tablica3;
        Integer[] tablica4;
        Integer[] tablica5;
        Integer[] tablica6;

        //tablice dla danych rosnacych
        Integer[] tablicaRosnaca1;
        Integer[] tablicaRosnaca2;
        Integer[] tablicaRosnaca3;
        Integer[] tablicaRosnaca4;
        Integer[] tablicaRosnaca5;
        Integer[] tablicaRosnaca6;

        //tablice dla danych malejacych
        Integer[] tablicaMalejaca1;
        Integer[] tablicaMalejaca2;
        Integer[] tablicaMalejaca3;
        Integer[] tablicaMalejaca4;
        Integer[] tablicaMalejaca5;
        Integer[] tablicaMalejaca6;

        Random generator = new Random();
        for (int i = 0; i < tablica1.length; i++) {
            tablica1[i] = generator.nextInt();
        }
        //kopiujemy tablice do pozostalych tablic
        tablica2 = tablica3 = tablica4 = tablica5 = tablica6 = tablicaMalejaca1 = tablicaRosnaca1 = tablica1;

        //kopiujemy tablice do pozostalych tablic rosnacych
        Arrays.sort(tablicaRosnaca1);
        tablicaRosnaca2 = tablicaRosnaca3 = tablicaRosnaca4 = tablicaRosnaca5 = tablicaRosnaca6 = tablicaRosnaca1;

        //kopiujemy tablice do pozostalych tablic malejacych
        Arrays.sort(tablicaMalejaca1, Collections.reverseOrder());
        tablicaMalejaca2 = tablicaMalejaca3 = tablicaMalejaca4 = tablicaMalejaca5 = tablicaMalejaca6 = tablicaMalejaca1;

        long start;
        long finish;

        System.out.println("Testy wykonano dla " + tablica1.length + " liczb losowych z zakresu 0 do 100");

        //Algorytmy dla danych losowych

        System.out.println("\n\n\nAlgorytmy dla danych losowych\n");

        //BubbleSort
        start = System.nanoTime();
        BubbleSort algorytm1 = new BubbleSort();
        algorytm1.sort(tablica1);
        finish = System.nanoTime() - start;
        System.out.println("BubleSort: " + finish / 1000000000f + " s");

        //InsertSort
        start = System.nanoTime();
        InsertSort algorytm2 = new InsertSort();
        algorytm2.sort(tablica2);
        finish = System.nanoTime() - start;
        System.out.println("InsertSort: " + finish / 1000000000f + " s");

        //SelectSort
        start = System.nanoTime();
        SelectSort algorytm3 = new SelectSort();
        algorytm3.sort(tablica3);
        finish = System.nanoTime() - start;
        System.out.println("SelectSort: " + finish / 1000000000f + " s");

        //QuickSort
        start = System.nanoTime();
        QuickSort algorytm4 = new QuickSort();
        algorytm4.sort(tablica4, 0, tablica4.length - 1);
        finish = System.nanoTime() - start;
        System.out.println("QuickSort: " + finish / 1000000000f + " s");

        //HeapSort
        start = System.nanoTime();
        HeapSort algorytm5 = new HeapSort();
        algorytm5.sort(tablica5);
        finish = System.nanoTime() - start;
        System.out.println("HeapSort: " + finish / 1000000000f + " s");

        //MergeSort
        start = System.nanoTime();
        MergeSort algorytm6 = new MergeSort();
        algorytm6.sort(tablica6, 0, tablica6.length - 1);
        finish = System.nanoTime() - start;
        System.out.println("MergeSort: " + finish / 1000000000f + " s");


        //Algorytmy dla danych rosnacych

        System.out.println("\n\n\nAlgorytmy dla danych rosnacych\n");

        //BubbleSort
        start = System.nanoTime();
        BubbleSort algorytmDlaRosnacych1 = new BubbleSort();
        algorytmDlaRosnacych1.sort(tablicaRosnaca1);
        finish = System.nanoTime() - start;
        System.out.println("BubleSort: " + finish / 1000000000f + " s");

        //InsertSort
        start = System.nanoTime();
        InsertSort algorytmDlaRosnacych2 = new InsertSort();
        algorytmDlaRosnacych2.sort(tablicaRosnaca2);
        finish = System.nanoTime() - start;
        System.out.println("InsertSort: " + finish / 1000000000f + " s");

        //SelectSort
        start = System.nanoTime();
        SelectSort algorytmDlaRosnacych3 = new SelectSort();
        algorytmDlaRosnacych3.sort(tablicaRosnaca3);
        finish = System.nanoTime() - start;
        System.out.println("SelectSort: " + finish / 1000000000f + " s");

        //QuickSort
        start = System.nanoTime();
        QuickSort algorytmDlaRosnacych4 = new QuickSort();
        algorytmDlaRosnacych4.sort(tablicaRosnaca4, 0, tablicaRosnaca4.length - 1);
        finish = System.nanoTime() - start;
        System.out.println("QuickSort: " + finish / 1000000000f + " s");

        //HeapSort
        start = System.nanoTime();
        HeapSort algorytmDlaRosnacych5 = new HeapSort();
        algorytmDlaRosnacych5.sort(tablicaRosnaca5);
        finish = System.nanoTime() - start;
        System.out.println("HeapSort: " + finish / 1000000000f + " s");

        //MergeSort
        start = System.nanoTime();
        MergeSort algorytmDlaRosnacych6 = new MergeSort();
        algorytmDlaRosnacych6.sort(tablicaRosnaca6, 0, tablicaRosnaca6.length - 1);
        finish = System.nanoTime() - start;
        System.out.println("MergeSort: " + finish / 1000000000f + " s");


        //Algorytmy dla danych malejacych

        System.out.println("\n\n\nAlgorytmy dla danych malejacych\n");

        //BubbleSort
        start = System.nanoTime();
        BubbleSort algorytmydlaMalejacych1 = new BubbleSort();
        algorytmydlaMalejacych1.sort(tablicaMalejaca1);
        finish = System.nanoTime() - start;
        System.out.println("BubleSort: " + finish / 1000000000f + " s");

        //InsertSort
        start = System.nanoTime();
        InsertSort algorytmydlaMalejacych2 = new InsertSort();
        algorytmydlaMalejacych2.sort(tablicaMalejaca2);
        finish = System.nanoTime() - start;
        System.out.println("InsertSort: " + finish / 1000000000f + " s");

        //SelectSort
        start = System.nanoTime();
        SelectSort algorytmydlaMalejacych3 = new SelectSort();
        algorytmydlaMalejacych3.sort(tablicaMalejaca3);
        finish = System.nanoTime() - start;
        System.out.println("SelectSort: " + finish / 1000000000f + " s");

        //QuickSort
        start = System.nanoTime();
        QuickSort algorytmydlaMalejacych4 = new QuickSort();
        algorytmydlaMalejacych4.sort(tablicaMalejaca4, 0, tablicaRosnaca4.length - 1);
        finish = System.nanoTime() - start;
        System.out.println("QuickSort: " + finish / 1000000000f + " s");

        //HeapSort
        start = System.nanoTime();
        HeapSort algorytmydlaMalejacych5 = new HeapSort();
        algorytmydlaMalejacych1.sort(tablicaMalejaca5);
        finish = System.nanoTime() - start;
        System.out.println("HeapSort: " + finish / 1000000000f + " s");

        //MergeSort
        start = System.nanoTime();
        MergeSort algorytmydlaMalejacych6 = new MergeSort();
        algorytmydlaMalejacych6.sort(tablicaMalejaca6, 0, tablicaRosnaca6.length - 1);
        finish = System.nanoTime() - start;
        System.out.println("MergeSort: " + finish / 1000000000f + " s");

    }
}
