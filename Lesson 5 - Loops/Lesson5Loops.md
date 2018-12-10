# Lesson #5 Loops

This is the fifth tutorial in the subseries of **Intro Courses**. Here you will learn about loops in Java and how you can use them to manipulate the flow of your code!

# Getting Started
Create a new Java file in your environment called "Loops.java". **Be sure that the file extension is .java and remove any default code generated.**

# Loops
Loops are a control flow statement that allow you to easily complete tasks that require repetition for a certain condition.
Loops run while they meet a certain boolean condition (think back to [if-statements](https://github.com/frc6908/JavaForBeginners/blob/master/Lesson%204%20-%20Logical%20Operators%20-%20Conditionals/Lesson4LogicalOperatorsConditionals.md)) and then exit the loop when the condition is no longer met.

## While Loop
A **while loop** is a statement that repeatedly executes code while a condition is met. It is like an if-statement that continuously repeats itself.

The syntax for a while loop is as follows:

```java
while(condition) {
  //code
}
```

For example, we may want to run code as long as the value of some integer is less than 5. The code to do so is this:

```java
int myNum = 2; //Declaration of my integer variable
System.out.println("Initial value of myNum: " + myNum);

while(myNum < 5) { //Run the code inside the curly braces while the value of myNum is less than 5
  System.out.println("The value of myNum is less than 5. It is: " + myNum); //Confirmation that myNum < 5 and output value of myNum
  myNum = myNum + 1; //Add 1 to the value of myNum - this statement can also be written in shorthand as myNum += 1; or as myNum++;
}

System.out.println("Exited while loop. myNum is no longer less than 5, it is now: " + myNum);
```
The output will be:
```
Initial value of myNum: 2
The value of myNum is less than 5. It is: 2
The value of myNum is less than 5. It is: 3
The value of myNum is less than 5. It is: 4
Exited while loop. myNum is no longer less than 5, it is now: 5
```

You can also write a while loop to meet some logical condition. For example,
```java
while(1==1) {
  //code
}
```
This code would run forever, because the logical comparison `1==1` will always be true. This can be shortened to:
```java
while(1) {
  //Infinite loop
}
```

## For Loop
A **for loop** is similar to a while loop, but it contains more than just a condition. The initialization of the loop is as follows:

```java
for(initialization; condition; increment/decrement) {
  //code
}
```

This structure is useful because it condenses the variable that is the condition for the loop, the condition itself, and the increment/decrement (changing the variable) all in one line.

The code snippet that was written with the while loop can be rewritten more concisely with a for loop, as follows:

```java
for(int myNum = 2; myNum < 5; myNum++) { //initialization: myNum starts at 2; condition: myNum is less than 5; increment/decrement: increment myNum by 1 (Note: myNum++, myNum += 1, and myNum = myNum + 1 are equivalent)
  System.out.println("The value of myNum is less than 5. It is: " + myNum);
}
```
The output will be:
```
The value of myNum is less than 5. It is: 2
The value of myNum is less than 5. It is: 3
The value of myNum is less than 5. It is: 4
```
Notice that since `int myNum` was declared inside the loop, it is not accessible outside of the loop's curly braces `{ }`.

# Task
Write a program that prints the even numbers between 0 and 100, inclusive. Hint: think about remainder.

Create a version of this program for each loop discussed here. This program will require you to recall topics going all the way back to [numerical operations](https://github.com/frc6908/JavaForBeginners/blob/master/Lesson%202a%20-%20Numerical%20Operations/Lesson2aNumericalOperations.md).

The solution is posted below. Use it as a reference in case you are stuck and need help, or as a verification for your own program.

### Task Solution
```java
public class Loops {
  public static void main(String[] args) {
    for(int num=0; num<=100; num++) { //All integers from 0 to 100, inclusive
      if(num % 2 == 0) { //If the remainder when divided by two is 0 ... or ... if it is divisble by two
        System.out.println("The number " + num + " is even."); //Print that it is even
      }
    }
  }
}
```
