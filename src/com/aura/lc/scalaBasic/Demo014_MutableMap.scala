package com.aura.lc.scalaBasic

import scala.collection.mutable

/**
  * 作者： 马中华：http://blog.csdn.net/zhongqi2513
  */
object Demo014_MutableMap extends App{
  val map1 = new mutable.HashMap[String, Int]()
  //向map中添加数据
  map1("spark") = 1
  map1 += (("hadoop", 2))
  map1.put("storm", 3)
  println(map1)

  //从map中移除元素
  map1 -= "spark"
  map1.remove("hadoop")
  println(map1)

}