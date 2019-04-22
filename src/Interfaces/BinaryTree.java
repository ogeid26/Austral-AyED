package Interfaces;

public interface BinaryTree <T>
{
	/*
	public BinarySearchTree();
	public BinarySearchTree(T o);
	public BinarySearchTree(T o, BinarySearchTree<T> tleft, BinarySearchTree<T> tright);
	 */
	public boolean isEmpty();
	public T getRoot();
	public BinaryTree<T> getLeft();
	public BinaryTree<T> getRight();
}