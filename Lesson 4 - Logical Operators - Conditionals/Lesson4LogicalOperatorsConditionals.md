# Lesson #4 Logical Operators & Conditionals

This is the fourth tutorial in the subseries of **Intro Courses**. Here you will learn about logical and conditional operators in Java and what they can do! You will also learn about how you can use these operations to perform a desired action in your code.

# Getting Started
Create a new Java file in your environment called "LogicalOperatorsConditionals.java". **Be sure that the file extension is .java and remove any default code generated.**

# Logical Operators
Similar to how we learned about numerical operations in [Lesson #2a](https://github.com/frc6908/JavaForBeginners/blob/master/Lesson%202a%20-%20Numerical%20Operations/Lesson2aNumericalOperations.md)
there are also logical operations we can complete in Java.

For the examples given, consider the following variables:
```java
boolean t = true;
boolean f = false;
```

Operation | Syntax | Evaluation | Example
-------- | -------- | -------- | --------
or | \|\| | `true` if at least one operand is `true` | `t \|\| f` evaluates to `true`
and | && | `true` if both operands are `true` | `t && f` evaluates to `false`; `t && t` evaluates to `true`
not | ! | flips value from `true` to `false`, or `false` to `true` | `!t` evaluates to `false`; `!f` evaluates to `true`

# Conditional Operators
There are also conditional operators in Java, that can compare two values.

For the examples given, consider the following variables:
```java
int a = 15;
int b = 20;
int c = 20;
int d = 25;
```

Operation | Syntax | Evaluation | Example
-------- | -------- | -------- | --------
equal to | == | returns `true` if the values of the operands are equal | `a == b` evaluates to `false`; `b == c` evaluates to `true`
not equal to | != | returns `true` if the values of the operands are not equal | `a != b` evaluates to `true`; `b != c` evaluates to `false`
greater than | > | returns `true` if the value of the first operand is greater than the value of the second operand | `a > b` evalutes to `false`; `d > c` evaluates to `true`
greater than or equal to | >= | returns `true` if the value of the first operand is greater than or equal to the value of the second operand | `b >= c` evaluates to `true`; `d >= c` evaluates to `true`
less than | < | returns `true` if the value of the first operand is less than the value of the second operand | `a < b` evaluates to `true`; `d < c` evaluates to `false`
less than or equal to | <= | returns `true` if the value of the first operand is less than or equal to the value of the second operand | `b <= c` evaluates to `true`; `a <= b` evaluates to `true`

You can compare variables with values of their type like so:
Given `int myGrade = 11;`

```java
myGrade >= 9
```
returns `true`.

You can also use logical and conditional operations together to create more complicated expressions.
For example:
```java
a == b && t == f
```
returns `false` because `t == f` is `false`, so the entire && expression returns `false`.

# If, Else-If, and Else Statements
**If-statements** are the simplest of control flow statements in Java. They check if a conditional evaluates to `true`, then complete a desired action.
You can think of the structure also as an if-then statement: "If something is true, then do this."

The syntax for an if statement is as follows:
```java
if(conditional) {
  //code
}
```

Example:
```java
if(a == b) {
  System.out.println("a is equal to b");
}
```

You can make more complicated control flow with the **else if** and **else** statements.

The syntax for these statements is as follows:
```java
if(conditional) {
  //code
}
else if(another conditional) {
  //more code
}
else if(yet another conditional) {
  //even more code
else {
  //even MORE code
}
```

Notice that the **else-if and else statements require a previous if statement** in order to be used.
The else-if statements checks for a different conditional than the previous if (or else if) statement - **you can have multiple else-if statements.**
The **else statement does not have a conditional** associated with it because it is a sort of "last resort" option, if none of the other if or else-if conditionals evaluate to `true`.

# Task
Using your knowledge about logical & conditional operators and if, else-if, and else statements, write a program that checks what level of schooling a student is in, given their grade.

Assume:
* Elementary School: 1st grade to 5th grade, inclusive
* Middle School: 6th grade to 8th grade, inclusive
* High School: 9th grade to 12th grade, inclusive
* Any other grade is considered invalid

Use the solution posted below as a guide if you are stuck and need help, or as a verification of your own code!

### Task Solution

```java
public class LogicalOperatorsConditionals {
  public static void main(String[] args) {
    int studentGrade = 7; //Change this value to see how the flow of the program changes!
    if(studentGrade >= 1 && studentGrade <= 5) {
      System.out.println("Student in grade " + studentGrade + " is in elementary school!");
    }
    else if(studentGrade >= 6 && studentGrade <= 8) {
      System.out.println("Student in grade " + studentGrade + " is in middle school!");
    }
    else if(studentGrade >= 9 && studentGrade <=12) {
      System.out.println("Student in grade " + studentGrade + " is in high school!");
    }
    else {
      System.out.println("Student grade is invalid!");
    }
  }
}
```

