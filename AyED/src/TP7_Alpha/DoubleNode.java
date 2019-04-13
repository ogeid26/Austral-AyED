package TP7_Alpha;

public class DoubleNode<T> {

     T elem;
     DoubleNode<T> right, left;

    public DoubleNode(T o){
        elem = o;
        right = left = null;
    }

    public DoubleNode(T o, DoubleNode<T> left, DoubleNode<T> right){
        elem = o;
        this.right = right;
        this.left = left;
    }


}
