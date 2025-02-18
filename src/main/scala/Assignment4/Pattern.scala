package Assignment4
//3. Pattern Matching
//Use pattern matching to implement a simple calculator that handles +, -, *, /.
class Pattern {
  def calculate(a: Int, b: Int, operator: Char): Any = {
    operator match {
      case '+' => a + b
      case '-' => a - b
      case '*' => a * b
      case '/' => if (b != 0) a / b else "Error: division by zero"
      case _   => "Invalid operator"
    }
  }
}

object Calculator {
  def main(args: Array[String]): Unit = {
    val calculator = new Pattern()

    println(calculator.calculate(10, 5, '+'))
    println(calculator.calculate(10, 5, '-'))
    println(calculator.calculate(10, 5, '*'))
    println(calculator.calculate(10, 0, '/'))
    println(calculator.calculate(10, 5, '%'))
  }
}

