import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ONP onp = new ONP();
        DrzewoBinarne drzewoBinarne = new DrzewoBinarne();
        Zamiana zamiana = new Zamiana();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wyrazenie (bez spacji, pamietaj o nawiasach): ");
        String dzialanie = scanner.nextLine();
        String[] poTransformacji = zamiana.zamiana(dzialanie);

        boolean koniec = false;
        while (!koniec) {
            System.out.println("Wybierz co chcesz teraz wykonac?");
            System.out.println("1. Utworzenie drzewa wyrażenia, węzły zawierają albo liczby całkowite albo operatory (+,-, *, /, %)\n" + "2. Obliczanie wyrażenia arytmetycznego zapisanego w drzewie binarnym\n" + "3. Wyświetlanie wyrażenia w postaci infiksowej (z nawiasami)\n" + "4. Wyświetlanie wyrażenia w postaci postfiksowej (w postaci beznawiasowej, ONP)\n" + "5. Obliczanie liczby liści\n" + "6. Obliczanie liczby węzłów\n" + "7. Obliczanie wysokości drzewa\n" + "8. Zadanie dodatkowe\n" + "0. Koniec\n" + "\nNumer: ");
            String numer = scanner.next();
            switch (numer) {
                case "1":
                    drzewoBinarne.utworzDrzewo(onp.onp(poTransformacji));
                    System.out.println("Utworzono drzewo!");
                    break;
                case "2":
                    System.out.println("Wynik to " + drzewoBinarne.oblicz());
                    break;
                case "3":
                    System.out.println(dzialanie + "\n");
                    break;
                case "4":
                    String[] poONP = onp.onp(poTransformacji);
                    for (int i = 0; i < poONP.length; i++) {
                        System.out.print(poONP[i]);
                    }
                    System.out.println();
                    break;
                case "5":
                    System.out.println("Liczba lisci drzewa wynosi " + drzewoBinarne.liczbaLisci() + "\n");
                    break;
                case "6":
                    System.out.println("Liczba wezlow wynosi " + drzewoBinarne.liczbaWezlow() + "\n");
                    break;
                case "7":
                    System.out.println("Wysokosc drzewa to " + drzewoBinarne.znajdzWysokosc() + "\n");
                    break;
                case "8":
                    drzewoBinarne.zadanieDodatkowe(drzewoBinarne.getRoot());
                case "0":
                    koniec = true;
                    break;
            }
            //Zadanie przetestuj dla wyrażenia: ((4+3)-(2+1)*2+3)/2
        }

    }
}
