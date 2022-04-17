package BazaPracownikow.BazaPracownikow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BazaPracownikow bazaPracownikow = new BazaPracownikow();
        bazaPracownikow.dodajPracownika("21213213","Sikorski","Maciej","01.06.2001","Informatyk",2700,11);
        bazaPracownikow.dodajPracownika("21213212","Kozar","Daniel","02.06.2001","Psycholog",4800,21);
        Scanner scanner = new Scanner(System.in);
        int akcja = -1;

        while (akcja != 0) {
            System.out.println("Menu\n1.Utworzenie nowej bazy danych\n2.Odczyt bazy z pliku\n3.Wyświetlenie wszystkich rekordów\n4.Wyświetlenie danych jednego pracownika\n5.Dopisanie nowego pracownika\n6.Usunięcie pracownika z bazy\n7.Aktualizowanie danych pracownika\n8.Obliczanie średniej pensji w firmie\n9.Obliczanie ilu pracowników zarabia poniżej średniej\n10.Zapis bazy do pliku\n0.Wyjdz");
            akcja = scanner.nextInt();
            if (akcja != 0) {
                switch (akcja) {
                    case 1: {
                        bazaPracownikow = new BazaPracownikow();
                        System.out.println("Utworzona baze pracownikow!");
                        break;
                    }
                    case 2: {
                        System.out.print("Podaj nazwe pliku z ktorego chcesz odczytac baze danych: ");
                        String nazwa = scanner.next();
                        bazaPracownikow.odczyt(nazwa);
                        break;
                    }
                    case 3: {
                        System.out.println("Pracownicy:");
                        bazaPracownikow.wyswietlPracownikow();
                        break;
                    }
                    case 4: {
                        System.out.print("Podaj numer PESEL pracownika ktorego chcesz wyswietlic: ");
                        String pesel = scanner.next();
                        bazaPracownikow.wyswietlPracownika(pesel);
                        break;
                    }
                    case 5: {
                        System.out.println("Podaj dane pracownika którego chcesz dodac");
                        System.out.println("PESEL:");
                        String pesel = scanner.next();
                        System.out.println("Nazwisko:");
                        String nazwisko = scanner.next();
                        System.out.println("Imie:");
                        String imie = scanner.next();
                        System.out.println("Data urodzenia w formacie dd.mm.rr:");
                        String data = scanner.next();
                        System.out.println("Stanowisko:");
                        String stanowisko = scanner.next();
                        System.out.println("Pensja:");
                        String pensja = scanner.next();
                        System.out.println("Staz:");
                        String staz = scanner.next();
                        bazaPracownikow.dodajPracownika(pesel, nazwisko, imie, data, stanowisko, Double.parseDouble(pensja), Double.parseDouble(staz));
                        System.out.println("Utworzono nowego pracownika!");
                        break;
                    }
                    case 6: {
                        System.out.println("Podaj PESEL pracownika ktorego dane chcesz usunac");
                        String pesel = scanner.next();
                        bazaPracownikow.usunPracownika(pesel);
                        break;
                    }
                    case 7: {
                        System.out.println("Podaj PESEL pracownika ktorego dane chcesz zaktualizowac");
                        String pesel = scanner.next();
                        bazaPracownikow.aktualizujPracownika(pesel);
                        break;
                    }
                    case 8: {
                        System.out.print("Srednia pensja w firmie wraz z premia to: ");
                        System.out.printf("%10.2f", bazaPracownikow.sredniPrzychod());
                        System.out.print("zl\n");
                        break;
                    }
                    case 9: {
                        System.out.println(bazaPracownikow.iluPonizejSredniegoPrzychodu() + " pracownikow zarabia ponizej sredniego wynagrodzenia");
                        break;
                    }
                    case 10: {
                        System.out.print("Podaj nazwe pliku z ktorego chcesz zapisac baze danych: ");
                        String nazwa = scanner.next();
                        bazaPracownikow.zapis(nazwa);
                        break;
                    }

                }
            }
        }
    }
}
