package TP7_Alpha;

import java.nio.DoubleBuffer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeAPI<T> {

    // ADDITIONAL METHODS.

    // Exercise 13
    // ________________________________________________________________________________________

    // Tree weight.

    public int getWeight(BinaryTree tree){
        if (tree.isEmpty())
            return 0;
        return 1 + getWeight(tree.getLeft()) + getWeight(tree.getRight());
    }

    // Leaf num of a tree.

    public int leafNum(BinaryTree<T> tree){
        if (tree.isEmpty()){
            return 0;
        }
        if(tree.getLeft().isEmpty() && tree.getRight().isEmpty()){
            return 1;
        }
        else {
            return leafNum(tree.getLeft())+ leafNum(tree.getRight() );
        }

    }
    // Number of occurrences of an element.

    public int occurrence(BinaryTree<T> tree, T element){
        if (tree.isEmpty())
            return 0;
        if (tree.getRootValue().equals(element))
            return 1 + occurrence(tree.getLeft(),element) + occurrence(tree.getRight(),element);
        else
            return occurrence(tree.getLeft(),element) + occurrence(tree.getRight(),element);
    }

    // Num of elements on a given level

    public int getAtLevel(BinaryTree<T> tree, int level){

        if (tree.isEmpty())
            return 0;

        if ( level == 0)
            return 1 ;

        return getAtLevel(tree.getLeft(), level-1) + getAtLevel(tree.getRight(), level-1);
    }

    // Tree height.
    public int getHeight(BinaryTree<T> tree){
        // As i couldn't find any recursive approach to this, i made an iterative one using queues.

        if (tree.isEmpty())
            return 0;

        int height = 0;
        Queue<DoubleNode> q = new LinkedList<>();

        q.add(tree.getRoot());
        while (true) {

            int nodeCount = q.size();
            if (nodeCount == 0)
                return height;
            height++;

            while (nodeCount > 0){
                DoubleNode<T> newNode = q.peek();
                q.remove();
                if (newNode.left != null)
                    q.add(newNode.left);
                if (newNode.right != null)
                    q.add(newNode.right);
                nodeCount--;
            }
        }
    }


    // Exercise 14
    // ________________________________________________________________________________________
    //Point A

    // Given an integer binary tree:
    // Find the sum of its elements.

    public int getSumInteger(BinaryTree<Integer> integerBinaryTree){

        if (integerBinaryTree.isEmpty()){
            return 0;
        }
        return (integerBinaryTree.getRootValue() + getSumInteger(integerBinaryTree.getLeft()) + getSumInteger(integerBinaryTree.getRight()) );

    }


    // Find the sum of elements divisible by three.

    public int getSumIntegerDiv3(BinaryTree<Integer> integerBinaryTree){

        if (integerBinaryTree.isEmpty()){
            return 0;
        }
        else if (integerBinaryTree.getRootValue() % 3 == 0){
            return integerBinaryTree.getRootValue();
        }
        return getSumIntegerDiv3(integerBinaryTree.getLeft()) + getSumIntegerDiv3(integerBinaryTree.getRight() ) ;
    }

    // Point B

    // Check if two trees are the same

    public boolean areIdentical(BinaryTree<T> t1, BinaryTree<T> t2){

        if (t1.isEmpty() && t2.isEmpty())
            return false;

        if (t1.isEmpty() || t2.isEmpty())
            return false;

        if (!t1.isEmpty() && !t2.isEmpty()){
            return ( t1.getRootValue() == t2.getRootValue() && areIdentical(t1.getLeft(), t2.getLeft())
            && areIdentical(t1.getRight(), t2.getRight()));
        }
        return false;
    }

    // Check if two trees are isomorphic

    public boolean areIsomorphic(BinaryTree<T> tree1, BinaryTree<T> tree2){
        if ( tree1.isEmpty() && tree2.isEmpty() )
            return true;
        if ( tree1.isEmpty() || tree2.isEmpty() )
            return false;
        return (areIsomorphic(tree1.getLeft(), tree1.getLeft()) && areIsomorphic(tree1.getRight(), tree2.getRight())
        || areIsomorphic(tree1.getLeft(), tree2.getRight()) && areIsomorphic(tree1.getRight(), tree2.getLeft()));

    }
    // Check if two trees are similar

    public boolean areSimilar(BinaryTree<T> tree1, BinaryTree<T> tree2){
            return false; //TODO

    }

    // Check if a tree is complete

    public boolean completeNodes(BinaryTree<T> tree){
        if (tree.isEmpty())
            return true;
        if (tree.getLeft().isEmpty())
            return completeNodes(tree.getRight());
        if (tree.getRight().isEmpty())
            return completeNodes(tree.getLeft());
        return completeNodes(tree.getRight()) && completeNodes(tree.getLeft());
    }
    // Check if a tree is full

    public boolean isFull(BinaryTree<T> tree){

        if (tree.isEmpty()){
            return true;
        }
        if(!tree.getLeft().isEmpty() && !tree.getRight().isEmpty()){
            return true;
        }
        else {
            return isFull(tree);
        }
    }
    // Check if a tree is stable

    public boolean isStable(BinaryTree<Double> t){

        if (t.isEmpty())
            return true;
        if (t.getLeft().isEmpty() && t.getRight().isEmpty())
            return true;
        if (t.getLeft().getRootValue() < t.getRootValue() && t.getRight().getRootValue() < t.getRootValue())
            return true;
        return isStable(t.getLeft()) && isStable(t.getRight() );
    }

    // Check if a tree is a subtree of other tree

    public boolean isSubtree(BinaryTree<T> father, BinaryTree<T> son){

        if (son.isEmpty())
            return true;
        if (father.isEmpty())
            return false;
        if (areIdentical(father,son))
            return true;
        return isSubtree(father.getLeft(), son) || isSubtree(father.getLeft(), son);


    }

    // Print the frontier (all leaves)

    public void showFrontier(BinaryTree<T> tree){

        if (tree.isEmpty()){
            return;
        }
        if(tree.getLeft().isEmpty() && tree.getRight().isEmpty()){
            System.out.println(tree.getRootValue());
        }
        else {
            showFrontier(tree.getLeft());
            showFrontier(tree.getRight());

        }

    }

    // Return an Array list of frontier elements.

    public ArrayList<T> frontier(BinaryTree<T> tree){

        ArrayList<T> leaves = new ArrayList<>();

        Stack<DoubleNode<T>> s = new Stack<>();
        s.push(tree.root);

        while (!s.isEmpty()){
            DoubleNode<T> node = s.pop();

            if (!tree.getLeft().isEmpty())
                s.push(tree.getLeft().root);

            if (!tree.getRight().isEmpty())
                s.push(tree.getRight().root);
            if (tree.getLeft().isEmpty() && tree.getRight().isEmpty())
                leaves.add(tree.getRootValue());
        }
        return leaves;

    }



    // Traverse trees:
    // ________________________________________________________________________________________
    // Pre-order
    public void preorder(BinaryTree<T> tree){
        if (!tree.isEmpty()) {
            System.out.println(tree.getRootValue());
            inorder((tree.getLeft()));
            inorder(tree.getRight());
        }
    }
    // Inorder
    public void inorder(BinaryTree<T> tree){
        if (!tree.isEmpty()){
            inorder((tree.getLeft()));
            System.out.println(tree.getRootValue());
             inorder(tree.getRight());
        }
    }
    // Post-order
    public void postorder(BinaryTree<T> tree){
        if (!tree.isEmpty()) {
            inorder((tree.getLeft()));
            inorder(tree.getRight());
            System.out.println(tree.getRootValue());
        }
    }

    // By levels

    public void byLevels(BinaryTree<T> tree) {

        int h = getHeight(tree);
        for (int i = 1; i <= h; i++){
            byLevelsAux(tree, i);
        }
    }

    public void byLevelsAux(BinaryTree<T> tree, int level){
        //TODO

        /*
        if (tree.isEmpty())

            return;
        if (level == 1)
            System.out.println(tree.getRootValue());
        else if (level > 1){
            byLevelsAux(tree.getLeft(), level-1);
            byLevelsAux(tree.getRight(), level-1);
        }
        */
    }




}
