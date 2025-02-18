package Assignment4

import org.scalatest.funsuite.AnyFunSuite

class PatternTest extends AnyFunSuite {
  val calculator = new Pattern()

  test("calculate should return the correct sum for addition") {
    assert(calculator.calculate(10, 5, '+') == 15)
  }

  test("calculate should return the correct difference for subtraction") {
    assert(calculator.calculate(10, 5, '-') == 5)
  }

  test("calculate should return the correct product for multiplication") {
    assert(calculator.calculate(10, 5, '*') == 50)
  }

  test("calculate should return error message for division by zero") {
    assert(calculator.calculate(10, 0, '/') == "Error: division by zero")
  }

  test("calculate should return the correct quotient for division") {
    assert(calculator.calculate(10, 5, '/') == 2)
  }

  test("calculate should return 'Invalid operator' for unsupported operator") {
    assert(calculator.calculate(10, 5, '%') == "Invalid operator")
  }
}

