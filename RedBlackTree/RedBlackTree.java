import com.sun.jmx.remote.internal.ArrayQueue;
import sun.misc.Queue;

import java.util.ArrayList;

public class RedBlackTree<T> {
    String tekst;

    private RedBlackNode<String> nil = new RedBlackNode<String>(" ", new ArrayList<>());
    private RedBlackNode<String> root = nil;

    public RedBlackTree() {
        root.left = nil;
        root.right = nil;
        root.parent = nil;
    }

    public RedBlackNode<String> getRoot() {
        return root;
    }

    public void insert(String key, ArrayList<Integer> lines) {
        insert(new RedBlackNode<String>(key, lines));
    }


    private void insert(RedBlackNode<String> z) {

        RedBlackNode<String> x = root; //wskazanie nowego wezla
        RedBlackNode<String> y = nil; //wskazanie wezla


        while (!isnil(x)) {//schodzimy w dol drzewa
            y = x;//y pokazuje na poprzednie wskazanie x
            if (z.key.compareTo(x.key) < 0) {//jezeli klucz przekazanego do metody noda
                //jest mniejsza od x
                x.numLeft++;//inkrementujemy lewa
                x = x.left;//przechodzimy z x na mniejszy (lewy) node
            } else {//jezeli klucz jest wiekszy od x
                x.numRight++;//inkrementujemy lewa
                x = x.right;//przechodzimy z x na wiekszy (prawy) node
            }
        }//dol drzewa

        z.parent = y;//przypisujemy do z rodzica w postaci nowego wezla


        if (isnil(y)) { //jezeli y jest lisciem to zamieniamy root na z
            root = z;
        } else if (z.key.compareTo(y.key) < 0) { //jezeli z klucz jest mniejszy od y
            y.left = z;//mniejszy(lewy) od y jest naszym z
        } else {
            y.right = z;//wiekszy(prawy) od y jest naszym z
        }


        z.left = nil;
        z.right = nil;
        z.color = RedBlackNode.RED;


        insertFix(z);

    }

    private void insertFix(RedBlackNode<String> z) {

        RedBlackNode<String> y = nil;

        while (z.parent.color == RedBlackNode.RED) {//dzialamy dopoki drzewo jest niewywazone
            if (z.parent == z.parent.parent.left) {
                y = z.parent.parent.right;

                if (y.color == RedBlackNode.RED) {
                    z.parent.color = RedBlackNode.BLACK;
                    y.color = RedBlackNode.BLACK;
                    z.parent.parent.color = RedBlackNode.RED;
                    z = z.parent.parent;
                } else if (z == z.parent.right) {


                    z = z.parent;
                    leftRotate(z);
                } else {

                    z.parent.color = RedBlackNode.BLACK;
                    z.parent.parent.color = RedBlackNode.RED;
                    rightRotate(z.parent.parent);
                }
            } else {


                y = z.parent.parent.left;


                if (y.color == RedBlackNode.RED) {
                    z.parent.color = RedBlackNode.BLACK;
                    y.color = RedBlackNode.BLACK;
                    z.parent.parent.color = RedBlackNode.RED;
                    z = z.parent.parent;
                } else if (z == z.parent.left) {

                    z = z.parent;
                    rightRotate(z);
                } else {

                    z.parent.color = RedBlackNode.BLACK;
                    z.parent.parent.color = RedBlackNode.RED;
                    leftRotate(z.parent.parent);
                }
            }
        }

        root.color = RedBlackNode.BLACK;

    }

    public void across() {
        across(root);
    }

