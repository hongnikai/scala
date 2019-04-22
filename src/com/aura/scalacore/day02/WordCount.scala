package com.aura.scalacore.day02

object WordCount {

  def main(args: Array[String]): Unit = {


    val array = Array("hello huangbo", "hello xuzheng", "hello wangbaoqiang")


    // 如何做wordcount
    // f的输入参数: String => Array[String]
    // Array(Array("hello", "huango"), Array("hello", "xuzheng"), Array("hello", "wangbaoqiang"))
    // Array("hello", "huango", "hello", "xuzheng", "hello", "wangbaoqiang")
    val result1: Array[Array[String]] = array.map((line:String) => line.split(" "))
    println(result1.toBuffer)


    val result2: Array[String] = result1.flatten
    println(result2.toBuffer)

    //  hello  ====> (hello , 1)   f:  String => (String,Int)
    val result3: Array[(String, Int)] = result2.map((word:String) => (word, 1))
    println(result3.toBuffer)


    //               单词 word,      单词， 次数
    val result4: Map[String, Array[(String, Int)]] = result3.groupBy((xx:(String, Int)) => xx._1 )
    println(result4.toBuffer)


    val result5: Map[String, Int] = result4.map(x => (x._1,  x._2.length))
    println(result5.toBuffer)


    val result6 = result5.toList.sortBy(_._2).reverse
    println(result6.toBuffer)


    val result7 = result5.toList.sortWith( (x, y) => x._2 > y._2)
    println(result7)
  }
}
