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
public class MyList1 {

    private List<Integer> list;

    public MyList1(List<Integer> list){
        this.list = list;
    }

    public List<Integer> map1(){
        List<Integer> newList = new ArrayList<>();
        for(Integer i :  list){
            int newResult = i+1;
            newList.add(newResult);
        }
        return newList;
    }

    // Operation最好是一个接口。
    public List<Integer> map(Operation o){

        List<Integer> newList = new ArrayList<>();
        for(Integer i :  list){

            // 这个地方，这句代码才是真正的处理原来的数据
//            int newResult = i+1;
            int newResult = o.operate(i);

            newList.add(newResult);
        }
        return newList;

    }

    interface  Operation{
        Integer operate(Integer i);
    }


    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        MyList1 myList = new MyList1(list);

        List<Integer> newList = myList.map(new Operation() {
            @Override
            public Integer operate(Integer i) {
                return i * 100 - 5;

                //  Int => Int
            }
        });

        for(Integer i:  newList){
            System.out.println(i);
        }
    }
}
