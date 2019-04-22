package com.aura.scalacore.day02

import scala.collection.mutable.ArrayBuffer

object ArrayTest {

  def main(args: Array[String]): Unit = {

    var array = Array(1, 2, 3, 4, 5)


    println(array.toBuffer)

    /**
      * add remove delete  涉及到长度的更改，   涉及到定长
      */
    array.update(0, 11111)

    println(array.toBuffer)


    println(array(0))

    array(0) = 22222222
    println(array.toBuffer)



    println("--------------------------------------------------------")
    val ab: ArrayBuffer[Int] = new ArrayBuffer[Int]()


    ab.append(1)
    ab.append(2)
    ab.append(3)
    ab.append(4)
    ab.append(5)

    println(ab)

    val abc = ab.filter( (x:Int) => if(x % 2 == 1) true else false)
    println(abc)
  }

}
