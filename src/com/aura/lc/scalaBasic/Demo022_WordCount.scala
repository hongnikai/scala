package com.aura.lc.scalaBasic

/**
  * 作者： 马中华   https://blog.csdn.net/zhongqi2513
  * 时间： 2018/8/27 8:49
  * 描述： 
  */
object Demo022_WordCount {

  def main(args: Array[String]): Unit = {

    val array = Array("hello huangbo", "hello xuzheng", "hello wangbaoqiang")

    val result: List[(String, Int)] = array.flatMap(_.split(" ")).map((_, 1)).groupBy(t => t._1).map(t => (t._1, t._2.length))
      .toList.sortBy(t => t._2).reverse


    for (t <- result){
      println(t)
    }

  }
}
