package Assignment2
//3. Logical Operations
//Implement functions using logical operators (&&, ||, !)
object Logical {
  def logicalAnd(a: Boolean, b: Boolean): Boolean = a && b
  def logicalOr(a: Boolean, b: Boolean): Boolean = a || b
  def logicalNot(a: Boolean): Boolean = !a
}

object MainLogical {
  def main(args: Array[String]): Unit={
    val a = true
    val b = false

    println(s"Logical AND of $a and $b: ${Logical.logicalAnd(a, b)}")
    println(s"Logical OR of $a and $b: ${Logical.logicalOr(a, b)}")
    println(s"Logical NOT of $a: ${Logical.logicalNot(a)}")
    println(s"Logical NOT of $b: ${Logical.logicalNot(b)}")
  }
}