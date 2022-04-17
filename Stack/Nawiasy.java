public class Nawiasy {

    private ArrayStack<Character> stosWyrazen;

    public Nawiasy(int rozmiar) {
        this.stosWyrazen = new ArrayStack<Character>(rozmiar);
    }

    public boolean nawiasyZrownowazone(String wyrazenie) throws EmptyStackException, FullStackException {

        char ch;
        int wartoLogiczna = 0;


        for (int i = 0; i < wyrazenie.length(); i++) {
            ch = wyrazenie.charAt(i);

            if (nawiasOtwierajacy(ch)) {
                stosWyrazen.push(ch);
            }
            if (nawiasZamykajacy(ch)) {
                if (!stosWyrazen.isEmpty()) {
                    char otwierajcy = stosWyrazen.pop();

                    if (!rodzinaNawiasow(otwierajcy, ch)) {
                        wartoLogiczna++;
                    }
                } else {
                    wartoLogiczna++;
                }
            }
        }
        if (!stosWyrazen.isEmpty()) {
            wartoLogiczna++;
        }
        if (wartoLogiczna == 0) {
            return true;
        }
        return false;
    }

    public boolean nawiasOtwierajacy(char ch) {
        if (ch == '(' || ch == '{' || ch == '[') {
            return true;
        }
        return false;
    }

    public boolean nawiasZamykajacy(char ch) {
        if (ch == ')' || ch == '}' || ch == ']') {
            return true;
        }
        return false;
    }

    public boolean rodzinaNawiasow(char otwierajacy, char zamykajacy) {
        if (otwierajacy == '(' && zamykajacy == ')') {
            return true;
        }
        if (otwierajacy == '{' && zamykajacy == '}') {
            return true;
        }
        if (otwierajacy == '[' && zamykajacy == ']') {
            return true;
        } else return false;
    }

    public ArrayStack<Character> getStosWyrazen() {
        return stosWyrazen;
    }

}
