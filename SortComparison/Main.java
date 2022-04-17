import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //tablice dla danych losowych
        Integer[] tablica1 = new Integer[5000];
        Integer[] tablica2 = new Integer[10000];
        Integer[] tablica3 = new Integer[50000];
        Integer[] tablica4 = new Integer[100000];
        Integer[] tablica;


        Random generator = new Random();
        for (int i = 0; i < tablica1.length; i++) {
            tablica1[i] = generator.nextInt(100);
        }
        for (int i = 0; i < tablica2.length; i++) {
            tablica2[i] = generator.nextInt(100);
        }

        for (int i = 0; i < tablica3.length; i++) {
            tablica3[i] = generator.nextInt(100);
        }

        for (int i = 0; i < tablica4.length; i++) {
            tablica4[i] = generator.nextInt(100);
        }

        long start;
        long finish;

        //A ShellSortInsertSort dla 5000
        tablica = tablica1;
        start = System.nanoTime();
        ShellSortInsert.sort(tablica, 1);
        finish = System.nanoTime() - start;
        System.out.println("a) ShellSortInsertSort dla 5000: " + finish / 1000000000f + " s");

        //B ShellSortInsertSort
        tablica = tablica1;
        start = System.nanoTime();
        ShellSortInsert.sort(tablica, 2);
        finish = System.nanoTime() - start;
        System.out.println("b) ShellSortInsertSort dla 5000: " + finish / 1000000000f + " s");

        //C ShellSortInsertSort
        tablica = tablica1;
        start = System.nanoTime();
        ShellSortInsert.sort(tablica, 3);
        finish = System.nanoTime() - start;
        System.out.println("c) ShellSortInsertSort dla 5000: " + finish / 1000000000f + " s");

        //D ShellSortInsertSort
        tablica = tablica1;
        start = System.nanoTime();
        ShellSortInsert.sort(tablica, 4);
        finish = System.nanoTime() - start;
        System.out.println("d) ShellSortInsertSort dla 5000: " + finish / 1000000000f + " s");

        //E ShellSortInsertSort
        tablica = tablica1;
        start = System.nanoTime();
        ShellSortInsert.sort(tablica, 5);
        finish = System.nanoTime() - start;
        System.out.println("e) ShellSortInsertSort dla 5000: " + finish / 1000000000f + " s");

        System.out.println("\n");

        //A ShellSortInsertSort dla 10000
        tablica = tablica2;
        start = System.nanoTime();
        ShellSortInsert.sort(tablica, 1);
        finish = System.nanoTime() - start;
        System.out.println("a) ShellSortInsertSort dla 10000: " + finish / 1000000000f + " s");

        //B ShellSortInsertSort
        tablica = tablica2;
        start = System.nanoTime();
        ShellSortInsert.sort(tablica, 2);
        finish = System.nanoTime() - start;
        System.out.println("b) ShellSortInsertSort dla 10000: " + finish / 1000000000f + " s");

        //C ShellSortInsertSort
        tablica = tablica2;
        start = System.nanoTime();
        ShellSortInsert.sort(tablica, 3);
        finish = System.nanoTime() - start;
        System.out.println("c) ShellSortInsertSort dla 10000: " + finish / 1000000000f + " s");

        //D ShellSortInsertSort
        tablica = tablica2;
        start = System.nanoTime();
        ShellSortInsert.sort(tablica, 4);
        finish = System.nanoTime() - start;
        System.out.println("d) ShellSortInsertSort dla 10000: " + finish / 1000000000f + " s");

        //E ShellSortInsertSort
        tablica = tablica2;
        start = System.nanoTime();
        ShellSortInsert.sort(tablica, 5);
        finish = System.nanoTime() - start;
        System.out.println("e) ShellSortInsertSort dla 10000: " + finish / 1000000000f + " s");

        System.out.println("\n");

        //A ShellSortInsertSort dla 50000
        tablica = tablica3;
        start = System.nanoTime();
        ShellSortInsert.sort(tablica, 1);
        finish = System.nanoTime() - start;
        System.out.println("a) ShellSortInsertSort dla 50000: " + finish / 1000000000f + " s");

        //B ShellSortInsertSort
        tablica = tablica3;
        start = System.nanoTime();
        ShellSortInsert.sort(tablica, 2);
        finish = System.nanoTime() - start;
        System.out.println("b) ShellSortInsertSort dla 50000: " + finish / 1000000000f + " s");

        //C ShellSortInsertSort
        tablica = tablica3;
        start = System.nanoTime();
        ShellSortInsert.sort(tablica, 3);
        finish = System.nanoTime() - start;
        System.out.println("c) ShellSortInsertSort dla 50000: " + finish / 1000000000f + " s");

        //D ShellSortInsertSort
        tablica = tablica3;
        start = System.nanoTime();
        ShellSortInsert.sort(tablica, 4);
        finish = System.nanoTime() - start;
        System.out.println("d) ShellSortInsertSort dla 50000: " + finish / 1000000000f + " s");

        //E ShellSortInsertSort
        tablica = tablica3;
        start = System.nanoTime();
        ShellSortInsert.sort(tablica, 5);
        finish = System.nanoTime() - start;
        System.out.println("e) ShellSortInsertSort dla 50000: " + finish / 1000000000f + " s");

        System.out.println("\n");

        //A ShellSortInsertSort dla 100000
        tablica = tablica4;
        start = System.nanoTime();
        ShellSortInsert.sort(tablica, 1);
        finish = System.nanoTime() - start;
        System.out.println("a) ShellSortInsertSort dla 100000: " + finish / 1000000000f + " s");

        //B ShellSortInsertSort
        tablica = tablica4;
        start = System.nanoTime();
        ShellSortInsert.sort(tablica, 2);
        finish = System.nanoTime() - start;
        System.out.println("b) ShellSortInsertSort dla 100000: " + finish / 1000000000f + " s");

        //C ShellSortInsertSort
        tablica = tablica4;
        start = System.nanoTime();
        ShellSortInsert.sort(tablica, 3);
        finish = System.nanoTime() - start;
        System.out.println("c) ShellSortInsertSort dla 100000: " + finish / 1000000000f + " s");

        //D ShellSortInsertSort
        tablica = tablica4;
        start = System.nanoTime();
        ShellSortInsert.sort(tablica, 4);
        finish = System.nanoTime() - start;
        System.out.println("d) ShellSortInsertSort dla 100000: " + finish / 1000000000f + " s");

        //E ShellSortInsertSort
        tablica = tablica4;
        start = System.nanoTime();
        ShellSortInsert.sort(tablica, 5);
        finish = System.nanoTime() - start;
        System.out.println("e) ShellSortInsertSort dla 100000: " + finish / 1000000000f + " s");

        System.out.println("\n");

        //A ShellSortInsertSortBubbleSort dla 5000
        tablica = tablica1;
        start = System.nanoTime();
        ShellSortInsertBubble.sort(tablica, 1);
        finish = System.nanoTime() - start;
        System.out.println("a) ShellSortInsertSortBubbleSort dla 5000: " + finish / 1000000000f + " s");

        //B ShellSortInsertSortBubbleSort
        tablica = tablica1;
        start = System.nanoTime();
        ShellSortInsertBubble.sort(tablica, 2);
        finish = System.nanoTime() - start;
        System.out.println("b) ShellSortInsertSortBubbleSort dla 5000: " + finish / 1000000000f + " s");

        //C ShellSortInsertSortBubbleSort
        tablica = tablica1;
        start = System.nanoTime();
        ShellSortInsertBubble.sort(tablica, 3);
        finish = System.nanoTime() - start;
        System.out.println("c) ShellSortInsertSortBubbleSort dla 5000: " + finish / 1000000000f + " s");

        //D ShellSortInsertSortBubbleSort
        tablica = tablica1;
        start = System.nanoTime();
        ShellSortInsertBubble.sort(tablica, 4);
        finish = System.nanoTime() - start;
        System.out.println("d) ShellSortInsertSortBubbleSort dla 5000: " + finish / 1000000000f + " s");

        //E ShellSortInsertSortBubbleSort
        tablica = tablica1;
        start = System.nanoTime();
        ShellSortInsertBubble.sort(tablica, 5);
        finish = System.nanoTime() - start;
        System.out.println("e) ShellSortInsertSortBubbleSort dla 5000: " + finish / 1000000000f + " s");

        System.out.println("\n");

        //A ShellSortInsertSortBubbleSort dla 10000
        tablica = tablica2;
        start = System.nanoTime();
        ShellSortInsertBubble.sort(tablica, 1);
        finish = System.nanoTime() - start;
        System.out.println("a) ShellSortInsertSortBubbleSort dla 10000: " + finish / 1000000000f + " s");

        //B ShellSortInsertSortBubbleSort
        tablica = tablica2;
        start = System.nanoTime();
        ShellSortInsertBubble.sort(tablica, 2);
        finish = System.nanoTime() - start;
        System.out.println("b) ShellSortInsertSortBubbleSort dla 10000: " + finish / 1000000000f + " s");

        //C ShellSortInsertSortBubbleSort
        tablica = tablica2;
        start = System.nanoTime();
        ShellSortInsertBubble.sort(tablica, 3);
        finish = System.nanoTime() - start;
        System.out.println("c) ShellSortInsertSortBubbleSort dla 10000: " + finish / 1000000000f + " s");

        //D ShellSortInsertSortBubbleSort
        tablica = tablica2;
        start = System.nanoTime();
        ShellSortInsertBubble.sort(tablica, 4);
        finish = System.nanoTime() - start;
        System.out.println("d) ShellSortInsertSortBubbleSort dla 10000: " + finish / 1000000000f + " s");

        //E ShellSortInsertSortBubbleSort
        tablica = tablica2;
        start = System.nanoTime();
        ShellSortInsertBubble.sort(tablica, 5);
        finish = System.nanoTime() - start;
        System.out.println("e) ShellSortInsertSortBubbleSort dla 10000: " + finish / 1000000000f + " s");

        System.out.println("\n");

        //A ShellSortInsertSortBubbleSort dla 50000
        tablica = tablica3;
        start = System.nanoTime();
        ShellSortInsertBubble.sort(tablica, 1);
        finish = System.nanoTime() - start;
        System.out.println("a) ShellSortInsertSortBubbleSort dla 50000: " + finish / 1000000000f + " s");

        //B ShellSortInsertSortBubbleSort
        tablica = tablica3;
        start = System.nanoTime();
        ShellSortInsertBubble.sort(tablica, 2);
        finish = System.nanoTime() - start;
        System.out.println("b) ShellSortInsertSortBubbleSort dla 50000: " + finish / 1000000000f + " s");

        //C ShellSortInsertSortBubbleSort
        tablica = tablica3;
        start = System.nanoTime();
        ShellSortInsertBubble.sort(tablica, 3);
        finish = System.nanoTime() - start;
        System.out.println("c) ShellSortInsertSortBubbleSort dla 50000: " + finish / 1000000000f + " s");

        //D ShellSortInsertSortBubbleSort
        tablica = tablica3;
        start = System.nanoTime();
        ShellSortInsertBubble.sort(tablica, 4);
        finish = System.nanoTime() - start;
        System.out.println("d) ShellSortInsertSortBubbleSort dla 50000: " + finish / 1000000000f + " s");

        //E ShellSortInsertSortBubbleSort
        tablica = tablica3;
        start = System.nanoTime();
        ShellSortInsertBubble.sort(tablica, 5);
        finish = System.nanoTime() - start;
        System.out.println("e) ShellSortInsertSortBubbleSort dla 50000: " + finish / 1000000000f + " s");

        System.out.println("\n");

        //A ShellSortInsertSortBubbleSort dla 100000
        tablica = tablica4;
        start = System.nanoTime();
        ShellSortInsertBubble.sort(tablica, 1);
        finish = System.nanoTime() - start;
        System.out.println("a) ShellSortInsertSortBubbleSort dla 100000: " + finish / 1000000000f + " s");

        //B ShellSortInsertSortBubbleSort
        tablica = tablica4;
        start = System.nanoTime();
        ShellSortInsertBubble.sort(tablica, 2);
        finish = System.nanoTime() - start;
        System.out.println("b) ShellSortInsertSortBubbleSort dla 100000: " + finish / 1000000000f + " s");

        //C ShellSortInsertSortBubbleSort
        tablica = tablica4;
        start = System.nanoTime();
        ShellSortInsertBubble.sort(tablica, 3);
        finish = System.nanoTime() - start;
        System.out.println("c) ShellSortInsertSortBubbleSort dla 100000: " + finish / 1000000000f + " s");

        //D ShellSortInsertSortBubbleSort
        tablica = tablica4;
        start = System.nanoTime();
        ShellSortInsertBubble.sort(tablica, 4);
        finish = System.nanoTime() - start;
        System.out.println("d) ShellSortInsertSortBubbleSort dla 100000: " + finish / 1000000000f + " s");

        //E ShellSortInsertSortBubbleSort
        tablica = tablica4;
        start = System.nanoTime();
        ShellSortInsertBubble.sort(tablica, 5);
        finish = System.nanoTime() - start;
        System.out.println("e) ShellSortInsertSortBubbleSort dla 100000: " + finish / 1000000000f + " s");

        System.out.println("\n");

        //A ShellSortBubbleSortInsertSort dla 5000
        tablica = tablica1;
        start = System.nanoTime();
        ShellSortBubbleInsert.sort(tablica, 1);
        finish = System.nanoTime() - start;
        System.out.println("a) ShellSortBubbleSortInsertSort dla 5000: " + finish / 1000000000f + " s");

        //B ShellSortBubbleSortInsertSort
        tablica = tablica1;
        start = System.nanoTime();
        ShellSortBubbleInsert.sort(tablica, 2);
        finish = System.nanoTime() - start;
        System.out.println("b) ShellSortBubbleSortInsertSort dla 5000: " + finish / 1000000000f + " s");

        //C ShellSortBubbleSortInsertSort
        tablica = tablica1;
        start = System.nanoTime();
        ShellSortBubbleInsert.sort(tablica, 3);
        finish = System.nanoTime() - start;
        System.out.println("c) ShellSortBubbleSortInsertSort dla 5000: " + finish / 1000000000f + " s");

        //D ShellSortBubbleSortInsertSort
        tablica = tablica1;
        start = System.nanoTime();
        ShellSortBubbleInsert.sort(tablica, 4);
        finish = System.nanoTime() - start;
        System.out.println("d) ShellSortBubbleSortInsertSort dla 5000: " + finish / 1000000000f + " s");

        //E ShellSortBubbleSortInsertSort
        tablica = tablica1;
        start = System.nanoTime();
        ShellSortBubbleInsert.sort(tablica, 5);
        finish = System.nanoTime() - start;
        System.out.println("e) ShellSortBubbleSortInsertSort dla 5000: " + finish / 1000000000f + " s");

        System.out.println("\n");

        //A ShellSortBubbleSortInsertSort dla 10000
        tablica = tablica2;
        start = System.nanoTime();
        ShellSortBubbleInsert.sort(tablica, 1);
        finish = System.nanoTime() - start;
        System.out.println("a) ShellSortBubbleSortInsertSort dla 10000: " + finish / 1000000000f + " s");

        //B ShellSortBubbleSortInsertSort
        tablica = tablica2;
        start = System.nanoTime();
        ShellSortBubbleInsert.sort(tablica, 2);
        finish = System.nanoTime() - start;
        System.out.println("b) ShellSortBubbleSortInsertSort dla 10000: " + finish / 1000000000f + " s");

        //C ShellSortBubbleSortInsertSort
        tablica = tablica2;
        start = System.nanoTime();
        ShellSortBubbleInsert.sort(tablica, 3);
        finish = System.nanoTime() - start;
        System.out.println("c) ShellSortBubbleSortInsertSort dla 10000: " + finish / 1000000000f + " s");

        //D ShellSortBubbleSortInsertSort
        tablica = tablica2;
        start = System.nanoTime();
        ShellSortBubbleInsert.sort(tablica, 4);
        finish = System.nanoTime() - start;
        System.out.println("d) ShellSortBubbleSortInsertSort dla 10000: " + finish / 1000000000f + " s");

        //E ShellSortBubbleSortInsertSort
        tablica = tablica2;
        start = System.nanoTime();
        ShellSortBubbleInsert.sort(tablica, 5);
        finish = System.nanoTime() - start;
        System.out.println("e) ShellSortBubbleSortInsertSort dla 10000: " + finish / 1000000000f + " s");

        System.out.println("\n");

        //A ShellSortBubbleSortInsertSort dla 50000
        tablica = tablica3;
        start = System.nanoTime();
        ShellSortBubbleInsert.sort(tablica, 1);
        finish = System.nanoTime() - start;
        System.out.println("a) ShellSortBubbleSortInsertSort dla 50000: " + finish / 1000000000f + " s");

        //B ShellSortBubbleSortInsertSort
        tablica = tablica3;
        start = System.nanoTime();
        ShellSortBubbleInsert.sort(tablica, 2);
        finish = System.nanoTime() - start;
        System.out.println("b) ShellSortBubbleSortInsertSort dla 50000: " + finish / 1000000000f + " s");

        //C ShellSortBubbleSortInsertSort
        tablica = tablica3;
        start = System.nanoTime();
        ShellSortBubbleInsert.sort(tablica, 3);
        finish = System.nanoTime() - start;
        System.out.println("c) ShellSortBubbleSortInsertSort dla 50000: " + finish / 1000000000f + " s");

        //D ShellSortBubbleSortInsertSort
        tablica = tablica3;
        start = System.nanoTime();
        ShellSortBubbleInsert.sort(tablica, 4);
        finish = System.nanoTime() - start;
        System.out.println("d) ShellSortBubbleSortInsertSort dla 50000: " + finish / 1000000000f + " s");

        //E ShellSortBubbleSortInsertSort
        tablica = tablica3;
        start = System.nanoTime();
        ShellSortBubbleInsert.sort(tablica, 5);
        finish = System.nanoTime() - start;
        System.out.println("e) ShellSortBubbleSortInsertSort dla 50000: " + finish / 1000000000f + " s");

        System.out.println("\n");

        //A ShellSortBubbleSortInsertSort dla 10000
        tablica = tablica4;
        start = System.nanoTime();
        ShellSortBubbleInsert.sort(tablica, 1);
        finish = System.nanoTime() - start;
        System.out.println("a) ShellSortBubbleSortInsertSort dla 10000: " + finish / 1000000000f + " s");

        //B ShellSortBubbleSortInsertSort
        tablica = tablica4;
        start = System.nanoTime();
        ShellSortBubbleInsert.sort(tablica, 2);
        finish = System.nanoTime() - start;
        System.out.println("b) ShellSortBubbleSortInsertSort dla 10000: " + finish / 1000000000f + " s");

        //C ShellSortBubbleSortInsertSort
        tablica = tablica4;
        start = System.nanoTime();
        ShellSortBubbleInsert.sort(tablica, 3);
        finish = System.nanoTime() - start;
        System.out.println("c) ShellSortBubbleSortInsertSort dla 10000: " + finish / 1000000000f + " s");

        //D ShellSortBubbleSortInsertSort
        tablica = tablica4;
        start = System.nanoTime();
        ShellSortBubbleInsert.sort(tablica, 4);
        finish = System.nanoTime() - start;
        System.out.println("d) ShellSortBubbleSortInsertSort dla 10000: " + finish / 1000000000f + " s");

        //E ShellSortBubbleSortInsertSort
        tablica = tablica4;
        start = System.nanoTime();
        ShellSortBubbleInsert.sort(tablica, 5);
        finish = System.nanoTime() - start;
        System.out.println("e) ShellSortBubbleSortInsertSort dla 10000: " + finish / 1000000000f + " s");
    }
}
