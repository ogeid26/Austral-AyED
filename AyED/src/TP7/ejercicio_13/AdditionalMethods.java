package TP7.ejercicio_13;

import BinaryTree.*;

public class AdditionalMethods<T>{

    public  int getWeight(BinaryTree<T> a){
        if (a.isEmpty())
            return 0;
        return 1 + getWeight(a.getLeft()) + getWeight(a.getRight());
    }

    public int  getLeafAmount(){return 0;}

    public int ocurrence(BinaryTree<T> a, T o){
        if (a.isEmpty())
            return 0;
        if (a.getRoot().equals(o))
            return 1 + ocurrence(a.getLeft(), o) + ocurrence(a.getRight(), o);
        else
            return ocurrence(a.getLeft(),o) + ocurrence(a.getRight(), o);
        }

    public int getHeight(){return 0;}
}
