public class Zamiana {
    boolean jestoperatorem(char c) {
        return c == ('+') || c == ('-')
                || c == ('*') || c == ('/')
                || c == ('^');
    }

    public boolean jestoperatorem2(char c) {
        return c == ('(') || c == (')');
    }

    public String[] zamiana(String string) {
        String[] tablicaStringow;
        StringBuilder stringBuilder = new StringBuilder();
        int pozycja = 0;
        boolean numerPonownie = false;
        for (int i = 0; i < string.length(); i++) {
            if (jestoperatorem(string.charAt(i)) || jestoperatorem2(string.charAt(i))) {
                pozycja++;
                numerPonownie = false;
            } else {
                if (!numerPonownie) {
                    pozycja++;
                }
                numerPonownie = true;
            }
        }
        tablicaStringow = new String[pozycja];
        pozycja = 0;
        for (int i = 0; i < string.length(); i++) {
            if (jestoperatorem(string.charAt(i)) || jestoperatorem2(string.charAt(i))) {
                if (!stringBuilder.toString().equals("")) {
                    tablicaStringow[pozycja] = stringBuilder.toString();
                    pozycja++;
                }
                stringBuilder.delete(0, 16);
                tablicaStringow[pozycja] = Character.toString(string.charAt(i));
                pozycja++;
            } else {
                stringBuilder.append(string.charAt(i));
            }
        }

        if (!stringBuilder.toString().equals("")) {
            tablicaStringow[pozycja] = stringBuilder.toString();
        }


        return tablicaStringow;
    }
}
