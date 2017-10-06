package com.simple.collection;

import com.simple.collection.AbstractList;
import com.simple.collection.ListADT;

import java.util.Comparator;

/**
 * Created by akeem on 10/5/17.
 */
public interface Queue <T> extends ListADT<T> {

     T poll();
     void offer(T t);



}
