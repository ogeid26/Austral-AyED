package TP7_Alpha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeAPITest {

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

    BinaryTreeAPI<Double> analyzer = new BinaryTreeAPI<>();
    @Test
    void getWeight() {

        assertEquals(7, analyzer.getWeight(tree));
    }

    @Test
    void leafNum() {
        assertEquals(4, analyzer.leafNum(tree));

    }

    @Test
    void occurrence() {
        assertEquals(2, analyzer.occurrence(tree, 7.0));

    }

    @Test
    void getAtLevel() {
        assertEquals(2, analyzer.getAtLevel(tree, 1));

    }

    @Test
    void getHeight() {
        assertEquals(3, analyzer.getHeight(tree));
    }


    // Integer binary tree testing.

    Integer one = 1;
    Integer two = 2;
    Integer three = 3;

    // Left offspring.
    BinaryTree<Integer> lllInt = new BinaryTree<>(4);
    BinaryTree<Integer> llrInt = new BinaryTree<>(5);

    // Complete subtree
    BinaryTree<Integer> leftInt = new BinaryTree<>(three, lllInt, llrInt);

    //Right offspring.
    BinaryTree<Integer> rrlInt = new BinaryTree<>(7);
    BinaryTree<Integer> rrrInt = new BinaryTree<>(6);

    //Complete subtree
    BinaryTree<Integer> rightInt = new BinaryTree<>(two, rrlInt, rrrInt);

    // Complete tree.
    BinaryTree<Integer> treeInt = new BinaryTree<>(one, leftInt, rightInt);

    @Test
    void getSumInteger() {
        assertEquals(28, analyzer.getSumInteger(treeInt));
    }

    @Test
    void getSumIntegerDiv3() {
        assertEquals(9, analyzer.getSumIntegerDiv3(treeInt));

    }

    @Test
    void areIdentical() {
        assertEquals(false, analyzer.areIdentical(tree, tree_2));
    }

    @Test
    void areSimilar() {
        assertEquals(false, analyzer.areSimilar(tree, tree_2));
    }

    @Test
    void completeNodes() {
        assertEquals(true, analyzer.completeNodes(tree));
    }

    @Test
    void isFull() {
        assertEquals(true, analyzer.isFull(tree));
    }

    @Test
    void isStable() {
    }

    @Test
    void isSubtree() {
        assertEquals(false, analyzer.isSubtree(tree, tree_2));
    }

    @Test
    void showFrontier() {
        analyzer.showFrontier(tree);
    }

    @Test
    void frontier() {
    }

    @Test
    void preorder() {
        analyzer.preorder(tree);
    }

    @Test
    void inorder() {
        analyzer.inorder(tree);
    }

    @Test
    void postorder() {
        analyzer.postorder(tree);
    }

    @Test
    void byLevels() {
        analyzer.byLevels(tree);
    }
}