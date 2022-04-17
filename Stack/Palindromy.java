public class Palindromy {

    private ArrayStack<Character> stosNormalny;
    private ArrayStack<Character> stosOdwrocony;

    public Palindromy(int rozmiar) {
        this.stosNormalny = new ArrayStack<Character>(rozmiar);
        this.stosOdwrocony = new ArrayStack<Character>(rozmiar);
    }

    public boolean czyJestPalindromem(String wyrazenie) throws FullStackException, EmptyStackException {
        char ch;
        int wartoLogiczna = 0;

        for (int i = 0; i < wyrazenie.length(); i++) {
            ch = wyrazenie.charAt(i);
            stosNormalny.push(ch);
            stosOdwrocony.push(ch);
        }
        stosOdwrocony.reverse();
        System.out.println(stosOdwrocony.pop());
        System.out.println(stosNormalny.pop());
        while (!stosOdwrocony.isEmpty()) {
            if (stosOdwrocony.pop() != stosNormalny.pop()) {
                wartoLogiczna++;
            }
        }

        if (wartoLogiczna == 0) {
            return true;
        } else return false;
    }
}
