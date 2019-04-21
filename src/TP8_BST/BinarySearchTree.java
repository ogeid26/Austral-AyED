package TP8_BST;

public class BinarySearchTree<T extends Node> {

	private T root;

	public BinarySearchTree(final T root) {
		this.root = root;
	}

	public BinarySearchTree() {
		this.root = null;
	}

	public T getRoot() {
		return root;
	}


	public T insert(T node) {
		if (root == null) {
			return this.root = node;
		}
		return insert(node, this.root);
	}

	private T insert(T node, T root) {
		//Node is greater than or equal to root
		if (node.compareTo(root) >= 0) {
			if (root.getRightChild() == null) {
				root.setRightChild(node);
				return node;
			}
			return insert(node, (T) root.getRightChild());
		} else if (root.getLeftChild() == null) {
			root.setLeftChild(node);
			return node;
		}
		return insert(node, (T) root.getLeftChild());
	}

}
