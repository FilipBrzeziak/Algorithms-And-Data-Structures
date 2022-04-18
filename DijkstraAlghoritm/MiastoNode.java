public class MiastoNode implements Comparable<MiastoNode> {
    public String nazwaMiasta;
    public DrogaEdge[] drogi;
    public double najkrotszaTrasa = Double.POSITIVE_INFINITY;
    public MiastoNode poprzednieMiasto;

    public MiastoNode(String nazwaMiasta) {
        this.nazwaMiasta = nazwaMiasta;
    }

    public String toString() {
        return nazwaMiasta;
    }

    @Override
    public int compareTo(MiastoNode o) {
        return Double.compare(najkrotszaTrasa, o.najkrotszaTrasa);
    }

    public DrogaEdge[] getDrogi() {
        return drogi;
    }

}
