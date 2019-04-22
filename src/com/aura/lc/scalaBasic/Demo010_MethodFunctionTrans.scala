package com.aura.lc.scalaBasic

/**
  * 作者： 马中华   https://blog.csdn.net/zhongqi2513
  * 时间： 2018/8/27 8:33
  * 描述： 函数和方法的使用
  */
object Demo010_MethodFunctionTrans {

  def m1(f: (Int, Int) => Int) : Int = f(2, 6)

  def main(args: Array[String]): Unit = {

    val f1 = m1 _
    println(f1)


    def m2 = f1
    println(m2)


  }
}
