package TP7_Alpha;

import java.nio.DoubleBuffer;
import java.util.LinkedList;
import java.util.Queue;

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

    // Tree height.
    public int getHeight(BinaryTree<T> tree){
        // As i couldn't find any recursive approach ti this, i made an iterative one using queues.

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
        if (integerBinaryTree.getRootValue() % 3 == 0){
            return integerBinaryTree.getRootValue() + getSumIntegerDiv3(integerBinaryTree.getLeft() )+ getSumIntegerDiv3(integerBinaryTree.getRight());
        }
        return 69;
    }

    // Point B
    // Check if two trees are the same
    // Check if two trees are isomorphic
    // Check if two trees are similar
    // Check if a tree is complete

    public int completeNodes(BinaryTree<T> tree){
        if (tree.isEmpty())
            return 0;
        if (tree.getLeft().isEmpty())
            return completeNodes(tree.getRight());
        if (tree.getRight().isEmpty())
            return completeNodes(tree.getLeft());
        return 1 + completeNodes(tree.getRight()) + completeNodes(tree.getLeft());
    }
    // Check if a tree is full
    // Check if a tree is stable
    // Check if a tree is a subtree of other tree
    // Print the frontier (all leaves)
    // Return an Array list of frontier elements.



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
}
