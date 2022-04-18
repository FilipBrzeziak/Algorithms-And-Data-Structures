import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MiastoNode wroclaw = new MiastoNode("Wrocław");
        MiastoNode olawa = new MiastoNode("Oława");
        MiastoNode brzeg = new MiastoNode("Brzeg");
        MiastoNode nysa = new MiastoNode("Nysa");
        MiastoNode opole = new MiastoNode("Opole");

        MiastoNode[] miastoNodes = new MiastoNode[]{wroclaw, olawa, brzeg, nysa, opole};

        wroclaw.drogi = new DrogaEdge[]{
                new DrogaEdge(olawa, 10),
                new DrogaEdge(nysa, 30),
                new DrogaEdge(opole, 100)
        };

        olawa.drogi = new DrogaEdge[]{
                new DrogaEdge(brzeg, 50)

        };

        brzeg.drogi = new DrogaEdge[]{
                new DrogaEdge(opole, 10)
        };

        nysa.drogi = new DrogaEdge[]{
                new DrogaEdge(opole, 60),
                new DrogaEdge(brzeg, 20),
        };

        opole.drogi = new DrogaEdge[]{

        };

        OT.obslugatras(miastoNodes);
    }
}
