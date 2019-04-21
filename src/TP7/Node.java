package TP7;

public class Node<T> {

    T info;
    Node<T> left, right;

    public Node(T root){
        info = root;
    }

    public T getInfo() {
        return info;
    }
}
