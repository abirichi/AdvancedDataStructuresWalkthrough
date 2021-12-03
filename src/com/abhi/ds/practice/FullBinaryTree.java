package com.abhi.ds.practice;

// Checking if a binary tree is a full binary tree in Java

class FullBinaryTreeNode {
    int data;
    FullBinaryTreeNode leftChild, rightChild;

    FullBinaryTreeNode(int item) {
        data = item;
        leftChild = rightChild = null;
    }
}

class BinaryTree {
    FullBinaryTreeNode root;

    // Check for Full Binary Tree
    boolean isFullBinaryTree(FullBinaryTreeNode node) {

        // Checking tree emptiness
        if (node == null)
            return true;

        // Checking the children
        if (node.leftChild == null && node.rightChild == null)
            return true;

        if ((node.leftChild != null) && (node.rightChild != null))
            return (isFullBinaryTree(node.leftChild) && isFullBinaryTree(node.rightChild));

        return false;
    }

    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.root = new FullBinaryTreeNode(1);
        tree.root.leftChild = new FullBinaryTreeNode(2);
        tree.root.rightChild = new FullBinaryTreeNode(3);
        tree.root.leftChild.leftChild = new FullBinaryTreeNode(4);
        tree.root.leftChild.rightChild = new FullBinaryTreeNode(5);
        tree.root.rightChild.leftChild = new FullBinaryTreeNode(6);
        tree.root.rightChild.rightChild = new FullBinaryTreeNode(7);

        if (tree.isFullBinaryTree(tree.root))
            System.out.print("The tree is a full binary tree");
        else
            System.out.print("The tree is not a full binary tree");
    }
}