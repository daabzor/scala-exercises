package com.mstaskiewicz.challenges

object PartOne {

  /**
   * 1. Implement, as best as you can, the identity function in your favorite language
   */
  def identityFunction[A](param: List[A]): List[A] = param

  /**
   * 2. Implement the composition function in your favorite language. It takes two functions as arguments
   * and returns a function that is their composition.
   */
  def multiple(a: Int) (b:Int): Int = a * b
  def add(a: Int) (b:Int): Int = a + b

  /**
   * 3. Write a program that tries to test that your composition function respects identity.
   */
  def main(args: Array[String]) = {
    val add10ThenMultiplyBy2 = add(10)_ andThen  multiple(2)
    val add10ThenMultiplyBy2Compose =  multiple(2)_ compose add(10)

    val multipleBy2ThenAdd10 = multiple(2)_ andThen add(10)
    val multipleBy2ThenAdd10Compose = add(10)_ compose multiple(2)

    println(add10ThenMultiplyBy2(5)) //(5 + 10) * 2 = 30
    println(add10ThenMultiplyBy2Compose(5)) //(5 + 10) * 2 = 30
    println(add10ThenMultiplyBy2(5) equals add10ThenMultiplyBy2Compose(5)) //true

    println(multipleBy2ThenAdd10(5)) //(5 * 2) + 10 = 20
    println(multipleBy2ThenAdd10Compose(5)) //(5 * 2) + 10 = 20
    println(multipleBy2ThenAdd10(5) equals multipleBy2ThenAdd10Compose(5)) //true
  }

}
