package BinaryTree;

public class DoubleNode<T> {

    public T elem;
     DoubleNode<T> right, left;

    public DoubleNode(T o){
        elem = o;
    }

    public DoubleNode(T o, DoubleNode<T> left, DoubleNode<T> right){
        elem = o;
        this.right = right;
        this.left = left;
    }

    public DoubleNode<T> getLeft() {
        return left;
    }

    public DoubleNode<T> getRight() {
        return right;
    }

    public void setLeft(DoubleNode<T> left) {
        this.left = left;
    }
    public void setRight(DoubleNode<T> right) {
        this.right = right;
    }

    public T getElem() {
        return elem;
    }
}
