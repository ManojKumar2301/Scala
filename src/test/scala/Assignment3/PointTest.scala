package Assignment3

import org.scalatest.funsuite.AnyFunSuite

class PointTest extends AnyFunSuite {

  test("Point should return a new Point instance when moved") {
    val point = Point(1, 2)
    val movedPoint = point.move(3, 4)

    assert(movedPoint != point)
    assert(movedPoint == Point(4, 6))
  }

  test("Point should have immutable properties") {
    val point = Point(1, 2)

    // point.x = 3
    // point.y = 4

    assert(point.x == 1)
    assert(point.y == 2)
  }
}
