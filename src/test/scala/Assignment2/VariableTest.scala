package Assignment2

import org.scalatest.funsuite.AnyFunSuite

class VariableTest extends AnyFunSuite {

  test("val variable should not be reassignable") {
    val a: Int = 20
    assert(a == 20)
  }

  test("var variable should be reassignable") {
    var b: Int = 30
    b = 50
    assert(b == 50)
  }
}

