package Assignment2
//Arithmetic Operations
//Write functions to perform addition, subtraction, multiplication, and division.
//Handle division by zero exceptions.

object Arithmetic {
  def add(a: Int, b: Int):Int = a+b
  def subtract(a: Int, b: Int):Int = a-b
  def multiply(a: Int, b: Int):Int = a*b
  def divide(a: Int, b: Int): String={
    if(b==0){
      "Error: division by zero exception"
    }
    else{
      (a/b).toString
    }
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val a=10
    val b=5

    println(s"Addition of $a and $b is ${Arithmetic.add(a, b)}")
    println(s"Subtraction of $a and $b is ${Arithmetic.subtract(a, b)}")
    println(s"Multiplication of $a and $b is ${Arithmetic.multiply(a, b)}")
    println(s"Division of $a and $b is ${Arithmetic.divide(a, b)}")

  }
}
