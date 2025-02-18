package Assignment3
//1. Immutable Point Class
//Create a case class Point(x: Int, y: Int).
//Implement a method move(dx: Int, dy: Int): Point that returns a new Point with updated coordinates.
case class Point(x: Int, y: Int) {
  def move(dx: Int, dy: Int): Point = {
    Point(x + dx, y + dy)
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val point1= Point(1, 2)
    println(s"Initial Point: $point1")

    //2. Testing Immutability
    //Attempt to modify the properties of a Point instance and observe the compiler error.
    // point1.x = 3
    // point1.y = 4

    val movedPoint = point1.move(3, 4)
    println(s"Moved Point: $movedPoint")
  }
}
