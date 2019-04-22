package com.aura.scalacore.day02

object FunctionDemo {

  def main(args: Array[String]): Unit = {

    //  可以认为是一个变量，但是不仅仅是变量
    val f1 = add2 _

    println(f1)
    println(f1(3,4))


  }

  // 这是一个方法
  def add2(a:Int, b:Int):Int = {a + b}

  def f2(a:Int, b:Int):Int = {a + b}




  println("-----------")
  val test = (a:Int, b:Int) => (a:Int, b:Int) => (a:Int, b:Int) => (x:Int, y:Int) => println(a, b)

  println(test(1,2)(3,4)(5,6)(7,8))
}
