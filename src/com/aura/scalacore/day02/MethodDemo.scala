package com.aura.scalacore.day02

object MethodDemo {

  //  关键字  方法名称     方法的参数名    参数的类型    数组的泛型   返回值类型  赋值     方法体
    def      main        (args:          Array        [String]): Unit         =       {


      val result: Int = add2(3,4)
      println(result)


      val result1: Double = multiply(2, 3.3, 4.0F)
      println(result1)
  }


  def add2(a:Int, b:Int):Int = {a + b}

  def multiply(a:Int, b:Double, c:Float) = {a * b * c }
}
