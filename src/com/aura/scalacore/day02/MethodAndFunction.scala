package com.aura.scalacore.day02

/**
  *  函数 和 方法 都是在定义  数据处理逻辑
  *
  *  不同的是，定义的方式不一样。
  */
object MethodAndFunction {

  def m1(a:Int, b:Int):Int = {a + b}

  def m11(a:Int) = {a + 1}

  def m2(f: Int => Int, a:Int) = {f(a)}

  val f1 = (x:Int) => x + 1

  val ff = (f: Int => Int, x:Int) => f(x)


  def main(args: Array[String]): Unit = {

    // 把方法作为方法的参数
    println(m2(m11, 4))

    // 把函数作为方法的参数
    println(m2(f1, 4))

    // 函数当做函数的参数
    println(ff(f1, 4))

    // 方法当做函数的参数
    println(ff(m11, 4))
  }
}
