
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int iloscMiejscPracy = 50;
        Pracownik[] tablicaPracownikow = new Pracownik[iloscMiejscPracy];
        TablicaIterator arrayIterator = new TablicaIterator(tablicaPracownikow);
        Scanner scanner = new Scanner(System.in);

        int dalszeDzialanie = 100;
        int liczbaPracownikow = 0;

        try {
            while ((dalszeDzialanie != 0) && (liczbaPracownikow < iloscMiejscPracy)) {
                System.out.println("1. Dodanie pracownika godzinowego \n2. Dodanie pracownika etatowego\n3. Odczyt z pliku\n4. Zapis do pliku\n5. Wyswietl liste pracownikow  \n0. koniec dodawania");
                dalszeDzialanie = scanner.nextInt();
                if (dalszeDzialanie == 1) {

                    System.out.print("Podaj nazwisko: ");
                    String nazwisko = scanner.next();
                    System.out.print("Podaj imie: ");
                    String imie = scanner.next();
                    System.out.print("Podaj PESEL: ");
                    long PESEL = scanner.nextLong();
                    System.out.print("Podaj stanowisko: ");
                    String stanowisko = scanner.next();
                    System.out.print("Podaj staz: ");
                    int staz = scanner.nextInt();
                    System.out.print("Podaj stawke godzinowa: ");
                    double stawkaGodzinowa = scanner.nextDouble();
                    System.out.print("Podaj liczbe przepracowanych godzin: ");
                    int liczbaGodzin = scanner.nextInt();
                    tablicaPracownikow[liczbaPracownikow] = new PracownikGodzinowy(nazwisko, imie, PESEL, stanowisko, staz, stawkaGodzinowa, liczbaGodzin);
                    liczbaPracownikow++;

                }
                if (dalszeDzialanie == 2) {
                    System.out.print("Podaj nazwisko: ");
                    String nazwisko = scanner.next();
                    System.out.print("Podaj imie: ");
                    String imie = scanner.next();
                    System.out.print("Podaj PESEL: ");
                    long PESEL = scanner.nextLong();
                    System.out.print("Podaj stanowisko: ");
                    String stanowisko = scanner.next();
                    System.out.print("Podaj staz: ");
                    int staz = scanner.nextInt();
                    System.out.print("Podaj etat: ");
                    double etat = scanner.nextDouble();
                    System.out.print("Podaj stawke: ");
                    int stawka = scanner.nextInt();
                    tablicaPracownikow[liczbaPracownikow] = new PracownikGodzinowy(nazwisko, imie, PESEL, stanowisko, staz, etat, stawka);
                    liczbaPracownikow++;

                }

                //odczyt pracownikow

                if (dalszeDzialanie == 3) {
                    System.out.print("Podaj nazwę pliku z którego chcesz wczytać wykaz pracownikow: ");
                    String odczyt = scanner.next();
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.printf("I %-10s I %-10s I %-12s I %-12s I %5s I%10sI\n", "Nazwisko", "Imie", "PESEL", "Stanowisko", "Staz", "Pensja");
                    System.out.println("----------------------------------------------------------------------------");
                    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream((new File(odczyt))))) {
                        while (true) {
                            tablicaPracownikow[liczbaPracownikow] = (Pracownik) ois.readObject();
                            tablicaPracownikow[liczbaPracownikow].Wyswietl();
                            liczbaPracownikow++;
                        }

                    } catch (Exception a) {
                        a.getStackTrace();
                    }
                    System.out.println("----------------------------------------------------------------------------");

                }

                if (dalszeDzialanie == 4) {
                    System.out.print("Podaj nazwę pliku do którego chcesz zapisać wykaz pracownikow: ");
                    String zapis = scanner.next();
                    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(zapis)))) {

                        while (arrayIterator.hasNext()) {
                            oos.writeObject(arrayIterator.next());
                        }

                    } catch (Exception e) {
                        e.getStackTrace();
                    }
                }

                if (dalszeDzialanie == 5) {
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.printf("I %-10s I %-10s I %-12s I %-12s I %5s I%10sI\n", "Nazwisko", "Imie", "PESEL", "Stanowisko", "Staz", "Pensja");
                    System.out.println("----------------------------------------------------------------------------");
                    while (arrayIterator.hasNext()) {
                        ((Pracownik) arrayIterator.next()).Wyswietl();
                    }
                    System.out.println("----------------------------------------------------------------------------");
                }


            }
        } catch (Exception e) {
            System.out.println("Podales nieprawidlowe dane!");

        }
    }
}
