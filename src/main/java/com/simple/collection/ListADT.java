package com.simple.collection;

/**
 * Created by akeem on 10/3/17.
 * 
 * This interface represents a List as an Abstract Data Type.
 */
public interface ListADT< T > {
	/**
     * Get the index of an item in the list.
     * @param t
     * @return
     */
    int indexOf(T t);
	/**
     * Check if the list is empty.
     * @return
     */
    boolean isEmpty();
	/**
     * Get the item at index i in the list.
     * @param index
     * @return
     */
    T get(int index);
    /**
     * Look at the last item in the list but do not remove it.
     * @return
     */
    T peek();
	/**
     * Remove the last item in the list and return it.
     * @return
     */
    T pop();
	/**
	 * Add a new item to the end of the list.
	 * @param t
	 */
    void push(T t);	
    /**
     * Get the size of the list.
     * @return
     */
    int size();
}
