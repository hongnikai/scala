package com.aura.lc.scalaBasic

/**
  * 作者： 马中华   https://blog.csdn.net/zhongqi2513
  * 时间： 2018/8/27 8:30
  * 描述：
  */
object Demo008_Function {

  //定义一个函数f1，参数是两个Int类型，返回值是一个Int类型
  val f1 = (x: Int, y: Int) => x + y

  //再定义一个函数f2
  val f2 = (m: Int, n: Int) => m * n

  val f3 = (x:Int) => x

  def main(args: Array[String]): Unit = {

    println(f1(2,3))
    println(f2(2,3))
    println(f3(3))

  }
}
