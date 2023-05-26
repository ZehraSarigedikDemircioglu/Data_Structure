package com.cydeo;

import java.util.NoSuchElementException;

public class MyHeap {

    int[] items;
    int size;

    public MyHeap(int capacity) {
        this.items = new int[capacity];
        this.size = 0;
    }

    public void insert(int value) {
        if (size == items.length) {
            throw new NoSuchElementException();
        } else {
            items[size++]=value;
            bubbleUp();
        }
    }

    public int leftChildIndex(int index) {
        return index * 2 + 1;
    }

    public int rightChildIndex(int index) {
        return index * 2 + 2;
    }

    public int parentChildIndex(int index) {
        return (index - 1) / 2;
    }

    public boolean hasLeftChild(int index) {
        return leftChildIndex(index) < size;
    }

    public boolean hasRightChild(int index) {
        return rightChildIndex(index) < size;
    }

    public int largerChildIndex(int index) {

        if (!hasLeftChild(index)) { // no child
            return index;
        } else if (!hasRightChild(index)) { // one child - left child
            return leftChildIndex(index);
        } else
            return items[leftChildIndex(index)] > items[rightChildIndex(index)] ? leftChildIndex(index) : rightChildIndex(index);
    }

    public void swap(int first, int second) {
        int temp = items[first];
        items[first] = items[second];
        items[second] = temp;
    }

    public boolean isValidParent(int index) {
        if (!hasLeftChild(index)) {
            return true;
        } else {
            boolean isValid = items[index] > items[leftChildIndex(index)];
            if (hasRightChild(index)) {
                isValid = items[index] >= items[rightChildIndex(index)];
            }
            return isValid;
        }
    }
}
