package TP7;

import BinaryTree.*;

public class BinaryTreeTest {

    public static void main(String[] args) {

        // First we create the offspring trees.

        // Left offpsring.
        BinaryTree<Double> lll = new BinaryTree<Double>(4.0);
        BinaryTree<Double> llr = new BinaryTree<Double>(5.0);
        // Complete subtree
        BinaryTree<Double> left = new BinaryTree<Double>(2.0, lll, llr);

        //Right offspring.
        BinaryTree<Double> rrr = new BinaryTree<Double>(5.0);
        BinaryTree<Double> rrl = new BinaryTree<Double>(6.0);
        //Complete subtree
        BinaryTree<Double> right = new BinaryTree<Double>(4.0, rrl, rrr);






    }

}
