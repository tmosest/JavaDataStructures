package com.simple.collection.impl;


import com.simple.collection.AbstractList;
import com.simple.collection.Queue;

import java.util.Comparator;

/**
 * Created by akeem on 10/5/17.
 */
public class QueueList<T> implements Queue<T> {

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public int indexOf(T t) {
        return 0;
    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public boolean remove(T t) {
        return false;
    }

    @Override
    public void sort(Comparator<? super T> c) {

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

    @Override
    public T poll() {
        return null;
    }

    @Override
    public void offer(T t) {

    }
}
