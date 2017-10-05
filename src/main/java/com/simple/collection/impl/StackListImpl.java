package com.simple.collection.impl;

import com.simple.collection.AbstractList;
import com.simple.collection.StackADT;

import java.util.List;

/**
 * Created by akeem on 10/5/17.
 */
public class StackListImpl <T> implements StackADT<T> {

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public void push(T t) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public <T1> T1[] toArray() {
        return null;
    }

    @Override
    public AbstractList<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
