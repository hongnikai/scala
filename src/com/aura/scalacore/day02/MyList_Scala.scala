package com.aura.scalacore.day02

object MyList_Scala {


  val f1 = (x:Int) => x + 1
  val f2 = (x:Int) => x * 2

  val f3 = (x:Int) => x * 3 + 2

  def mm(f : Int => Int,  a:Int) = {f(a)}

  def main(args: Array[String]): Unit = {


    println(mm(f1, 4))
    println(mm(f2, 4))
    println(mm(f3, 4))



    var array = Array(1,2,3,4,5,6,7,8,9,10)

    val f4 = (x:Int) => x * x
    val f5 = (x:Int) => x * 2

    var newArray = array.map(f5)

    println(newArray.toBuffer)

  }
}
