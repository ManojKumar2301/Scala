package Assignment2

import org.scalatest.funsuite.AnyFunSuite

class LogicalTest extends AnyFunSuite {

  test("logicalAnd should return true only when both operands are true") {
    assert(Logical.logicalAnd(true, true) == true)
    assert(Logical.logicalAnd(true, false) == false)
    assert(Logical.logicalAnd(false, true) == false)
    assert(Logical.logicalAnd(false, false) == false)
  }

  test("logicalOr should return true when at least one operand is true") {
    assert(Logical.logicalOr(true, true) == true)
    assert(Logical.logicalOr(true, false) == true)
    assert(Logical.logicalOr(false, true) == true)
    assert(Logical.logicalOr(false, false) == false)
  }

  test("logicalNot should return the negation of the operand") {
    assert(Logical.logicalNot(true) == false)
    assert(Logical.logicalNot(false) == true)
  }
}


