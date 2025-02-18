package Assignment1

class PersonComp(val name:String, val age:Int) {
  def greet():Unit={
    println(s"Hello, my name is $name and I am $age years old.")
  }
}
//3. Companion Object
//Implement a companion object for Person with a method apply to create a Person without using the new keyword.
object PersonComp {
  def apply(name: String, age: Int): PersonComp=new PersonComp(name, age)

  def main(args: Array[String]): Unit = {
    val person1 = PersonComp("Manoj", 22)
    val person2 = PersonComp("Omsai", 23)

    person1.greet()
    person2.greet()
  }

}
