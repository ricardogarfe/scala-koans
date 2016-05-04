package org.ricardogarfe.scala

import org.scalatest._

class PointSpec extends FlatSpec with Matchers {

  val p1 = new Point(2, 3)
  val p2 = new Point(2, 1)
  val p3 = new Point(3, 3)

  "Two Points" should "be similar with same x" in {
    p1.isSimilar(p2)
  }

  it should "not be similar with different x" in {
    p1.isNotSimilar(p3)
  }

}
