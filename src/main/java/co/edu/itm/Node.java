package co.edu.itm;

public class Node {
    private int value;
    private Node left;
    private Node rigth;

    public Node(int value) {
        this.value = value;
        left = null;
        rigth = null;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRigth() {
        return rigth;
    }

    public void setRigth(Node rigth) {
        this.rigth = rigth;
    }
}
