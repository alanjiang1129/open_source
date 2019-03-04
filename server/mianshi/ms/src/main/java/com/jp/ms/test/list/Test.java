package com.jp.ms.test.list;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("第一个元素："+list.getFirst());
        System.out.println("最后一个元素："+list.getLast());
        list.removeFirst();

        //循环
        for(Integer i :list){
            System.out.println(i);
        }
        Integer a = 3;
        list.remove(a);
        for(Integer i :list){
            System.out.println(i);
        }
        //从链表生成子表
        List<Integer> integers = list.subList(1, 3);
        for(Integer i :integers){
            System.out.println(i);
        }
        System.out.println("*******");
        for(Integer i :list){
            System.out.println(i);
        }


        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("1", 1);
        treeMap.put("2", 2);
        treeMap.put("4", 4);
        treeMap.put("3", 3);
        treeMap.put("6", 6);
        treeMap.put("5", 5);

        for(Map.Entry<String,Integer> ss: treeMap.entrySet()){
            System.out.println(ss.getKey()+ss.getValue());
        }
        LinkedHashSet set = new LinkedHashSet();
        set.add(1);
        set.add(2);

    }
}
