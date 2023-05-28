package com.cydeo;

public class HeapApp {
    public static void main(String[] args) {

        MyHeap heap = new MyHeap(10);
        heap.insert(61);
        heap.insert(120);
        heap.insert(52);
        heap.insert(45);
        heap.insert(81);
        heap.printHeap(); // 120, 81, 52, 45, 61
        System.out.println(heap.remove()); // 120
        System.out.println("Heap values after removing 120");
        heap.printHeap(); // 81, 61, 52, 45
        heap.insert(130);
        heap.printHeap(); // 130, 81, 52, 45, 61

        int[] numbers = {1, 2, 5, 6, 8, 21, 0};
        MyHeap heap1 = new MyHeap(numbers);
        heap1.printHeap(); // 21, 8, 5, 6, 2, 1, 0,

        int[] numbers2 = {5, 8, 6, 8, 8, 2, 1, 5, 7, 6, 7, 4};
        MyHeap heap2 = new MyHeap(numbers2);
        heap2.printHeap(); // 8, 8, 6, 8, 7, 4, 1, 5, 7, 6, 5, 2,
    }
}