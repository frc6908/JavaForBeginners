# Lesson #2a Numerical Operations

This is the second part of the second tutorial in the subseries of **Intro Courses**. Here you will learn about the operations you can do with numerical primitive data types!

# Getting Started
Create a new Java file in your environment called "NumericalOperations.java". **Be sure that the file extension is .java and remove any default code generated.**

# Numerical Operations
When we discuss numerical operations in Java, we are talking about things similar to what you learn in Math class.
Among the operations you can do in Java are addition, subtraction, multiplication, division, and more!

Mathematical Operator | Syntax
------------ | -------------
Addition | +
Subtraction | -
Multiplication | *
Division | /
Modulus (remainder) | %
Exponents (a to the power of b) | `Math.pow(a, b)`
Square Root (square root of a) | `Math.sqrt(a)`
Trigonometric sine (sine of a) | `Math.sin(a)`
Trigonometric cosine (cosine of a) | `Math.cos(a)`
Trigonometric tangent (tangent of a) | `Math.tan(a)`
Trigonometric arc sine (arc sine of a) | `Math.asin(a)`
Trigonometric arc cosine (arc cosine of a) | `Math.acos(a)`
Trigonometric arc tangent (arc tangent of a) | `Math.atan(a)`

Along with mathematical operators, we also have several variables that are useful when calculating values with mathematics.

Mathematical Constant | Syntax
----- | -----
e (Euler's number) | `Math.E`
π (pi) | `Math.PI`

# Task
Using this knowledge, create a program that computes some mathematical values using these operations/constants.

The solution will be a program that computes the distance from a structure, given the angle of elevation to the top of the structure and the height of the structure.

Use the solution as a reference for creating your own project or to verify your own program!

### Task Solution
```java
public class NumericalOperations {
  public static void main(String[] args) {
    double distanceToBuilding = 0; //Safe initial value of 0
    int heightOfBuilding = 50; //50 feet
    double angleOfElevation = 60; //60 degrees

    distanceToBuilding = heightOfBuilding / Math.tan(angleOfElevation);

    System.out.println(distanceToBuilding);
  }
}
```
