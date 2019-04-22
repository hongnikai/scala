package com.aura.lc.scalaBasic

/**
  * 作者： 马中华   https://blog.csdn.net/zhongqi2513
  * 时间： 2018/8/27 8:30
  * 描述： 
  */
object Demo008_Method {

  def main(args: Array[String]): Unit = {
    print(max(2,3))
  }

  /**
    * def：关键字，定义一个函数
    * max：自定义的方法名
    * (x:Int, y:Int)：方法名后小扩号中为参数列表
    * Int：参数后的Int为方法返回值类型
    * {…}：大扩号中为方法体
    * Scala函数返回值可以不加return,默认函数体最后一条语句为返回值
    * 函数体不指定返回值时，scala会根据实际类型进行类型推断
    * Unit关键字表示函数不存在返回值，相当于java中的void关键字
    * Scala每行语句结束后的分号可加可不加
    */
  def max(x:Int, y:Int):Int={
    if(x > y)
      x
    else
      y
  }

  // 如果没有return语句，那么方法中的最后一行就是返回值
  def sub(a:Int,b:Int)={
    a-b
  }

  // 方法中的最后一行就是返回值，也可以使用return显示声明这就是返回值。
  def sub1(a:Int,b:Int):Unit={
    return a-b
  }
}
