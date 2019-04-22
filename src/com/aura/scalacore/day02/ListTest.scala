package com.aura.scalacore.day02

import scala.collection.mutable.ListBuffer

object ListTest {

  def main(args: Array[String]): Unit = {

    val list = 1 :: 2 :: 3 :: 4 :: Nil
    val listt = 5 :: 6 :: 7 :: 8 :: Nil


    val list1 = 6 +: list
    val list2 = list :+ 6
    val list3 = 0 :: list
    val list4 = list.::(0)
    val list123 = list ++ listt

    println(list123)


    /**
      * list123  = List(1, 2, 3, 4, 5, 6, 7, 8)
      * head:    1
      * tail:   List(2, 3, 4, 5, 6, 7, 8)
      * init:   List(1, 2, 3, 4, 5, 6, 7)
      * last:   8
      */


    println(list123.init.last)
    println(list123.tail.tail.head)

    println(list123.reverse)


    // 传入可变长参数的时候；

    // xxxx(int a, int ... b)
    //   a :: b



    var array = Array(1,2,3,4,5)



    val list1111 = new ListBuffer[Int]()
    list1111.append(1)

    val list333 = list1111 :+ 3

    println(list333)

  }
}
