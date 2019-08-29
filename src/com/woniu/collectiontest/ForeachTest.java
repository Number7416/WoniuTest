package com.woniu.collectiontest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class ForeachTest {
    @Test
    public void foreachTest(){
        Collection collection = new ArrayList(4);
        collection.add(1);
        collection.add(2);
        collection.add(2);
        collection.add(3);

        //使用foreach来迭代集合中的元素.
        for (Object coll:
             collection) {
            System.out.println(coll);
        }
    }
}
