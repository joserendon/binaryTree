package co.edu.itm;

public class BinaryTree {
    private Node root;

    public BinaryTree() {
        root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void inOrder(Node node) {
        if (node == null) return;

        inOrder(node.getLeft());
        System.out.println(node.getValue());
        inOrder(node.getRigth());
    }

    public void preOrder(Node node) {
        if (node == null) return;

        System.out.println(node.getValue());
        preOrder(node.getLeft());
        preOrder(node.getRigth());
    }

    public void postOrder(Node node) {
        if (node == null) return;

        postOrder(node.getLeft());
        postOrder(node.getRigth());
        System.out.println(node.getValue());
    }
}
