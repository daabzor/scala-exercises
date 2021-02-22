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
  def multiplyByTwo = (b: Int) => {
    b * 2
  }
  def addTwo = (a: Int) => {
    a + 2
  }
  def addThree = (a: Int) => {
    a + 3
  }

  /**
   * 3. Write a program that tries to test that your composition function respects identity.
   */
  def main(args: Array[String]) = {
    val input = 3
    print(
      (addThree andThen addTwo andThen multiplyByTwo) (input)
        equals
        (multiplyByTwo compose addTwo compose addThree) (input)
    )
  }

}
