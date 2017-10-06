package com.simple.collection;

import java.util.Comparator;

/**
 * Created by akeem on 10/3/17.
 * 
 * This interface represents a List as an Abstract Data Type.
 */
public interface ListADT< T > extends  AbstractList <T> {
	/**
     * Get the index of an item in the list.
     * @param t
     * @return
     */
    int indexOf(T t);

	/**
     * Get the item at index i in the list.
     * @param index
     * @return
     */
    T get(int index);

    boolean remove(T t);

    void sort(Comparator<? super T> c);

}
