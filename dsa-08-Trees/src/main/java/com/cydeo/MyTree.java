package com.cydeo;

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
        while (true){
            TNode current = root;
            if(value <= current.value){
                if(tNode.leftChild == null) {
                    // if left is null insert here
                    current.leftChild = tNode;
                    break;
                }
                //if leftChild is not null branch into left subtree
                    current = current.leftChild;
            }else{ // value > current
                if(tNode.rightChild == null) {
                    // if right is null insert here
                    current.rightChild = tNode;
                    break;
                }
                //if rightChild is not null branch into right subtree
                current = current.rightChild;
            }
        }
    }


}
