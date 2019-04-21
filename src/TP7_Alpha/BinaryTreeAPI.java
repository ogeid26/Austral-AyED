package TP7_Alpha;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


/*
areSimilar= elements are the same, nodes in different order
 */

public class BinaryTreeAPI {

	// ADDITIONAL METHODS.

	// Exercise 13
	// ________________________________________________________________________________________

	// Tree weight.

	public static int getWeight(BinaryTree tree) {
		if (tree.isEmpty())
			return 0;
		return 1 + getWeight(tree.getLeft()) + getWeight(tree.getRight());
	}

	// Leaf num of a tree.

	public static int leafNum(BinaryTree<?> tree) {
		if (tree.isEmpty()) {
			return 0;
		}
		if (tree.getLeft().isEmpty() && tree.getRight().isEmpty()) {
			return 1;
		} else {
			return leafNum(tree.getLeft()) + leafNum(tree.getRight());
		}

	}
	// Number of occurrences of an element.

	public static <T extends Comparable<T>> int occurrence(BinaryTree<T> tree, T element) {
		if (tree.isEmpty())
			return 0;
		if (tree.getRootValue().compareTo(element) == 0)
			return 1 + occurrence(tree.getLeft(), element) + occurrence(tree.getRight(), element);
		else
			return occurrence(tree.getLeft(), element) + occurrence(tree.getRight(), element);
	}


	//print by levels
	public static <T extends Comparable<T>> void printLevel(BinaryTree<T> tree, int level) {
		if (tree.isEmpty()) {
			return;
		} else if (level == 0) {
			System.out.println(tree.getRootValue().toString());
		} else {
			printLevel(tree.getLeft(), level - 1);
			printLevel(tree.getRight(), level - 1);
		}
	}

	// Num of elements on a given level

	public static int getAtLevel(BinaryTree<?> tree, int level) {

		if (tree.isEmpty())
			return 0;

		if (level == 0)
			return 1;

		return getAtLevel(tree.getLeft(), level - 1) + getAtLevel(tree.getRight(), level - 1);
	}

	// Tree height.
	public static <T extends Comparable<T>> int getHeight(BinaryTree<T> tree) {
		// As i couldn't find any recursive approach to this, i made an iterative one using queues.

		if (tree.isEmpty())
			return 0;

		int height = 0;
		Queue<DoubleNode> q = new LinkedList<>();

		q.add(tree.getRoot());
		while (true) {

			int nodeCount = q.size();
			if (nodeCount == 0)
				return height;
			height++;

			while (nodeCount > 0) {
				DoubleNode<T> newNode = q.peek();
				q.remove();
				if (newNode.left != null)
					q.add(newNode.left);
				if (newNode.right != null)
					q.add(newNode.right);
				nodeCount--;
			}
		}
	}


	// Exercise 14
	// ________________________________________________________________________________________
	//Point A

	// Given an integer binary tree:
	// Find the sum of its elements.

	public static int getSumInteger(BinaryTree<Integer> integerBinaryTree) {

		if (integerBinaryTree.isEmpty()) {
			return 0;
		}
		return (integerBinaryTree.getRootValue() + getSumInteger(integerBinaryTree.getLeft()) + getSumInteger(integerBinaryTree.getRight()));

	}


	// Find the sum of elements divisible by three.

	public static int getSumIntegerDiv3(BinaryTree<Integer> integerBinaryTree) {

		if (integerBinaryTree.isEmpty()) {
			return 0;
		} else if (integerBinaryTree.getRootValue() % 3 == 0) {
			return integerBinaryTree.getRootValue();
		}
		return getSumIntegerDiv3(integerBinaryTree.getLeft()) + getSumIntegerDiv3(integerBinaryTree.getRight());
	}

	// Point B

	// Check if two trees are the same

	public static <T extends Comparable<T>> boolean areIdentical(BinaryTree<T> t1, BinaryTree<T> t2) {
		return (t1.getRootValue() == t2.getRootValue() && areIdentical(t1.getLeft(), t2.getLeft())
				&& areIdentical(t1.getRight(), t2.getRight()));
	}

	// Check if two trees are isomorphic

	public static <T extends Comparable<T>> boolean areIsomorphic(BinaryTree<T> tree1, BinaryTree<T> tree2) {
		if (tree1.isEmpty() && tree2.isEmpty())
			return true;
		if (tree1.isEmpty() || tree2.isEmpty())
			return false;
		return (areIsomorphic(tree1.getLeft(), tree1.getLeft()) && areIsomorphic(tree1.getRight(), tree2.getRight())
				|| areIsomorphic(tree1.getLeft(), tree2.getRight()) && areIsomorphic(tree1.getRight(), tree2.getLeft()));

	}
	// Check if two trees are similar

