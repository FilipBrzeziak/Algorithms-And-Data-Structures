import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws EmptyStackException {
        Nawiasy nawiasy = new Nawiasy(30);
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj wyrazenie: ");
            String wyrazenie = scanner.nextLine();
            System.out.println("Czy zrownowazone: " + nawiasy.nawiasyZrownowazone(wyrazenie));


        } catch (Exception e) {
            e.getMessage();
        }

    }
}
