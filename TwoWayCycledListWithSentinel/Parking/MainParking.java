package BazaPracownikow.Parking;

public class MainParking {
    public static void main(String[] args) throws FullStackException, EmptyStackException {
        Parking parking = new Parking();

        PracownikParking pracownik1 = new PracownikParking("Daniel", "Kozar", "Mercedes Sedes");
        PracownikParking pracownik2 = new PracownikParking("Maciej", "Sikorski", "Ford Focus");
        PracownikParking pracownik3 = new PracownikParking("Filip", "Brzeziak", "Fiat Grande Punto");
        PracownikParking pracownik4 = new PracownikParking("Justyna", "Stankiewicz", "Peugeot 307");
        PracownikParking pracownik5 = new PracownikParking("Marek", "Kędzia", "VW Golf");
        PracownikParking pracownik6 = new PracownikParking("Bartosz", "Skotnicki", "Chevrolet Kalos");

        parking.dodajSamochod(pracownik1);
        parking.dodajSamochod(pracownik2);
        parking.dodajSamochod(pracownik3);
        parking.dodajSamochod(pracownik4);
        parking.dodajSamochod(pracownik5);
        parking.dodajSamochod(pracownik6);

        System.out.println("");
        parking.zglosWyjazd(pracownik2);
    }
}
