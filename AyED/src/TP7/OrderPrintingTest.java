package TP7;

public class OrderPrintingTest {

    public static void main(String[] args){

        BinaryTree<Double> tree = new BinaryTree<>();

        tree.root = new Node<>(20.0);
        tree.root.left = new Node<>(21.0);
        tree.root.right = new Node<>(22.0);
        tree.root.left.left = new Node<>(23.0);
        tree.root.left. right = new Node<>(24.0);
        tree.root.right.left = new Node<>(25.0);
        tree.root.right.right = new Node<>(26.0);

        System.out.println("Now printing in postorder:");
        tree.printPostorder(tree.root);
        System.out.println(" ");

        System.out.println("Now printing in inorder:");
        tree.printInorder(tree.root);
        System.out.println(" ");

        System.out.println("Now printing in preorder:");
        tree.printPreorder(tree.root);
        System.out.println(" ");

        System.out.println("Now printing by levels: :");
        tree.printLevels(tree.root);
        System.out.println(" ");
    }
}
