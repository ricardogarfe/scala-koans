package org.ricardogarfe.scala

import org.scalatest.FlatSpec

class GreetingSpec extends FlatSpec {

  "Greeting" should "be Hi in english" in {
    assert(Greeting.english === "Hi")
  }

  it should "be Hola in espanol" in {
    assert(Greeting.espanol === "Hola")
  }

  it should "be Hallo in deutsch" in {
    assert(Greeting.deutsch === "Hallo")
  }

  it should "be Szia in magyar" in {
    assert(Greeting.magyar === "Szia")
  }
}
