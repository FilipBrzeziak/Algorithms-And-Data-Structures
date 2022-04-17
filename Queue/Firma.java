import java.util.ArrayList;

public class Firma {
    private ArrayList<Magazyn> listaMagazynow;

    public Firma() {
        this.listaMagazynow = new ArrayList<>();
    }

    public void dodajMagazyn(Magazyn magazyn) {
        listaMagazynow.add(magazyn);
    }

    public void przychodFirmy() {
        double przychodFirmy = 0;
        for (int i = 0; i < listaMagazynow.size(); i++) {
            przychodFirmy = przychodFirmy + listaMagazynow.get(i).getSumaKwot();
        }
        System.out.println("Aktualny przychod firmy to: " + przychodFirmy + "zl");
    }

}
