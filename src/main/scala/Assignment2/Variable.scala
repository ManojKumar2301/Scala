package Assignment2
//Variable Declarations:
//    Declare variables using val and var with different data types.
//    Attempt to reassign val variables and observe the compiler error.
object Variable {
  def main(args: Array[String]): Unit = {
    val a: Int = 20
    var b: Int = 30

    //a=50
    b=50
    println(s"$a")
    println(s"$b")
  }
}
