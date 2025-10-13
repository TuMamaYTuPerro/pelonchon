package com.pelones.app.utils;
import java.util.Arrays;

public class DynamicArray<T> {
    private int capacity;
    private int position;
    private Object[] array;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.position = 0;
        this.array = new Object[capacity];
    }

    public DynamicArray() {
        this.capacity = 10;
        this.position = 0;
        this.array = new Object[capacity];
    }

    public int size() {
        return position;
    }

    public void add(T member) {
        if(position > capacity-1) {
            grow();
        }
        array[position] = member;
        position++;
    }

    @SuppressWarnings("unchecked") // Suppress the unchecked cast warning
    public T peek() {
        return (T) array[position-1];
    }

    private void grow() {
        this.capacity *= 2;
        Object[] newArray = Arrays.copyOf(this.array,this.capacity);
        this.array = newArray;
    }

    @SuppressWarnings("unchecked") // Suppress the unchecked cast warning
    public T getAt(int index) throws ArrayIndexOutOfBoundsException {
        if(index >= position || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (T) array[index];
    }

    public void erase(int index) throws ArrayIndexOutOfBoundsException {
        if(index >= position || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (index < position-1){
            for(int i = index; i < position; i++){
                array [index] = array[index + 1];
                index++;
            }
        }
        position--;
    }

    public int search(T toSearch){

        for(int index = 0; index <= position; index++) {
            if(toSearch.equals(array[index])) {
                return index;
            }
        }
        return -1;
    }

}