    public void across(RedBlackNode n) {
        Queue<RedBlackNode> queue = new Queue<>();
        queue.enqueue(n);
        RedBlackNode node = null;
        while (!queue.isEmpty()) {
            try {
                node = queue.dequeue();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(node.key.toString() + ", ");

            if (node.left != null) { //enqueue
                queue.enqueue(node.left);
            }
            if (node.right != null) { //enqueue
                queue.enqueue(node.right);
            }
        }
    }

    public void remove(String s) {

        RedBlackNode<String> z = search(s);


        RedBlackNode<String> x = nil;
        RedBlackNode<String> y = nil;


        if (isnil(z.left) || isnil(z.right))
            y = z;


        else y = treeSuccessor(z);


        if (!isnil(y.left))
            x = y.left;
        else
            x = y.right;


        x.parent = y.parent;


        if (isnil(y.parent))
            root = x;


        else if (!isnil(y.parent.left) && y.parent.left == y)
            y.parent.left = x;


        else if (!isnil(y.parent.right) && y.parent.right == y)
            y.parent.right = x;


        if (y != z) {
            z.key = y.key;
        }


        fixNodeData(x, y);

        if (y.color == RedBlackNode.BLACK)
            removeFixup(x);
    }


    private void leftRotate(RedBlackNode<String> x) {

        leftRotateFixup(x);

        RedBlackNode<String> y;
        y = x.right;
        x.right = y.left;


        if (!isnil(y.left)) {
            y.left.parent = x;
        }

        y.parent = x.parent;

        if (isnil(x.parent)) {
            root = y;
        } else if (x.parent.left == x) {
            x.parent.left = y;
        } else {
            x.parent.right = y;
        }


        y.left = x;
        x.parent = y;
    }


    private void leftRotateFixup(RedBlackNode x) {


        if (isnil(x.left) && isnil(x.right.left)) {
            x.numLeft = 0;
            x.numRight = 0;
            x.right.numLeft = 1;
        } else if (isnil(x.left) && !isnil(x.right.left)) {
            x.numLeft = 0;
            x.numRight = 1 + x.right.left.numLeft +
                    x.right.left.numRight;
            x.right.numLeft = 2 + x.right.left.numLeft +
                    x.right.left.numRight;
        } else if (!isnil(x.left) && isnil(x.right.left)) {
            x.numRight = 0;
            x.right.numLeft = 2 + x.left.numLeft + x.left.numRight;

        } else {
            x.numRight = 1 + x.right.left.numLeft +
                    x.right.left.numRight;
            x.right.numLeft = 3 + x.left.numLeft + x.left.numRight +
                    x.right.left.numLeft + x.right.left.numRight;
        }

    }


    private void rightRotate(RedBlackNode<String> y) {


        rightRotateFixup(y);


        RedBlackNode<String> x = y.left;
        y.left = x.right;


        if (!isnil(x.right))
            x.right.parent = y;
        x.parent = y.parent;


        if (isnil(y.parent))
            root = x;


        else if (y.parent.right == y)
            y.parent.right = x;


        else
            y.parent.left = x;
        x.right = y;

        y.parent = x;

    }

    public void across1() {
        Queue1 queue = new Queue1();
        queue.enqueueB(root);

        while (queue.front != nil && queue.front != null) {
            RedBlackNode tempNode = queue.dequeueB();
            System.out.println(tempNode.key + " " + tempNode.lines + " ");

            if (tempNode.left != nil && tempNode.right != null) {
                queue.enqueue(tempNode.left);
            }

            if (tempNode.right != nil && tempNode.right != null) {
                queue.enqueue(tempNode.right);
            }

        }
    }


    private void rightRotateFixup(RedBlackNode<String> y) {


        if (isnil(y.right) && isnil(y.left.right)) {
            y.numRight = 0;
            y.numLeft = 0;
            y.left.numRight = 1;
        } else if (isnil(y.right) && !isnil(y.left.right)) {
            y.numRight = 0;
            y.numLeft = 1 + y.left.right.numRight +
                    y.left.right.numLeft;
            y.left.numRight = 2 + y.left.right.numRight +
                    y.left.right.numLeft;
        } else if (!isnil(y.right) && isnil(y.left.right)) {
            y.numLeft = 0;
            y.left.numRight = 2 + y.right.numRight + y.right.numLeft;

        } else {
            y.numLeft = 1 + y.left.right.numRight +
                    y.left.right.numLeft;
            y.left.numRight = 3 + y.right.numRight +
                    y.right.numLeft +
                    y.left.right.numRight + y.left.right.numLeft;
        }

    }

    public RedBlackNode<String> treeMinimum(RedBlackNode<String> node) {


        while (!isnil(node.left))
            node = node.left;
        return node;
    }


    public RedBlackNode<String> treeSuccessor(RedBlackNode<String> x) {


        if (!isnil(x.left))
            return treeMinimum(x.right);

        RedBlackNode<String> y = x.parent;


        while (!isnil(y) && x == y.right) {

            x = y;
            y = y.parent;
        }

        return y;
    }

    private void fixNodeData(RedBlackNode<String> x, RedBlackNode<String> y) {


        RedBlackNode<String> current = nil;
        RedBlackNode<String> track = nil;


        if (isnil(x)) {
            current = y.parent;
            track = y;
        } else {
            current = x.parent;
            track = x;
        }


        while (!isnil(current)) {

            if (y.key != current.key) {


                if (y.key.compareTo(current.key) > 0)
                    current.numRight--;


                if (y.key.compareTo(current.key) < 0)
                    current.numLeft--;
            } else {

                if (isnil(current.left))
                    current.numLeft--;
                else if (isnil(current.right))
                    current.numRight--;


                else if (track == current.right)
                    current.numRight--;
                else if (track == current.left)
                    current.numLeft--;
            }


            track = current;
            current = current.parent;

        }

    }

    private void removeFixup(RedBlackNode<String> x) {

        RedBlackNode<String> w;


        while (x != root && x.color == RedBlackNode.BLACK) {


            if (x == x.parent.left) {


                w = x.parent.right;


                if (w.color == RedBlackNode.RED) {
                    w.color = RedBlackNode.BLACK;
                    x.parent.color = RedBlackNode.RED;
                    leftRotate(x.parent);
                    w = x.parent.right;
                }


                if (w.left.color == RedBlackNode.BLACK &&
                        w.right.color == RedBlackNode.BLACK) {
                    w.color = RedBlackNode.RED;
                    x = x.parent;
                } else {

                    if (w.right.color == RedBlackNode.BLACK) {
                        w.left.color = RedBlackNode.BLACK;
                        w.color = RedBlackNode.RED;
                        rightRotate(w);
                        w = x.parent.right;
                    }

                    w.color = x.parent.color;
                    x.parent.color = RedBlackNode.BLACK;
                    w.right.color = RedBlackNode.BLACK;
                    leftRotate(x.parent);
                    x = root;
                }
            } else {


                w = x.parent.left;


                if (w.color == RedBlackNode.RED) {
                    w.color = RedBlackNode.BLACK;
                    x.parent.color = RedBlackNode.RED;
                    rightRotate(x.parent);
                    w = x.parent.left;
                }


                if (w.right.color == RedBlackNode.BLACK &&
                        w.left.color == RedBlackNode.BLACK) {
                    w.color = RedBlackNode.RED;
                    x = x.parent;
                } else {

                    if (w.left.color == RedBlackNode.BLACK) {
                        w.right.color = RedBlackNode.BLACK;
                        w.color = RedBlackNode.RED;
                        leftRotate(w);
                        w = x.parent.left;
                    }


                    w.color = x.parent.color;
                    x.parent.color = RedBlackNode.BLACK;
                    w.left.color = RedBlackNode.BLACK;
                    rightRotate(x.parent);
                    x = root;
                }
            }
        }


        x.color = RedBlackNode.BLACK;
    }


    public RedBlackNode<String> search(String key) {


        RedBlackNode<String> current = root;


        while (!isnil(current)) {


            if (current.key.equals(key))


                return current;


            else if (current.key.compareTo(key) < 0)
                current = current.right;


            else
                current = current.left;
        }


        return null;

    }

    private boolean isnil(RedBlackNode node) {
        return node == nil;
    }


    public int size() {
        return root.numLeft + root.numRight + 1;
    }

    public void inOrder() {
        inOrder(root);
    }

    public void inOrder(RedBlackNode node) {
        if (node != nil) {
            inOrder(node.left);
            System.out.println(node.key + " " + node.lines + " ");

            inOrder(node.right);
        }
    }
}
