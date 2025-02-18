package Assignment2

import org.scalatest.funsuite.AnyFunSuite

class ArithmeticTest extends AnyFunSuite {

  test("add should return the correct sum of two numbers") {
    assert(Arithmetic.add(10, 5) == 15)
    assert(Arithmetic.add(-10, 5) == -5)
    assert(Arithmetic.add(0, 0) == 0)
  }

  test("subtract should return the correct difference of two numbers") {
    assert(Arithmetic.subtract(10, 5) == 5)
    assert(Arithmetic.subtract(-10, 5) == -15)
    assert(Arithmetic.subtract(0, 0) == 0)
  }

  test("multiply should return the correct product of two numbers") {
    assert(Arithmetic.multiply(10, 5) == 50)
    assert(Arithmetic.multiply(-10, 5) == -50)
    assert(Arithmetic.multiply(0, 5) == 0)
  }

  test("divide should return the correct quotient of two numbers") {
    assert(Arithmetic.divide(10, 5) == "2")
    assert(Arithmetic.divide(-10, 5) == "-2")
  }

  test("divide should return an error message for division by zero") {
    assert(Arithmetic.divide(10, 0) == "Error: division by zero exception")
  }
}

