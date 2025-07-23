package com.fundamental.datastructures;


public class DynamicArray {

    private int capacity;
    private int length;
    private int[] arr;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.length = 0;
        this.arr = new int[this.capacity];
    }

    public void set(int i, int n) {
        this.arr[i] = n;
    }

    public int get(int i) {
        return this.arr[i];
    }

    public void pushback(int n) {
        if (this.length == this.capacity) resize();
        this.arr[length] = n;
        length++;
    }

    public int popback() {
        length--;
        return this.arr[length];
    }

    public void resize() {
        this.capacity *= 2;
        int[] newArr = new int[this.capacity];
        for (int i = 0; i < this.arr.length; i++) {
            newArr[i] = this.arr[i];
        }
        this.arr = newArr;
    }

    public int getSize() {
        return this.length;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
