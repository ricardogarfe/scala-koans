package org.ricardogarfe.scala

import org.scalatest.FlatSpec

class LambdaSpecs extends FlatSpec {

  def lambda = { x: Int => x + 1 }
  def lambda2 = (x:Int) => x + 1
  val lambda3 = (x:Int) => x + 1

  val lambda4 = new Function1[Int, Int] {
    def apply(v1: Int): Int = v1 + 1
  }

  def lambda5(x:Int) = x + 1

  val result = lambda(3)
  val `result1andhalf` = lambda.apply(3)

  val result2 = lambda2(3)
  val result3 = lambda3(3)
  val result4 = lambda4(3)
  val result5 = lambda5(3)


}
