import java.io.*;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaKart listaKart = new ListaKart();
        listaKart.getArraylist().add(new Karta(1, 0));
        listaKart.getArraylist().add(new Karta(1, 0));
        listaKart.getArraylist().add(new Karta(1, 0));

        int dalszeDzialanie = 100;
        try {
            while ((dalszeDzialanie != 0)) {
                System.out.println("Menu \n1. Utworznie listy \n2. Wyswietlenie listy\n3. Wyswietlenie elementow listy\n4. Wyswietlenie kart o podanej wartosci\n5. Wyswietlenie kart o podanym kolorze\n6. Usuniecie kart powtarzajacych sie  \n0. Wyjscie z menu");
                dalszeDzialanie = scanner.nextInt();
                switch (dalszeDzialanie) {
                    case 1: {
                        listaKart.utworzListe();
                        break;
                    }
                    case 2: {
                        listaKart.wyswietlListe();
                        break;
                    }
                    case 3: {
                        listaKart.wyswietlLiczbeElementow();
                        break;
                    }
                    case 4: {
                        System.out.println("Wybierz wartosc ktora chcesz wyszukac:\n1 - as\n2-10 analogicznie do cyfry\n11 - walet\n12-dama\n13 - krol");
                        int wartosc = scanner.nextInt();
                        listaKart.wyswietlWartosc(wartosc);
                        break;
                    }
                    case 5: {
                        System.out.println("Wybierz kolor ktory chcesz wyszukac:\n0 - kier\n1 - karo\n2 - trefl\n3-pik");
                        int kolor = scanner.nextInt();
                        listaKart.wyswietlKolor(kolor);
                        break;
                    }
                    case 6: {
                        listaKart.usunPowtorki();
                        break;
                    }

                }

            }
        } catch (Exception e) {
            System.out.println("Podales nieprawidlowe dane!");
            System.out.println(e.getMessage());

        }
    }
}
