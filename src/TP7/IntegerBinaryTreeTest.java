package TP7;

public class IntegerBinaryTreeTest {

    public static void main(String[] args) {
        IntegerBinaryTree ibt = new IntegerBinaryTree();
        ibt.bt.root = new Node<Integer>(4);
        ibt.bt.root.left = new Node<Integer>(3);
        ibt.bt.root.right = new Node<Integer>(6);

        System.out.println("The sum of all members of the integer binary tree is : " + ibt.sum(ibt.bt.root));
        System.out.println("The sum of all members of the integer binary tree that" +
                "are divisible by three is: " + ibt.sumMultiplesOf3(ibt.bt.root));

    }


}
