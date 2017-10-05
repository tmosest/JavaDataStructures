package com.simple.collection;

import com.simple.collection.impl.ResizingArray;
import com.simple.collection.impl.ResizingList;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by akeem on 10/5/17.
 */
public class ResizingListTest {

    ListADT<Double> doubleArray;
    ListADT<Integer> intArray;
    ListADT<String> stringArray;

    @Before
    public void setUp() {
        doubleArray = new ResizingList<>();
        intArray = new ResizingList<Integer>();
        stringArray = new ResizingList<String>();
    }


    @Test
    public void indexOfTest() {

    }

    @Test
    public void isEmptyTest() {

    }

    @Test
    public void getTest() {

    }

    @Test
    public void peekTest() {

    }

    @Test
    public void popTest() {

    }

    @Test
    public void pushTest() {

    }

    @Test
    public void sizeTest() {

    }
}
