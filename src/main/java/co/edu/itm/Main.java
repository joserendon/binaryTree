package co.edu.itm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var tree = createBinaryTree(scanner);

        System.out.println("Seleccione el tipo de recorrido:");
        System.out.println("1. Inorden");
        System.out.println("2. Preorden");
        System.out.println("3. Postorden");

        var option = readIntegerValue(scanner);

        switch (option) {
            case 1:
                System.out.println("Recorrido en inorden:");
                tree.inOrder(tree.getRoot());
                break;
            case 2:
                System.out.println("Recorrido en preorden:");
                tree.preOrder(tree.getRoot());
                break;
            case 3:
                System.out.println("Recorrido en postorden:");
                tree.postOrder(tree.getRoot());
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
    }

    public static int readIntegerValue(Scanner scanner) {
        String input;
        do {
            input = scanner.nextLine();
            if (!input.isEmpty()) {
                if (input.matches("^\\d+$")) {
                    return Integer.parseInt(input);
                } else {
                    System.out.printf("\"%s\" no es un número válido%n", input);
                }
            }
        } while (true);
    }

    public static BinaryTree createBinaryTree(Scanner scanner) {

        System.out.println("Ingrese el nodo raiz:");

        var value = readIntegerValue(scanner);
        var rootNode = new Node(value);
        var tree = new BinaryTree();
        tree.setRoot(rootNode);

        createSubTree(rootNode, scanner);

        return tree;
    }

    public static void createSubTree(Node parent, Scanner scanner) {
        System.out.println(String.format("¿El nodo %s tiene un hijo izquierdo? (S/N)", parent.getValue()));
        String option = scanner.next();
        if (option.equalsIgnoreCase("S")) {
            System.out.println("Ingrese el valor del hijo izquierdo:");
            var value = readIntegerValue(scanner);
            var leftChild = new Node(value);
            parent.setLeft(leftChild);
            createSubTree(leftChild, scanner);
        }

        System.out.println(String.format("¿El nodo %s tiene un hijo derecho? (S/N)", parent.getValue()));
        option = scanner.next();
        if (option.equalsIgnoreCase("S")) {
            System.out.println("Ingrese el valor del hijo derecho:");
            var value = readIntegerValue(scanner);
            var rightChild = new Node(value);
            parent.setRigth(rightChild);
            createSubTree(rightChild, scanner);
        }
    }
}

