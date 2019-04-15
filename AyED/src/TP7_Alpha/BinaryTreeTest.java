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
        System.out.println(" ");

        // We create another tree.

        System.out.println("Now consider the following tree: ");

        // First we create the offspring trees.

        // Left offspring.
        BinaryTree<Double> lll_2 = new BinaryTree<>(13.0);
        BinaryTree<Double> llr_2 = new BinaryTree<>(14.0);
        BinaryTree<Double> ll_2 = new BinaryTree<>(0.0);
        // Complete subtree
        BinaryTree<Double> left_2 = new BinaryTree<>(11.0, lll_2, llr_2);

        //Right offspring.
        BinaryTree<Double> rrl_2 = new BinaryTree<>(15.0);
        BinaryTree<Double> rrr_2 = new BinaryTree<>(16.0);
        BinaryTree<Double> rr_2 = new BinaryTree<>(0.0);

        //Complete subtree
        BinaryTree<Double> right_2 = new BinaryTree<>(12.0, rrl_2, rrr_2);

        // Complete tree.
        BinaryTree<Double> tree_2 = new BinaryTree<>(10.0, left_2, right_2);

        System.out.println("Root tree: " + tree_2.getRootValue());
        System.out.println("Level 1: " + tree_2.getLeft().getRootValue() +  ", " + tree_2.getRight().getRootValue() );
        System.out.println("Level 2: ");
        System.out.println("\t Children of 11.0: " + tree_2.getLeft().getLeft().getRootValue() +  ", " + tree_2.getLeft().getRight().getRootValue());
        System.out.println("\t Children of 12.0: " + tree_2.getRight().getLeft().getRootValue() + ", " +  tree_2.getRight().getRight().getRootValue());
        System.out.println(" ");

        // We compare these trees.

        BinaryTreeAPI comparator = new BinaryTreeAPI();
        System.out.println("Are the trees isomorphic? " + comparator.areIsomorphic(tree, tree_2));
    }
}
