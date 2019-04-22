package TP7_Alpha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeAPITest {

	// Left offspring.
	BinaryTree<Double> lll = new BinaryTree<>(4.0);
	BinaryTree<Double> llr = new BinaryTree<>(5.0);
	BinaryTree<Double> ll = new BinaryTree<>(2.0);
	// Complete subtree
	BinaryTree<Double> left = new BinaryTree<>(2.0, lll, llr);

	//Right offspring.
	BinaryTree<Double> rrl = new BinaryTree<>(7.0);
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


	@Test
	void getWeight() {

		assertEquals(7, BinaryTreeAPI.getWeight(tree));
	}

	@Test
	void leafNum() {
		assertEquals(4, BinaryTreeAPI.leafNum(tree));

	}

	@Test
	void occurrence() {
		assertEquals(2, BinaryTreeAPI.occurrence(tree, 7.0));

	}

	@Test
	void getAtLevel() {
		assertEquals(2, BinaryTreeAPI.getAtLevel(tree, 1));

	}

	@Test
	void getHeight() {
		assertEquals(3, BinaryTreeAPI.getHeight(tree));
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
		assertEquals(28, BinaryTreeAPI.getSumInteger(treeInt));
	}

	@Test
	void getSumIntegerDiv3() {
		assertEquals(9, BinaryTreeAPI.getSumIntegerDiv3(treeInt));

	}

	@Test
	void areIdentical() {
		assertEquals(false, BinaryTreeAPI.areIdentical(tree, tree_2));
	}

	@Test
	void areSimilar() {
		assertEquals(false, BinaryTreeAPI.areSimilar(tree, tree_2));
	}

	@Test
	void completeNodes() {
		assertEquals(true, BinaryTreeAPI.completeNodes(tree));
	}

	@Test
	void isFull() {
		assertEquals(true, BinaryTreeAPI.isFull(tree));
	}

	@Test
	void isStable() {
	}

	@Test
	void isSubtree() {
		assertEquals(false, BinaryTreeAPI.isSubtree(tree, tree_2));
	}

	@Test
	void showFrontier() {
		BinaryTreeAPI.showFrontier(tree);
	}

	@Test
	void frontier() {
	}

	@Test
	void printLevels(){
		BinaryTreeAPI.printLevel(tree, 2);
	}

	@Test
	void preorder() {
		BinaryTreeAPI.preorder(tree);
	}

	@Test
	void inorder() {
		BinaryTreeAPI.inorder(tree);
	}

	@Test
	void postorder() {
		BinaryTreeAPI.postorder(tree);
	}

	@Test
	void byLevels() {
		BinaryTreeAPI.printLevel(tree, 1);
	}

	final String DESKTOP_PATH = System.getProperty("user.home") + "/Desktop";

	@Test
	void saveAndLoadTree() {
		BinaryTreeAPI.<Double>save(DESKTOP_PATH + "/tree.ser", tree);
		final BinaryTree<Double> loadedTree = BinaryTreeAPI.<Double>load(DESKTOP_PATH + "/tree.ser");
	}
}