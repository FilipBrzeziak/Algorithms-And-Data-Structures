public class Node {
    String value;
    Node left;
    Node right;
    Node next;


    public Node(String value) {
        this.value = value;
        this.right = null;
        this.left = null;
        this.next = null;


    }

    public String getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}
