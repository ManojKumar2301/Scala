package Assignment4
//1. Conditional Logic
//Write a function classifyNumber(n: Int): String that returns "positive", "negative", or "zero"
class Conditional {
  def classifyNumber(n: Int): String={
    if (n>0) "positive"
    else if (n<0) "negative"
    else "zero"
  }
}

object Main {
  def main(args : Array[String]): Unit={
    val classifier= new Conditional()
    println(classifier.classifyNumber(5))
    println(classifier.classifyNumber(-3))
    println(classifier.classifyNumber(0))
  }
}
