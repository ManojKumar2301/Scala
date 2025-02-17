package Assignment1

class Person(val name:String, val age:Int) {
  def greet():Unit={
    println(s"Hello, my name is $name and I am $age years old.")
  }
}

object Person {
  def main(args: Array[String]): Unit={
    val person1 = new Person("Manoj", 22)
    val person2 = new Person("Omsai", 23)

    person1.greet()
    person2.greet()
  }
}