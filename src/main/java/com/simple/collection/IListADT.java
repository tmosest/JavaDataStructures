package com.simple.collection;

/**
 * Created by akeem on 10/3/17.
 */
public interface IListADT< T > {

    void push(T t);

    T pop();

    T get(int index);

    boolean isEmpty();

    int size();

    int indexOf(T t);

    T peek();


}
