import java.util.ArrayList;

class RedBlackNode<String> {
    public static final int BLACK = 0;
    public static final int RED = 1;
    public String key;
    public RedBlackNode<String> parent;
    public RedBlackNode<String> left;
    public RedBlackNode<String> right;
    public int numLeft;
    public int numRight;
    public int color;
    public ArrayList<Integer> lines;
    public RedBlackNode next;


    RedBlackNode(String s, ArrayList<Integer> lines) {
        color = BLACK;
        numLeft = 0;
        numRight = 0;
        parent = null;
        left = null;
        right = null;
        key = s;
        this.lines = lines;

    }
}
