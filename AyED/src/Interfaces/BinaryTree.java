package Interfaces;

public interface BinaryTree <T>
{
	/*
	public BinaryTree();
	public BinaryTree(T o);
	public BinaryTree(T o, BinaryTree<T> tleft, BinaryTree<T> tright);
	 */
	public boolean isEmpty();
	public T getRoot();
	public BinaryTree<T> getLeft();
	public BinaryTree<T> getRight();
}