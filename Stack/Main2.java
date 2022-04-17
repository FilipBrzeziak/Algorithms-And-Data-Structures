import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Palindromy palindromy = new Palindromy(30);
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj wyrazenie: ");
            String wyrazenie = scanner.nextLine();
            System.out.println("Czy jest palindromem: " + palindromy.czyJestPalindromem(wyrazenie));


        } catch (Exception e) {
            e.getMessage();
        }
    }
}
