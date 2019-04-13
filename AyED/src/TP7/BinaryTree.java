package TP7;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class BinaryTree<T> {

    Node<T> root;

    BinaryTree(T key){
        root = new Node<>(key); //This way i can just append nodes to the tree.
    }

    BinaryTree(){ root = null; }

    int weight(){
        return getWeight(root);
    }
    int height() { return getHeight(root); }
    List<Node> getTreeLeaves(){
        return getLeaves(root);
    }
    // Additional methods.


    // Exercise 13.

    int getWeight(Node node){
        if (node == null)
            return 0;
        else
            return (getWeight(node.left) + 1 + getWeight(node.right));
    }

    int getHeight(Node node){
        if (node == null)
            return 0;
        else{
            int lheight = getHeight(node.left);
            int rheight = getHeight(node.right);

            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }


    List<Node> getLeaves(Node node){
        List<Node> leaves = new ArrayList<>();
        if (node == null)
            return null;

        Stack<Node> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()){
            Node n = stack.pop();

            if (n.right != null){
                stack.add(n.right);
            }

            if (n.left != null){
                stack.add(n.left);
            }
            if (n.left == null && n.right == null){
                leaves.add(n);
            }
        }
        return leaves;
    }



    // Preorder, inorder, postorder, by levels.

     void printPostorder(Node node){
        if (node == null)
            return;
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.println(node.getInfo() + " ");
    }

    void printInorder(Node node){
        if (node == null)
            return;
        printPostorder(node.left);
        System.out.println(node.getInfo() + " ");
        printPostorder(node.right);
    }

    void printPreorder(Node node){
        if (node == null)
            return;
        System.out.println(node.getInfo() + " ");
        printPostorder(node.left);
        printPostorder(node.right);
    }

    void printLevels(Node node){
        int h = getHeight(node);
        for (int i = 1; i <=h; i++){
            printAtLevels(root, i);
        }

    }

    void printAtLevels(Node root, int level){
        if (root == null)
            return;
        if (level == 1)
            System.out.println(root.getInfo() + " ");
        else if (level > 1)
            printAtLevels(root.left, level-1);
        printAtLevels(root.right, level-1);

    }




}
