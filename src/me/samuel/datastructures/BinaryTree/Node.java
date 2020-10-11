package me.samuel.datastructures.BinaryTree;

public class Node {
    public int key;
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}
