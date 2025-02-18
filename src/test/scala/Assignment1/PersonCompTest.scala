package Assignment1

import org.scalatest.funsuite.AnyFunSuite
import java.io.{ByteArrayOutputStream, PrintStream}

class PersonCompTest extends AnyFunSuite {


  test("PersonComp object creation for Manoj via apply method") {
    val person = PersonComp("Manoj", 22)

    val stream = new ByteArrayOutputStream()
    Console.withOut(new PrintStream(stream)) {
      person.greet()
    }

    val output = stream.toString().trim
    assert(output == "Hello, my name is Manoj and I am 22 years old.")
  }

  test("PersonComp object creation  for Omsai via apply method") {
    val person = PersonComp("Omsai", 23)

    val stream = new ByteArrayOutputStream()
    Console.withOut(new PrintStream(stream)) {
      person.greet()
    }

    val output = stream.toString().trim
    assert(output == "Hello, my name is Omsai and I am 23 years old.")
  }
}
