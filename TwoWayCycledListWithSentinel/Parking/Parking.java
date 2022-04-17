package BazaPracownikow.Parking;

public class Parking {
    private ListStack stos;
    private ListStack stos2;

    public Parking() {
        stos = new ListStack();
        stos2 = new ListStack();
    }

    public void dodajSamochod(Pracownik pracownik) throws FullStackException {
        stos.push(pracownik);
        System.out.println("Zaparkowano samochod! " + pracownik.toString());
    }

    public void zglosWyjazd(Pracownik pracownik) throws EmptyStackException, FullStackException {
        boolean warunek = true;
        int j = 0;
        System.out.println("Uwaga! PracownikParking " + pracownik.toString() + " chce wyjechac!");
        System.out.println("Uwaga wymienienie zaraz pracownicy muszą wyjechać w podanej kolejnosci!");
        while (warunek) {
            j++;
            Pracownik pracownik1 = (Pracownik) stos.pop();
            System.out.println(j + ". " + pracownik1.toString());
            if (pracownik.equals(pracownik1)) {
                warunek = false;
            } else {
                stos2.push(pracownik1);
            }
        }

        System.out.println("\nUwaga wymienienie zaraz pracownicy muszą wjechac w podanej kolejnosci!");
        j = 0;
        while (!stos2.isEmpty()) {
            j++;
            Pracownik pracownik1 = (Pracownik) stos2.pop();
            stos.push(pracownik1);
            System.out.println(j + ". " + pracownik1.toString());
        }

    }
}
