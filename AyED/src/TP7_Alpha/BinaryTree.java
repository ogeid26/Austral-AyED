package TP7_Alpha;

 class BinaryTree<T> {

    public DoubleNode<T> root;

    public BinaryTree(){ root = null;}

    public BinaryTree(T o){
        root = new DoubleNode<>(o);
    }

    public BinaryTree(T o, BinaryTree<T> tLeft, BinaryTree<T> tRight){
        root = new DoubleNode<>(o, tLeft.root, tRight.root);
    }

    public boolean ifFull(){ return !getLeft().isEmpty() && !getRight().isEmpty();}

    public boolean isEmpty(){
        return root == null;
    }

    DoubleNode<T> getRoot(){
        return root;
    }

    public T getRootValue(){
        return root.elem;
    }

    public BinaryTree<T> getLeft(){
        BinaryTree<T> t = new BinaryTree<T>();
        t.root = root.left;
        return t;
    }

    public BinaryTree<T> getRight(){
        BinaryTree<T> t = new BinaryTree<T>();
        t.root = root.right;
        return t;
    }
    



}
