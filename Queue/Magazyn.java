public class Magazyn {
    private ListQueue<Klient> kolejkaMagazynu;
    private double sumaKwot = 0;

    public Magazyn() {
        kolejkaMagazynu = new ListQueue<Klient>();
    }

    public void dodajZamowienie(Klient klient) throws FullQueueException {
        kolejkaMagazynu.enqueue(klient);
    }

    public void realizujZgloszenie() throws EmptyQueueException {
        if (kolejkaMagazynu.isEmpty()) {
            throw new EmptyQueueException();
        }
        double doZaplaty = 0;
        Klient klient = kolejkaMagazynu.dequeue();
        while (!klient.getKolejkaKlienta().isEmpty()) {
            Zamowienie zamowienie = klient.getKolejkaKlienta().dequeue();
            doZaplaty = doZaplaty + (zamowienie.getLiczbaSztuk() * zamowienie.getCenaJednostkowa());
        }
        sumaKwot = sumaKwot + doZaplaty;
        System.out.println("Zgloszenie zrealizowane! " + "Nazwa klienta: " + klient.getNazwaKlienta() + "   Kwota do zaplaty: " + doZaplaty + "zl");
        if (kolejkaMagazynu.isEmpty()) {
            System.out.println("Suma kwot magazynu: " + sumaKwot + "zl");
        }
    }

    public double getSumaKwot() {
        return sumaKwot;
    }

    public ListQueue<Klient> getKolejkaMagazynu() {
        return kolejkaMagazynu;
    }
}
