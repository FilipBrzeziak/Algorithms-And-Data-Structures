import java.util.Stack;

public class DrzewoBinarne {
    private Node root;

    public void utworzDrzewo(String[] dzialanieonp) {
        Stack<Node> stos = new Stack<>();
        for (int i = 0; i < dzialanieonp.length; i++) {
            Node node = new Node(dzialanieonp[i]);
            if (jestOperatorem(dzialanieonp[i])) {
                node.right = stos.pop();
                node.left = stos.pop();
                stos.push(node);
            } else {
                stos.push(node);
            }
        }
        root = stos.pop();

    }

    public int oblicz(Node node) {
        Node lewy;
        Node prawy;
        if (node.value.equals("*")) {
            if (jestOperatorem(node.left.value)) {
                lewy = new Node(String.valueOf(oblicz(node.left)));
            } else {
                lewy = new Node(node.left.value);
            }
            if (jestOperatorem(node.right.value)) {
                prawy = new Node(String.valueOf(oblicz(node.right)));
            } else {
                prawy = new Node(node.right.value);
            }


            int nodeLeftValue = Integer.parseInt(lewy.value);
            int nodeRightValue = Integer.parseInt(prawy.value);
            return nodeLeftValue * nodeRightValue;

        }
        if (node.value.equals("/")) {
            if (jestOperatorem(node.left.value)) {
                lewy = new Node(String.valueOf(oblicz(node.left)));
            } else {
                lewy = new Node(node.left.value);
            }


            if (jestOperatorem(node.right.value)) {
                prawy = new Node(String.valueOf(oblicz(node.right)));
            } else {
                prawy = new Node(node.right.value);
            }

            int nodeLeftValue = Integer.parseInt(lewy.value);
            int nodeRightValue = Integer.parseInt(prawy.value);
            if (nodeRightValue == 0) {
                System.out.println("Nie dziel przez 0!");
                return 0;
            }
            return nodeLeftValue / nodeRightValue;

        }
        if (node.value.equals("+")) {
            if (jestOperatorem(node.left.value)) {
                lewy = new Node(String.valueOf(oblicz(node.left)));
            } else {
                lewy = new Node(node.left.value);
            }


            if (jestOperatorem(node.right.value)) {
                prawy = new Node(String.valueOf(oblicz(node.right)));
            } else {
                prawy = new Node(node.right.value);
            }

            int nodeLeftValue = Integer.parseInt(lewy.value);
            int nodeRightValue = Integer.parseInt(prawy.value);
            return nodeLeftValue + nodeRightValue;

        }
        if (node.value.equals("-")) {
            if (jestOperatorem(node.left.value)) {
                lewy = new Node(String.valueOf(oblicz(node.left)));
            } else {
                lewy = new Node(node.left.value);

            }


            if (jestOperatorem(node.right.value)) {
                prawy = new Node(String.valueOf(oblicz(node.right)));
            } else {
                prawy = new Node(node.right.value);

            }

            int nodeLeftValue = Integer.parseInt(lewy.value);
            int nodeRightValue = Integer.parseInt(prawy.value);

            return nodeLeftValue - nodeRightValue;

        }
        if (node.value.equals("^")) {
            if (jestOperatorem(node.left.value)) {
                lewy = new Node(String.valueOf(oblicz(node.left)));
            } else {
                lewy = new Node(node.left.value);
            }


            if (jestOperatorem(node.right.value)) {
                prawy = new Node(String.valueOf(oblicz(node.right)));
            } else {
                prawy = new Node(node.right.value);
            }


            int nodeLeftValue = Integer.parseInt(lewy.value);
            int nodeRightValue = Integer.parseInt(prawy.value);
            return (int) Math.pow(nodeLeftValue, nodeRightValue);

        }
        return 0;
    }

    public int oblicz() {
        return oblicz(root);
    }

    public int liczbaLisci(Node node) {
        if (node == null) {
            return 0;
        }
        if (node.right == null && node.left == null) {
            return 1;
        } else {
            return liczbaLisci(node.left) + liczbaLisci(node.right);
        }
    }

    public int liczbaLisci() {
        return liczbaLisci(root);
    }

    public int liczbaWezlow(Node node) {
        if (node == null) {
            return 0;
        }
        return liczbaWezlow(node.left) + liczbaWezlow(node.right) + 1;
    }

    public int liczbaWezlow() {
        return liczbaWezlow(root);
    }

    public int znajdzWysokosc(Node node) {
        if (node == null) {
            return -1;
        }

        int wysokosclewa = znajdzWysokosc(node.left);
        int wysokoscprawa = znajdzWysokosc(node.right);

        if (wysokosclewa > wysokoscprawa) {
            return wysokosclewa + 1;
        } else {
            return wysokoscprawa + 1;
        }
    }

    public int znajdzWysokosc() {
        return znajdzWysokosc(root);
    }

    public boolean jestOperatorem(String znak) {
        if (znak.equals("+") || znak.equals("-") || znak.equals("*") || znak.equals("/") || znak.equals("^") || znak.equals("(") || znak.equals(")")) {
            return true;
        } else return false;
    }

    public void zadanieDodatkowe(Node node) {
        Kolejka queue = new Kolejka();
        queue.enqueue(node);
        while (queue.przod != null) {
            while (queue.przod != null) {
                Node temp = queue.przod;
                System.out.print(queue.przod.value + ", ");
                queue.dequeue();
                if (temp.left != null)
                    queue.enqueue(temp.left);
                if (temp.right != null)
                    queue.enqueue(temp.right);
            }
        }


    }

    public Node getRoot() {
        return root;
    }
}
