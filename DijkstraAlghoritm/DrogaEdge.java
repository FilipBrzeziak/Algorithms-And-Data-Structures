public class DrogaEdge {
    private MiastoNode miejsceDocelowe;
    private double dlugoscTrasy;

    public DrogaEdge(MiastoNode miejsceDocelowe, double dlugoscTrasy) {
        this.miejsceDocelowe = miejsceDocelowe;
        this.dlugoscTrasy = dlugoscTrasy;
    }

    public double getDlugoscTrasy() {
        return dlugoscTrasy;
    }

    public MiastoNode getMiejsceDocelowe() {
        return miejsceDocelowe;
    }

    @Override
    public String toString() {
        return "Do " + miejsceDocelowe;
    }
}
