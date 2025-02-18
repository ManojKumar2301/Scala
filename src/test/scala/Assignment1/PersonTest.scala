package Assignment1

import org.scalatest.funsuite.AnyFunSuite
import java.io.{ByteArrayOutputStream, PrintStream}

class PersonTest extends AnyFunSuite {

  test("Person object should greet correctly for Manoj") {
    val person = new Person("Manoj", 22)

    val stream = new ByteArrayOutputStream()
    Console.withOut(new PrintStream(stream)) {
      person.greet()
    }

    val output = stream.toString().trim
    assert(output == "Hello, my name is Manoj and I am 22 years old.")
  }

  test("Person object should greet correctly for Omsai") {
    val person = Person("Omsai", 23)

    val stream = new ByteArrayOutputStream()
    Console.withOut(new PrintStream(stream)) {
      person.greet()
    }

    val output = stream.toString().trim
    assert(output == "Hello, my name is Omsai and I am 23 years old.")
  }

}
