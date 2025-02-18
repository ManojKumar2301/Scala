package Assignment4

import org.scalatest.funsuite.AnyFunSuite

class ConditionalTest extends AnyFunSuite {
  val classifier = new Conditional()

  test("classifyNumber should return 'positive' for positive numbers") {
    assert(classifier.classifyNumber(5) == "positive")
    assert(classifier.classifyNumber(100) == "positive")
  }

  test("classifyNumber should return 'negative' for negative numbers") {
    assert(classifier.classifyNumber(-3) == "negative")
    assert(classifier.classifyNumber(-10) == "negative")
  }

  test("classifyNumber should return 'zero' for zero") {
    assert(classifier.classifyNumber(0) == "zero")
  }
}

