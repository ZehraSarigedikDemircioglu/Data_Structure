package com.cydeo;

import java.util.LinkedList;
import java.util.Queue;

public class MyTree {
    TNode root;

    public MyTree() {
    }

    void insert(int value) {

        TNode tNode = new TNode(value);
        if (root == null) { // if it is empty
            root = tNode;
            return;
        }
        TNode current = root;
        while (true){
            if(value <= current.value){
                if(current.leftChild == null) {
                    // if left is null insert here
                    current.leftChild = tNode;
                    break;
                }
                //if leftChild is not null branch into left subtree
                    current = current.leftChild;
            }else{ // value > current
                if(current.rightChild == null) {
                    // if right is null insert here
                    current.rightChild = tNode;
                    break;
                }
                //if rightChild is not null branch into right subtree
                current = current.rightChild;
            }
        }
    }
    // Root - Left - Right
    void preOrderTraversal(TNode root){
        if(root == null) {
            return;
        }
            System.out.print(root.value + ", "); // visit root
            preOrderTraversal(root.leftChild); // visit left subtree
            preOrderTraversal(root.rightChild); // visit right subtree
        }
    // Left - Root - Right
    void inOrderTraversal(TNode root){
        if(root == null) {
            return;
        }
        inOrderTraversal(root.leftChild); // visit left subtree
        System.out.print(root.value + ", "); // visit root
        inOrderTraversal(root.rightChild); // visit right subtree
    }
    // Left - Root - Right
    void postOrderTraversal(TNode root){
        if(root == null) {
            return;
        }
        postOrderTraversal(root.leftChild); // visit left subtree
        postOrderTraversal(root.rightChild); // visit right subtree
        System.out.print(root.value + ", "); // visit root
    }

    void levelOrderTraversal(TNode root){

        if(root== null) {
            return;
        }
        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TNode toVisit = queue.poll();
            System.out.print(toVisit.value + ", ");
            if(toVisit.leftChild != null){
                queue.add(toVisit.leftChild);
            }
            if(toVisit.rightChild != null){
                queue.add(toVisit.rightChild);
            }
        }
    }


}
