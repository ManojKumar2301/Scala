package Assignment4

import org.scalatest.funsuite.AnyFunSuite

class LoopsTest extends AnyFunSuite {
  val loops = new Loops()

  test("sumOfRange should return the correct sum for a range of positive numbers") {
    assert(loops.sumOfRange(1, 5) == 15)
    assert(loops.sumOfRange(3, 3) == 3)
  }

  test("sumOfRange should return the correct sum for a range including negative numbers") {
    assert(loops.sumOfRange(-2, 2) == 0)
  }

  test("sumOfRange should return 0 for a range where start > end") {
    assert(loops.sumOfRange(5, 3) == 0)
  }

  test("sumOfRange should handle a single number correctly") {
    assert(loops.sumOfRange(5, 5) == 5)
  }

  test("sumOfRange should handle ranges with only negative numbers") {
    assert(loops.sumOfRange(-5, -1) == -15)
  }
}

