package TP7_Alpha;

public class BinaryTreeTest {

    public static void main(String[] args) {

        // First we create the offspring trees.

        // Left offspring.
        BinaryTree<Double> lll = new BinaryTree<>(4.0);
        BinaryTree<Double> llr = new BinaryTree<>(5.0);
        BinaryTree<Double> ll = new BinaryTree<>(2.0);
        // Complete subtree
        BinaryTree<Double> left = new BinaryTree<>(2.0, lll, llr);

        //Right offspring.
        BinaryTree<Double> rrl= new BinaryTree<>(7.0);
        BinaryTree<Double> rrr = new BinaryTree<>(7.0);
        BinaryTree<Double> rr = new BinaryTree<>(3.0);

        //Complete subtree
        BinaryTree<Double> right = new BinaryTree<>(3.0, rrl, rrr);

        // Complete tree.
        BinaryTree<Double> tree = new BinaryTree<>(1.0, left, right);


        System.out.println("Root tree: " + tree.getRootValue());
        System.out.println("Level 1: " + tree.getLeft().getRootValue() +  ", " + tree.getRight().getRootValue() );
        System.out.println("Level 2: ");
        System.out.println("\t Children of 2.0: " + tree.getLeft().getLeft().getRootValue() +  ", " + tree.getLeft().getRight().getRootValue());
        System.out.println("\t Children of 3.0: " + tree.getRight().getLeft().getRootValue() + ", " +  tree.getRight().getRight().getRootValue());
        System.out.println(" ");


        // Create an API object
        BinaryTreeAPI<Double> analyzer = new BinaryTreeAPI<>();

        System.out.println("Weight of tree: " + analyzer.getWeight(tree));
        System.out.println("Amount of leaves in the tree: " + analyzer.leafNum(tree) );
        System.out.println("The times the number 7 appears in the tree is: " + analyzer.occurrence(tree, 7.0));
        System.out.println("The number of elements at the 2nd level is");
        System.out.println("The height of the tree is: " + analyzer.getHeight(tree));
    }
}