	public static <T extends Comparable<T>> boolean areSimilar(BinaryTree<T> tree1, BinaryTree<T> tree2) {
		if (!tree1.isEmpty() && !tree2.isEmpty()) {
			if (occurrence(tree1, tree2.getRootValue()) == occurrence(tree2, tree1.getRootValue())) {
				return (areSimilar(tree1.getLeft(), tree2.getLeft()) || areSimilar(tree1.getLeft(), tree2.getRight()))
						&& (areSimilar(tree1.getRight(), tree2.getLeft()) || areSimilar(tree1.getLeft(), tree2.getLeft()));
			}
		}

		return false;

	}

	// Check if a tree is complete

	public static <T extends Comparable<T>> boolean completeNodes(BinaryTree<T> tree) {
		if (tree.isEmpty())
			return true;
		if (tree.getLeft().isEmpty())
			return completeNodes(tree.getRight());
		if (tree.getRight().isEmpty())
			return completeNodes(tree.getLeft());
		return completeNodes(tree.getRight()) && completeNodes(tree.getLeft());
	}
	// Check if a tree is full

	public static <T extends Comparable<T>> boolean isFull(BinaryTree<T> tree) {

		if (tree.isEmpty()) {
			return true;
		}
		if (!tree.getLeft().isEmpty() && !tree.getRight().isEmpty()) {
			return true;
		} else {
			return isFull(tree);
		}
	}
	// Check if a tree is stable

	public static <T extends Comparable<T>> boolean isStable(BinaryTree<Double> t) {

		if (t.isEmpty())
			return true;
		if (t.getLeft().isEmpty() && t.getRight().isEmpty())
			return true;
		if (t.getLeft().getRootValue() < t.getRootValue() && t.getRight().getRootValue() < t.getRootValue())
			return true;
		return isStable(t.getLeft()) && isStable(t.getRight());
	}

	// Check if a tree is a subtree of other tree

	public static <T extends Comparable<T>> boolean isSubtree(BinaryTree<T> father, BinaryTree<T> son) {

		if (son.isEmpty())
			return true;
		if (father.isEmpty())
			return false;
		if (areIdentical(father, son))
			return true;
		return isSubtree(father.getLeft(), son) || isSubtree(father.getLeft(), son);


	}

	// Print the frontier (all leaves)

	public static <T extends Comparable<T>> void showFrontier(BinaryTree<T> tree) {

		if (tree.isEmpty()) {
			return;
		}
		if (tree.getLeft().isEmpty() && tree.getRight().isEmpty()) {
			System.out.println(tree.getRootValue());
		} else {
			showFrontier(tree.getLeft());
			showFrontier(tree.getRight());

		}

	}

	// Return an Array list of frontier elements.

	public static <T extends Comparable<T>> ArrayList<T> frontier(BinaryTree<T> tree) {

		ArrayList<T> leaves = new ArrayList<>();

		Stack<DoubleNode<T>> s = new Stack<>();
		s.push(tree.root);

		while (!s.isEmpty()) {
			DoubleNode<T> node = s.pop();

			if (!tree.getLeft().isEmpty())
				s.push(tree.getLeft().root);

			if (!tree.getRight().isEmpty())
				s.push(tree.getRight().root);
			if (tree.getLeft().isEmpty() && tree.getRight().isEmpty())
				leaves.add(tree.getRootValue());
		}
		return leaves;

	}


	// Traverse trees:
	// ________________________________________________________________________________________
	// Pre-order
	public static <T extends Comparable<T>> void preorder(BinaryTree<T> tree) {
		if (!tree.isEmpty()) {
			System.out.println(tree.getRootValue());
			inorder((tree.getLeft()));
			inorder(tree.getRight());
		}
	}

	// Inorder
	public static <T extends Comparable<T>> void inorder(BinaryTree<T> tree) {
		if (!tree.isEmpty()) {
			inorder((tree.getLeft()));
			System.out.println(tree.getRootValue());
			inorder(tree.getRight());
		}
	}

	// Post-order
	public static <T extends Comparable<T>> void postorder(BinaryTree<T> tree) {
		if (!tree.isEmpty()) {
			inorder((tree.getLeft()));
			inorder(tree.getRight());
			System.out.println(tree.getRootValue());
		}
	}


    /*
    Save binary tree to disk
     */

	public static void save(String filePath, BinaryTree<?> tree) {
		try (FileOutputStream fileOutputStream = new FileOutputStream(filePath)) {
			final ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(tree);
			objectOutputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	Load binary tree from disk
	 */

	public static <T extends Comparable<T>> BinaryTree<T> load(String filePath) {
		try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
			final ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			final BinaryTree<T> loadedTree = (BinaryTree<T>) objectInputStream.readObject();
			objectInputStream.close();
			return loadedTree;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}


}
