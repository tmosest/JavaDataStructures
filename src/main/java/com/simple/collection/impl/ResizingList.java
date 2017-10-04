package com.simple.collection.impl;

import com.simple.collection.ListADT;

/**
 * Created by akeem on 10/3/17.
 */
public class ResizingList <T> implements ListADT<T> {

    private T[] t;
    private int size;

    public ResizingList () {
        size = 0;
        t  = (T[]) new Object [10];
    }

    public void push(T newObject) {
        if(full()) {
            resize(t.length * 2);
        }
        t[size++] = newObject;
    }

    public T pop() {
        if(isEmpty()) {
            return null;
        }

        T toReturn = t[--size];
        if(halfEmpty()) {
            resize(t.length / 2);
        }
        return toReturn;
    }


    public T peek() {
        if(isEmpty()) {
            return null;
        }
        return t[size - 1];
    }

    public T get(int index) {
        if(size < 0 && size >= t.length) {
            return null;
        }
        return t[index];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public int indexOf(T object) {

        for (int i = 0; i < this.t.length; i++) {
            if(object.equals(t[i])) {
                return i;
            }
        }
        return -1;
    }

    void resize(int newLength) {
        T newT[] = (T[]) new Object[ newLength];
        copy(t, newT);
        t = newT;
    }

    void copy(T[] t, T[] newT ) {
        int smaller = t.length < newT.length ? t.length : newT.length;
        for (int i = 0; i < smaller; i++) {
            newT[i] = t[i];
        }
    }

    boolean halfEmpty() {
        return (( size() * 4) < t.length);
    }

    boolean full() {
        return (size == t.length);
    }

}
