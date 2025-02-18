package Assignment4
//2. Loops
//Implement a function sumOfRange(start: Int, end: Int): Int that calculates the sum of numbers in a range.
class Loops {
  def sumOfRange(start: Int, end: Int): Int = {
    var sum = 0
    for (i <- start to end) {
      sum += i
    }
    sum
  }
}

object LoopsApp {
  def main(args: Array[String]): Unit = {
    val loops = new Loops()

    println(loops.sumOfRange(1, 5))
    println(loops.sumOfRange(3, 3))
    println(loops.sumOfRange(-2, 2))
  }
}

