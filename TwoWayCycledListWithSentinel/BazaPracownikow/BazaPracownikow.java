package BazaPracownikow.BazaPracownikow;

import java.io.*;
import java.util.Scanner;

public class BazaPracownikow {
    private TwoWayCycledListWithSentinel<Pracownik> lista;

    public BazaPracownikow() {
        this.lista = new TwoWayCycledListWithSentinel();
    }

    public void dodajPracownika(String PESEL, String nazwisko, String imie, String dataUrodzenia, String stanowisko, double pensja, double staz) {
        Pracownik pracownik1 = new Pracownik(PESEL, nazwisko, imie, dataUrodzenia, stanowisko, pensja, staz);
        if (lista.isEmpty()) {
            lista.add(pracownik1);
        } else {
            int x = 0;
            for (Pracownik pracownik : lista) {
                if (pracownik1.compareTo(pracownik) <= 0) {
                    lista.add(lista.indexOf(pracownik), pracownik1);
                    x++;
                    return;
                }
                if (pracownik.compareTo(pracownik1) > 0) {
                    break;
                }
            }
            if (x == 0) {
                lista.add(pracownik1);
            }
        }
    }

    public void dodajPracownika2(Pracownik pracownik1) {
        ;
        if (lista.isEmpty()) {
            lista.add(pracownik1);
        } else {
            int x = 0;
            for (Pracownik pracownik : lista) {
                if (pracownik1.compareTo(pracownik) <= 0) {
                    lista.add(lista.indexOf(pracownik), pracownik1);
                    x++;
                    return;
                }
                if (pracownik.compareTo(pracownik1) > 0) {
                    break;
                }
            }
            if (x == 0) {
                lista.add(pracownik1);
            }
        }

    }

    public void wyswietlPracownikow() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

    public void wyswietlPracownika(String PESEL) {
        int x = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getPESEL().equals(PESEL)) {
                System.out.println(lista.get(i));
                x++;
            }
        }
        if (x == 0) {
            System.out.println("Brak pracownika o podanym numerze PESEL");
        }
    }

    public void usunPracownika(String PESEL) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getPESEL().equals(PESEL)) {
                lista.remove(i);
            }
        }
    }

    public void aktualizujPracownika(String PESEL) {
        Scanner scanner = new Scanner(System.in);
        int akcja = -1;
        int indeks = -1;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getPESEL().equals(PESEL)) {
                indeks = i;
            }
        }
        if (indeks == -1) {
            System.out.println("Nie ma takiego PESELU w bazie danych!");
            return;
        }

        while (akcja != 0) {
            System.out.println("Wybierz numer odpowiada danej którą chcesz wykonac\n1.Nazwisko\n2.Imie\n3.Data urodzenia\n4.Stanowisko\n5.Pensja\n6.Staz\n0.Koniec aktualizacji");
            akcja = scanner.nextInt();
            if (akcja != 0) {
                System.out.println("Podaj nowa dana: ");
                String dana;
                dana = scanner.next();
                switch (akcja) {
                    case 1: {
                        lista.get(indeks).setNazwisko(dana);
                    }
                    case 2: {
                        lista.get(indeks).setImie(dana);
                    }
                    case 3: {
                        lista.get(indeks).setDataUrodzenia(dana);
                    }
                    case 4: {
                        lista.get(indeks).setStanowisko(dana);
                    }
                    case 5: {
                        lista.get(indeks).setPensja((double) akcja);
                    }
                    case 6: {
                        lista.get(indeks).setStaz((double) akcja);
                    }
                }
            }
        }
    }

    public double sredniaPensja() {
        double x = 0;
        for (int i = 0; i < lista.size(); i++) {
            x = x + lista.get(i).getPensja();
        }
        return x / lista.size();
    }

    public double sredniPrzychod() {
        double x = 0;
        for (int i = 0; i < lista.size(); i++) {
            x = x + lista.get(i).getPrzychod();
        }
        return x / lista.size();
    }

    public int iluPonizejSredniejPensji() {
        int x = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getPensja() < sredniaPensja()) {
                x++;
            }
        }
        return x;
    }

    public int iluPonizejSredniegoPrzychodu() {
        int x = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getPrzychod() < sredniPrzychod()) {
                x++;
            }
        }
        return x;
    }

    public void zapis(String plik) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(plik)))) {
            for (int i = 0; i < lista.size(); i++) {
                oos.writeObject(lista.get(i));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void odczyt(String plik) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(plik)))) {
            while (true) {
                dodajPracownika2((Pracownik) ois.readObject());
            }

        } catch (EOFException e) {
            e.getStackTrace();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
