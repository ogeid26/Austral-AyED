package TP7_Alpha;

import java.io.*;
import java.util.*;
 class BinaryTreeAPI<T> {

	// ADDITIONAL METHODS.

	// Exercise 13
	// ________________________________________________________________________________________

	// Tree weight.

	int getWeight(BinaryTree tree) {
		if (tree.isEmpty())
			return 0;
		return 1 + getWeight(tree.getLeft()) + getWeight(tree.getRight());
	}

	// Leaf num of a tree.
	int leafNum(BinaryTree<T> tree) {
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

	int occurrence(BinaryTree<T> tree, T element) {
		if (tree.isEmpty())
			return 0;
		if (tree.getRootValue().equals(element))
			return 1 + occurrence(tree.getLeft(), element) + occurrence(tree.getRight(), element);
		else
			return occurrence(tree.getLeft(), element) + occurrence(tree.getRight(), element);
	}

	// Num of elements on a given level

	int getAtLevel(BinaryTree<T> tree, int level) {

		if (tree.isEmpty())
			return 0;

		if (level == 0)
			return 1;

		return getAtLevel(tree.getLeft(), level - 1) + getAtLevel(tree.getRight(), level - 1);
	}

	// Tree height.
	int getHeight(BinaryTree<T> tree) {
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

	public int getSumInteger(BinaryTree<Integer> integerBinaryTree) {

		if (integerBinaryTree.isEmpty()) {
			return 0;
		}
		return (integerBinaryTree.getRootValue() + getSumInteger(integerBinaryTree.getLeft()) + getSumInteger(integerBinaryTree.getRight()));

	}


	// Find the sum of elements divisible by three.

	public int getSumIntegerDiv3(BinaryTree<Integer> integerBinaryTree) {

		if (integerBinaryTree.isEmpty()) {
			return 0;
		} else if (integerBinaryTree.getRootValue() % 3 == 0) {
			return integerBinaryTree.getRootValue();
		}
		return getSumIntegerDiv3(integerBinaryTree.getLeft()) + getSumIntegerDiv3(integerBinaryTree.getRight());
	}

	// Point B

	// Check if two trees are the same

	public boolean areIdentical(BinaryTree<T> t1, BinaryTree<T> t2) {
		return (t1.getRootValue() == t2.getRootValue() && areIdentical(t1.getLeft(), t2.getLeft())
				&& areIdentical(t1.getRight(), t2.getRight()));
	}

	// Check if two trees are isomorphic

	public boolean areIsomorphic(BinaryTree<T> tree1, BinaryTree<T> tree2) {
		if (tree1.isEmpty() && tree2.isEmpty())
			return true;
		if (tree1.isEmpty() || tree2.isEmpty())
			return false;
		return (areIsomorphic(tree1.getLeft(), tree1.getLeft()) && areIsomorphic(tree1.getRight(), tree2.getRight())
				|| areIsomorphic(tree1.getLeft(), tree2.getRight()) && areIsomorphic(tree1.getRight(), tree2.getLeft()));

	}
	// Check if two trees are similar

	public boolean areSimilar(BinaryTree<T> tree1, BinaryTree<T> tree2) {
		return false; //TODO

	}

	// Check if a tree is complete

	public boolean completeNodes(BinaryTree<T> tree) {
		if (tree.isEmpty())
			return true;
		if (tree.getLeft().isEmpty())
			return completeNodes(tree.getRight());
		if (tree.getRight().isEmpty())
			return completeNodes(tree.getLeft());
		return completeNodes(tree.getRight()) && completeNodes(tree.getLeft());
	}
	// Check if a tree is full

	public boolean isFull(BinaryTree<T> tree) {

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

	public boolean isStable(BinaryTree<Double> t) {

		if (t.isEmpty())
			return true;
		if (t.getLeft().isEmpty() && t.getRight().isEmpty())
			return true;
		if (t.getLeft().getRootValue() < t.getRootValue() && t.getRight().getRootValue() < t.getRootValue())
			return true;
		return isStable(t.getLeft()) && isStable(t.getRight());
	}
	boolean isStableG(BinaryTree<T> t, Comparator<T> comparator){

		if (t.isEmpty())
			return true;
		if (t.getLeft().isEmpty() && t.getRight().isEmpty())
			return true;
		if (comparator.compare(t.getLeft().getRootValue(), t.getRootValue()) < 0 && comparator.compare(t.getRight().getRootValue(),t.getRootValue()) < 0 )
			return true;
		return isStableG(t.getLeft(),comparator) && isStableG(t.getRight(), comparator);
	}


	// Check if a tree is a subtree of other tree

	boolean isSubtree(BinaryTree<T> father, BinaryTree<T> son) {

		if (son.isEmpty())
			return true;
		if (father.isEmpty())
			return false;
		if (areIdentical(father, son))
			return true;
		return isSubtree(father.getLeft(), son) || isSubtree(father.getLeft(), son);


	}

	// Print the frontier (all leaves)

	void showFrontier(BinaryTree<T> tree) {

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

	 ArrayList<T> frontier(BinaryTree<T> tree) {

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
	void preorder(BinaryTree<T> tree) {
		if (!tree.isEmpty()) {
			System.out.println(tree.getRootValue());
			inorder((tree.getLeft()));
			inorder(tree.getRight());
		}
	}

	// Inorder
	void inorder(BinaryTree<T> tree) {
		if (!tree.isEmpty()) {
			inorder((tree.getLeft()));
			System.out.println(tree.getRootValue());
			inorder(tree.getRight());
		}
	}

	// Post-order
	public void postorder(BinaryTree<T> tree) {
		if (!tree.isEmpty()) {
			inorder((tree.getLeft()));
			inorder(tree.getRight());
			System.out.println(tree.getRootValue());
		}
	}

	// By levels

	public void byLevels(BinaryTree<T> tree) {

	}

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

	public static <T> BinaryTree<T> load(String filePath) {
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
