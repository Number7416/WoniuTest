package com.woniu.collectiontest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 集合元素的遍历操作, 使用迭代器接口Iterator.
 * Iterator 不是容器,不可存放对象.用来遍历集合.
 * 内部的方法:hasNext和next()
 * */

public class IterableTest {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add("asd");

        Iterator iter = coll.iterator();
        while (iter.hasNext()) {//指针下移
            System.out.println(iter.next());//将下移以后集合位置上的元素返回.
        }

        //错误写法一:会对集合中的元素间隔输出.会报:NoSuchElementException异常.
        /*
        Iterator iterator = coll.iterator();
        while(iterator.next() != null) {
            System.out.println(iterator.next());
        }
        */

        //错误写法二:会陷入死循环,不停的输出第一个元素,原因是每调一次iterator方法就会重新得到一个迭代器.
        //每次指针都会重置.
        while(coll.iterator().hasNext()){//判断指针指向元素的下一个位置有没有元素.
            System.out.println(coll.iterator().next());//输出指针指向元素的下一个位置的元素.
        }
    }

}
