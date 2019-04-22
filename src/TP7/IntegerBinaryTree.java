package TP7;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IntegerBinaryTree {

    public BinaryTree<Integer> bt;

    public IntegerBinaryTree(){
        bt = new BinaryTree<>();
    }

    int sum(Node root){
        // Recursive sum of the binary tree.

        int sum, sumLeft, sumRight;
        sum = sumLeft = sumRight = 0;
        if (root == null) return 0;

        if (root.left != null){
            sumLeft = sum(root.left);
        }
        if (root.right != null)
            sumRight = sum(root.right);

        return sum = (int)(root.getInfo()) + sumLeft + sumRight;
    }

    int sumMultiplesOf3(Node root){
        // We use an iterative preorder traversal across the tree.
        List<Integer> list = new ArrayList<>();
        if (root == null) return 0;

        Stack<Node> nodeStack = new Stack<>();
        nodeStack.push(root);

        while (!nodeStack.isEmpty()){
            Node node = nodeStack.peek();
            if ((int) node.getInfo() % 3 == 0)
                list.add((Integer) node.getInfo());
            nodeStack.pop();

            if (node.right != null){
                nodeStack.push(node.right);
            }
            if (node.left != null){
                nodeStack.push(node.left);
            }
        }
        int sum = 0;
        for (Integer i : list){
            sum = sum + i;
        }
        return sum;
    }


    }

