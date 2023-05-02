package com.cydeo;

public class TreeApp {
    public static void main(String[] args) {

        MyTree tree = new MyTree();
        int[] numbers = {10, 6, 8, 20, 4, 9, 5, 17, 42, 47, 29};

        for (int i = 0; i < 11; i++) {
            tree.insert(numbers[i]);
        }
        VisualizeTree.printTree(tree.root, null, false);

        tree.preOrderTraversal(tree.root); // 10, 6, 4, 5, 8, 9, 20, 17, 42, 29, 47
    }
}