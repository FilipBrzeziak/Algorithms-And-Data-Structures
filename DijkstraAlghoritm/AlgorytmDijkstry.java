import java.util.*;

public class AlgorytmDijkstry {

    public static void ObliczTrasy(MiastoNode miastoPoczatkowe) {
        miastoPoczatkowe.najkrotszaTrasa = 0;

        //implementuje kolejke priorytetowa
        PriorityQueue<MiastoNode> kolejka = new PriorityQueue<MiastoNode>();
        kolejka.add(miastoPoczatkowe);


        while (!kolejka.isEmpty()) {
            MiastoNode poczatkowe = kolejka.poll();

            for (DrogaEdge droga : poczatkowe.getDrogi()) {

                MiastoNode docelowe = droga.getMiejsceDocelowe();
                double dlugoscTrasy = droga.getDlugoscTrasy();

                double odlegloscOdPoczatkowego = poczatkowe.najkrotszaTrasa + dlugoscTrasy;
                if (odlegloscOdPoczatkowego < docelowe.najkrotszaTrasa) {

                    docelowe.najkrotszaTrasa = odlegloscOdPoczatkowego;
                    docelowe.poprzednieMiasto = poczatkowe;
                    kolejka.add(docelowe);

                }

            }
        }
    }

    public static List<MiastoNode> znajdzNajkrotszaTrasa(MiastoNode target) {

        //szukamy trasy z miejsca docelowego do poczatkowego
        List<MiastoNode> trasa = new ArrayList<MiastoNode>();
        for (MiastoNode miasto = target; miasto != null; miasto = miasto.poprzednieMiasto) {
            trasa.add(miasto);
        }

        //odwracamy aby lista zaczyanala sie od miejsca poczatkowego
        Collections.reverse(trasa);

        return trasa;
    }

    public static boolean czyIstniejeTrasa(MiastoNode miasto) {
        return miasto.najkrotszaTrasa < Double.POSITIVE_INFINITY;
    }
}
