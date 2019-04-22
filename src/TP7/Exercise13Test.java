package TP7;

public class Exercise13Test {

    public static void main(String[] args){

        BinaryTree<Double> tree = new BinaryTree<>();

        tree.root = new Node<>(1.0);
        tree.root.left = new Node<>(2.0);
        tree.root.right = new Node<>(3.0);
        tree.root.left.left = new Node<>(4.0);
        tree.root.left. right = new Node<>(5.0);
        tree.root.right.left = new Node<>(6.0);
        tree.root.right.right = new Node<>(7.0);

        System.out.println("Level 0: " + tree.root.getInfo());

        System.out.println("Level 1:");
        System.out.println("\t Left offspring: " + tree.root.left.getInfo());
        System.out.println("\t Right offspring: " + tree.root.right.getInfo());

        System.out.println("Level 2:");
        System.out.println("\t Left offspring:" + tree.root.left.left.getInfo() + ", "
        + tree.root.left.right.getInfo());

        System.out.println("\t Right offspring: " + tree.root.right.left.getInfo() + ", "
        + tree.root.right.right.getInfo());
        System.out.println(" ");


        // Analysis.
        System.out.println("The tree has a weight of: " + tree.weight());
        System.out.println("The tree has a height of: " + tree.height());
        System.out.println("The tree's leaves are: ");
        for (Node n : tree.getLeaves(tree.root)) {
            System.out.println(n.getInfo() + " "); }

    }
}
