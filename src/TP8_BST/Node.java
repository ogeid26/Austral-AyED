package TP8_BST;

public class Node<T extends Comparable<T>> implements Comparable<Node<T>> {

	public final T element;
	public Node<T> leftChild, rightChild;

	public Node(final T element) {
		this.element = element;
	}

	public Node(final T element, final Node<T> leftChild, final Node<T> rightChild) {
		this.element = element;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}

	@Override
	public int compareTo(final Node<T> o) {
		return this.element.compareTo(o.element);
	}
}

