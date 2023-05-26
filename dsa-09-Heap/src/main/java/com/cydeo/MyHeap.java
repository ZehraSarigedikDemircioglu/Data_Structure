package com.cydeo;

import java.util.NoSuchElementException;

public class MyHeap {

    int[] items;
    int size;

    public MyHeap(int capacity) {
        this.items = new int[capacity];
        this.size = 0;
    }

    public MyHeap(int[] items) {
        this.items = items;
        this.size = items.length;
    }

    public int peek() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        return items[0];
    }

    public void insert(int value) {
        if (size == items.length) {
            throw new IllegalStateException();
        } else {
            items[size++] = value;
            bubbleUp();
        }
    }

    public void bubbleUp() {

        // index = calculate start point
        int index = size - 1;
        // while index > 0 && parents is less thank child continue
        // 1. swap the parent and child
        // calculate next index = parent index
        while (index > 0 && items[index] > items[parentIndex(index)]) {
            swap(index, parentIndex(index));
            // assign the next index with the parent index
            index = parentIndex(index); // like current = current.next
        }
    }

    public int remove() {
        if (size == 0) {
            throw new NoSuchElementException();
        } else {
            int result = items[0];
            items[0] = items[--size];
            bubbleDown();
            return result;
        }
    }

    public void bubbleDown() {
        int index = 0;
        int largerChildIndex;
        while (index <= size && !isValidParent(index)) {
            largerChildIndex = largerChildIndex(index);
            swap(index, largerChildIndex);
            index = largerChildIndex;
        }
    }

    public boolean isValidParent(int index) {
        if (!hasLeftChild(index)) {
            return true;
        } else {
            boolean isValid = items[index] > items[leftChildIndex(index)];
            if (hasRightChild(index)) {
                isValid= (items[index]>=items[leftChildIndex(index)]&&items[index]>=items[rightChildIndex(index)]);
            }
            return isValid;
        }
    }

    public void swap(int first, int second) {
        int temp = items[first];
        items[first] = items[second];
        items[second] = temp;
    }

    public int parentIndex(int index) {
        return (index - 1) / 2;
    }

    public int leftChildIndex(int index) {
        return index * 2 + 1;
    }

    public int rightChildIndex(int index) {
        return index * 2 + 2;
    }

    public boolean hasLeftChild(int index) {
        return leftChildIndex(index) <= size;
    }

    public boolean hasRightChild(int index) {
        return rightChildIndex(index) <= size;
    }

    public int largerChildIndex(int index) {

        if (!hasLeftChild(index)) { // no child
            return index;
        } else if (!hasRightChild(index)) { // one child - left child
            return leftChildIndex(index);
        } else
            return items[leftChildIndex(index)] > items[rightChildIndex(index)] ? leftChildIndex(index) : rightChildIndex(index);
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(items[i] + ", ");
        }
        System.out.println();
    }
}
