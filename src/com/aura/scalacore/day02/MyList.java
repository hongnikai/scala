package com.aura.scalacore.day02;

import java.util.ArrayList;
import java.util.List;

/**
 * 实现一个  List 不具备的 Map  方法
 *
 * 难点：
 *
 * 1、使用装饰器设计模式来增强已有的组件List的功能
 *
 */
public class MyList {

    private List<Integer> list;

    public MyList(List<Integer> list){
        this.list = list;
    }

    public List<Integer> map(){
        List<Integer> newList = new ArrayList<>();
        for(Integer i :  list){
            int newResult = i+1;
            newList.add(newResult);
        }
        return newList;
    }

    public List<Integer> map1(){
        List<Integer> newList = new ArrayList<>();
        for(Integer i :  list){
            int newResult = i * 2;
            newList.add(newResult);
        }
        return newList;
    }


    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        MyList myList = new MyList(list);
        List<Integer> newList = myList.map1();

        for(Integer i:  newList){
            System.out.println(i);
        }
    }
}
