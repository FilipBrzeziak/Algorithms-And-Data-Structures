import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OT {
    public static void obslugatras(MiastoNode[] miastoNodes) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dostepne trasy: ");
        int x = 0;
        for (int i = 0; i < miastoNodes.length; i++) {
            System.out.println(x + ". Z " + miastoNodes[i].nazwaMiasta + " " + Arrays.toString(miastoNodes[i].getDrogi()));
            x++;
        }

        System.out.print("Wybierz numer miasta z ktorego chcesz wyruszyc: ");
        int numer = scanner.nextInt();

        if (miastoNodes[numer].getDrogi().length == 0) {
            System.out.println("Brak tras z tego miasta!");
        } else {
            MiastoNode poczatkowe = miastoNodes[numer];
            int z = 0;
            for (int i = 0; i < poczatkowe.getDrogi().length; i++) {
                System.out.println(z + ". " + poczatkowe.getDrogi()[i]);
                z++;
            }
            System.out.print("Wybierz numer miasta docelowego: ");
            int numer2 = scanner.nextInt();
            MiastoNode docelowe = poczatkowe.getDrogi()[numer2].getMiejsceDocelowe();
            AlgorytmDijkstry.ObliczTrasy(poczatkowe);
            List<MiastoNode> droga = AlgorytmDijkstry.znajdzNajkrotszaTrasa(docelowe);
            System.out.println("Trasa: " + droga + " dlugosc: " + docelowe.najkrotszaTrasa + "km");

        }
    }
}
