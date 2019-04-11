package TP7;

import BinaryTree.*;
import TP7.ejercicio_13.AdditionalMethods;

public class BinaryTreeTest {

    public static void main(String[] args) {

        // First we create the offspring trees.

        // Left offspring.
        BinaryTree<Double> lll = new BinaryTree<Double>(4.0);
        BinaryTree<Double> llr = new BinaryTree<Double>(5.0);
        // Complete subtree
        BinaryTree<Double> left = new BinaryTree<Double>(2.0, lll, llr);

        //Right offspring.
        BinaryTree<Double> rrl= new BinaryTree<Double>(6.0);
        BinaryTree<Double> rrr = new BinaryTree<Double>(7.0);
        //Complete subtree
        BinaryTree<Double> right = new BinaryTree<Double>(3.0, rrl, rrr);

        // Complete tree.
        BinaryTree<Double> tree = new BinaryTree<Double>(1.0, left, right);

        System.out.println("Root tree: " + tree.getRoot());
        System.out.println("Level 1: " + tree.getLeft().getRoot() +  ", " + tree.getRight().getRoot() );
        System.out.println("Level 2: " + tree.getLeft().getLeft().getRoot() +  ", " + tree.getLeft().getRight().getRoot()
        + ", " + tree.getRight().getLeft().getRoot() + ", " +  tree.getRight().getRight().getRoot());

        // We create an instance of the AdditionalMethods class.
        AdditionalMethods<Double> am = new AdditionalMethods<Double>();

        System.out.println("Weight of tree: " + am.getWeight(tree));
    }

}
