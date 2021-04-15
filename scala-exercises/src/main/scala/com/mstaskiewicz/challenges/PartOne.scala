package com.mstaskiewicz.challenges

object PartOne {
  /**
   * 1. Implement, as best as you can, the identity function in your favorite language
   */
  def identityFunction[A](x: A): A = x

  /**
   * 2. Implement the composition function in your favorite language. It takes two functions as arguments
   * and returns a function that is their composition.
   */
  def f[A, B, C](a: A => B)(b: B => C):A => C = a andThen b
  def f2[A, B, C](a: A => B)(b: B => C):A => C = b compose a
  def multipleByPi(a: Int) = a * 3.14
  def makeString(a: Double):String = a.toString
  def compositionFunction = f(multipleByPi)(makeString)
  def compositionFunction2 = f2(multipleByPi)(makeString)
  /**
   * 3. Write a program that tries to test that your composition function respects identity.
   */
  def main(args: Array[String]) = {
    println(compositionFunction(1).equals(compositionFunction2(1)))
  }

}
