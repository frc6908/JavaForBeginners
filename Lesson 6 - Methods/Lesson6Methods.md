# Lesson #6 Methods

This is the sixth tutorial in the subseries of **Intro Courses**. Here you will learn about methods in Java and how you can use them to efficiently group your code based on functionality!

# Getting Started
Create a new Java file in your environment called "Methods.java". **Be sure that the file extension is .java and remove any default code generated.**

# Methods
**Methods** in Java are a collection of statements that are grouped together to complete some task. Every method is stored in a class
A method can take variables in as inputs - these are called **parameters**. Parameters are any data that a method receives during the method call.
Each method has a **return type**, which specifies the type of value that is expected back from the function.
Each method also has a body, denoted by curly braces `{ }`, which is where the **algorithm**, or the general code for the method is stored.
The algorithm should work for any given input.

The definition of a method is as follows:
```java
access-modifier return-type name(parameters) {
  //body
}
```

Recall [access modifiers](https://github.com/frc6908/JavaForBeginners/blob/master/Lesson%202%20-%20Primitives/Lesson2Primitives.md).
* public
* private

Return types can be of any type of variable or object. For example:
* int
* double
* boolean
* String
* Dog (or any class you have defined)

When writing a method, we must keep all of the parts of a method in mind, so we can design it correctly.
For example, let's write a method to find the positive root of a quadratic equation. If there are two positive roots, return the larger one.

Part | Definition | Explanation
---- | ---- | ----
Access modifier | `public` | We want the entire program to be able to use this function, so it should be `public`.
Return type | `double` | When calculating the roots of a quadratic equation, there is no guarantee that the quadratic formula will spit out a nice `int`, so we should return a `double` (decimal value).
Name | `quadraticSolve` | Choosing a meaningful name for a method is important - this method solves quadratic equations; hence, `quadraticSolve`.
Parameters | `int a`, `int b`, `int c` | A quadratic equation is given in the format ax^2+bx+c. We can take the coefficients of each term to compute the roots with the quadratic equation
Body | - | Write code that returns the value when a, b, and c are plugged into the quadratic equation. Check if `a == 0` before calculating to avoid a division by 0 error. Also check for imaginary solutions.

Using a blueprint similar to this will ensure that your coding process is short and efficient.

# Task

Completing an implementation of this function will be the task for this lesson.

**Bonus**: How can you modify this program to handle a more complicated quadratic equation, such as (3/2)x^2+(9/4)x+12.

Refer to the solution below if you are stuck and need help, or as a verification for your own program.

### Task Solution

```java
public class Methods {

  public static double quadraticSolve(int a, int b, int c) { //Inputs a quadratic equation of form: ax^2+bx+c, returns the greatest root
    double discriminant = Math.pow(b, 2)-4*a*c; //Store discriminant in its own variable for reusability
    if(a == 0) {return 0;} //Check divison by 0; return 0 for invalid input
    if(discriminant < 0) {return 0;} //Check for imaginary solutions where discriminant is less than 0; return 0 for invalid input
    double r1 = (-1*b+Math.sqrt(discriminant))/(2*a); //Accounts for + of +/- in formula
    double r2 = (-1*b-Math.sqrt(discriminant))/(2*a); //Accounts for - of +/- in formula
    if(r1 > r2) {return r1;} //Result is r1 if it is greater
    if(r2 > r1) {return r2;} //Result is r2 if it is greater
    else {return r1;} //Else condition is if they are equal, in which case return either one (I chose to return r1)
  }
  
  public static void main(String[] args) {
    //Quadratic equation coefficients
    //ax^2+bx+c
    int a = 1;
    int b = -17;
    int c = 72;
    double result = quadraticSolve(a, b, c); //We store the function in a double variable because we expect the function to return a double
    System.out.println("The greatest solution of " + a + "x^2 + " + b + "x + " + c + " is " + result);
  }
}

```
