package TP8_BST;

public class Node<T extends Comparable<T>> implements Comparable<Node<T>> {

	private final T element;
	private Node<T> leftChild, rightChild;

	public Node(final T element) {
		this.element = element;
	}

	public Node(final T element, final Node<T> leftChild, final Node<T> rightChild) {
		this.element = element;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}

	public T getElement() {
		return element;
	}

	public Node<T> getLeftChild() {
		return leftChild;
	}

	public Node<T> getRightChild() {
		return rightChild;
	}

	public void setLeftChild(final Node<T> leftChild) {
		this.leftChild = leftChild;
	}

	public void setRightChild(final Node<T> rightChild) {
		this.rightChild = rightChild;
	}

	@Override
	public int compareTo(final Node<T> o) {
		return this.element.compareTo(o.getElement());
	}
}

