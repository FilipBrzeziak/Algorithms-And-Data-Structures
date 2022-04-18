import java.util.Stack;

public class ONP {
    public int priorytet(String znak) {
        switch (znak) {
            case "+":
            case "-":
                return 1;

            case "*":
            case "'/'":
                return 2;

            case "^":
                return 3;
        }
        return 0;
    }

    public boolean jestOperandem(String znak) {
        if (znak.equals("*") || znak.equals("+") || znak.equals("-") || znak.equals("/") || znak.equals("^") || znak.equals("(") || znak.equals(")")) {
            return false;
        } else return true;
    }

    public String[] onp(String[] dzialanie) {

        //zliczamy liczbe nawiasow aby wiedziec ile zajmie dzialania w onp
        //poniewaz w onp nie uzywa sie nawiasow
        int liczbaNawiasow = 0;
        for (int i = 0; i < dzialanie.length; i++) {
            if (dzialanie[i].equals("(") || dzialanie[i].equals(")")) {
                liczbaNawiasow++;
            }
        }

        String[] onp = new String[dzialanie.length - liczbaNawiasow];
        int pozycja = 0;

        Stack<String> stos = new Stack<>();

        for (int i = 0; i < dzialanie.length; i++) {
            String x = dzialanie[i];
            //jezeli x to liczba to od razu ja dodajemy
            if (jestOperandem(x)) {
                onp[pozycja] = x;
                pozycja++;
            }
            //jezeli x to otwarcie nawiasu to dodajemy go do stosu
            else if (x.equals("(")) {
                stos.push(x);
            } else if (x.equals(")")) {
                while (!stos.isEmpty() && !stos.peek().equals("(")) {
                    onp[pozycja] = stos.pop();
                    pozycja++;
                }
                stos.pop();//pozbywamy sie nawiasu
            } else {
                while (!stos.isEmpty() && priorytet(x) <= priorytet(stos.peek())) {
                    onp[pozycja] = stos.pop();
                    pozycja++;
                }
                stos.push(x);
            }
        }
        while (!stos.isEmpty()) {
            onp[pozycja] = stos.pop();
            pozycja++;
        }
        return onp;


    }
}
