package TP8_BST;

public class BinarySearchTree<R extends Comparable<R>, T extends Node<R>> {

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
		return this.root = insert(node, this.root);
	}

	private T insert(T node, T root) {
		if (root == null) {
			return node;
		} else if (node.compareTo(root) > 0) {
			//Node is greater than root => right child
			root.rightChild = insert(node, (T) root.rightChild);
		} else if (node.compareTo(root) < 0) {
			//Node is less than to root => left child
			root.leftChild = insert(node, (T) root.leftChild);
		}
		return root; //equal
	}

	public void remove(R element) {
		this.root = remove(element, this.root);
	}

	private T remove(R element, T root) {
		if (root == null) {
			return null;
		} else if (root.element.compareTo(element) > 0) {
			return remove(element, (T) root.leftChild);
		} else if (root.element.compareTo(element) < 0) {
			return remove(element, (T) root.rightChild);
		} else { //equal
			return null;
		}
	}

	public T search(R element) {
		return search(element, this.root);
	}

	public T search(R element, T root) {
		if (root == null) {
			return null;
		} else if (root.element.compareTo(element) > 0) {
			return search(element, (T) root.leftChild);
		} else if (root.element.compareTo(element) < 0) {
			return search(element, (T) root.rightChild);
		}
		return root;
	}

}
