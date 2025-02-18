# Scala Assignments

This repository contains four Scala assignments designed to help you understand the fundamentals of Scala programming, including classes, objects, basic types, functional programming, and control structures.

---

## Assignment 1: Classes and Objects

### Objective
Understand the fundamentals of Scala classes and objects, including class definitions, constructors, and object instantiation.

### Learning Outcomes
- Define classes with properties and methods.
- Instantiate objects from classes.
- Use companion objects for static members.

### Tasks
1. **Define a Person Class**
    - Create a class `Person` with properties `name` (String) and `age` (Int).
    - Implement a method `greet` to print a greeting message.

2. **Instantiate Objects**
    - Create instances of `Person` and invoke the `greet` method.

3. **Companion Object**
    - Implement a companion object for `Person` with an `apply` method to create a `Person` without using the `new` keyword.

4. **Validation**
    - Write unit tests to verify object creation and method functionality.
    - Ensure that the `greet` method outputs the correct message.

---

## Assignment 2: Basic Types and Operations

### Objective
Explore Scala's basic data types, variables, and fundamental operations.

### Learning Outcomes
- Understand value types (`Int`, `Double`, `Boolean`, etc.).
- Perform arithmetic and logical operations.
- Differentiate between `val` (immutable) and `var` (mutable).

### Tasks
1. **Variable Declarations**
    - Declare variables using `val` and `var` with different data types.
    - Attempt to reassign `val` variables and observe the compiler error.

2. **Arithmetic Operations**
    - Write functions to perform addition, subtraction, multiplication, and division.
    - Handle division by zero exceptions.

3. **Logical Operations**
    - Implement functions using logical operators (`&&`, `||`, `!`).

4. **Validation**
    - Unit tests should verify correct results for arithmetic and logical operations.
    - Ensure that reassigning `val` variables results in a compilation error.

---

## Assignment 3: Functional Objects

### Objective
Learn about immutable objects and how to implement functional programming principles in Scala.

### Learning Outcomes
- Create immutable classes.
- Understand the benefits of immutability.
- Implement methods that return new instances rather than modifying existing ones.

### Tasks
1. **Immutable Point Class**
    - Create a case class `Point(x: Int, y: Int)`.
    - Implement a method `move(dx: Int, dy: Int): Point` that returns a new `Point` with updated coordinates.

2. **Testing Immutability**
    - Attempt to modify the properties of a `Point` instance and observe the compiler error.

3. **Validation**
    - Unit tests should confirm that `move` returns a new `Point` instance.
    - Verify that properties of a case class are immutable.

---

## Assignment 4: Built-in Control Structures

### Objective
Utilize Scala's control structures like conditionals and loops to manage program flow.

### Learning Outcomes
- Implement `if-else` statements.
- Use `for` and `while` loops.
- Understand pattern matching with `match`.

### Tasks
1. **Conditional Logic**
    - Write a function `classifyNumber(n: Int): String` that returns "positive", "negative", or "zero".

2. **Loops**
    - Implement a function `sumOfRange(start: Int, end: Int): Int` that calculates the sum of numbers in a range.

3. **Pattern Matching**
    - Use pattern matching to implement a simple calculator that handles `+`, `-`, `*`, `/`.

4. **Validation**
    - Unit tests should verify the correctness of `classifyNumber` and `sumOfRange`.
    - Ensure the calculator handles different operations and invalid inputs gracefully.

---

## Getting Started

1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/scala-assignments.git
    cd scala-assignments
    ```

2. Compile the code using:
    ```bash
    scalac <filename>.scala
    ```

3. Run the application:
    ```bash
    scala <ClassName>
    ```

4. Run tests using ScalaTest or any other preferred testing framework.

---
