package Assignment1
//1. Define a Person Class
//    Create a class Person with properties name (String) and age (Int).
//    Implement methods greet to print a greeting message.
class Person(val name:String, val age:Int) {
  def greet():Unit={
    println(s"Hello, my name is $name and I am $age years old.")
  }
}
//2. Instantiate Objects
//    Create instances of Person and invoke the greet method.

object Person {
  def main(args: Array[String]): Unit={
    val person1 = new Person("Manoj", 22)
    val person2 = new Person("Omsai", 23)

    person1.greet()
    person2.greet()
  }
}