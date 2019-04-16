package TP7_Alpha;

import java.io.Serializable;

public class DoubleNode<T> implements Serializable {

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
