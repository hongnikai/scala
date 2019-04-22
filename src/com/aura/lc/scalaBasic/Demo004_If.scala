package com.aura.lc.scalaBasic

/**
  * 作者： 马中华：http://blog.csdn.net/zhongqi2513
  */
object Demo004_If {

  def main(args: Array[String]) {
    val x = 1
    //判断x的值，将结果赋给y
    val y = if (x > 0) 1 else -1
    //打印y的值
    println(y)

    //支持混合类型表达式
    val z = if (x > 1) 1 else "error"
    //打印z的值
    println(z)

    //如果缺失else，相当于if (x > 2) 1 else ()
    val m = if (x > 2) 1
    println(m)

    //在scala中每个表达式都有值，scala中有个Unit类，写做(),相当于Java中的void
    val n = if (x > 2) 1 else ()
    println(n)

    //if和else if
    val k = if (x < 0) -1 else if (x > 0) 1 else 0
    println(k)
  }
}
