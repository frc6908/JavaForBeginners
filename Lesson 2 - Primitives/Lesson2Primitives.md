# Lesson #2 Primitives

This is the second tutorial in the subseries of **Intro Courses**. Here you will learn about primitives variables in Java and what they can do!

# Getting Started
Create a new Java file in your environment called "Primitives.java". **Be sure that the file extension is .java and remove any default code generated.**

# Primitives
Primitives are the most simple types of variables you can create in Java. They have behaviors that differ them from Objects, which are their variable counterparts.
Although there are 8 primitives in Java, we will focus on 4 of them (those have an asterisk next to them).

Primitive Variable | Value
------------ | -------------
boolean* | true or false
byte | 8 bit signed integer
char* | single character in literal/numeric representation
short | 16 bit signed integer
int* |  32 bit signed integer
long | 64 bit signed integer
float | 32 bit float (decimal values)
double* | 64 bit float (decimal values)

Whenever you declare a primitive in Java, you declare it as such: `access-modifier type name = value;`

Note that the access-modifier field is **optional** and without one declared it is **default**, which restricts the variable to its package or folder.
The access-modifier can either `public` (accessible by all classes in the project) or `private` (only accessible inside the class).
There is also an accessor called `protected`, but we won't be covering it here. Most variables you declare will be `public`.

```java
//Example of declaring an public int called myTeam that stores an integer value of 6908
public int myTeam = 6908;
//Example of declaring a default boolean called bestTeam that stores a boolean value of true
boolean bestTeam = true;
//Example of declaring a public char called teamRating that stores a character value of 'A'
public char teamRating = 'A';
```

After declaring a variable, you no longer have to specify the type. **The type is only specified when it is declared. At any time, you can only redefine the value of the primitive.**

```java
//Example of redefining a private double called 2018winLossRatio that stores an initial value of 0
private double 2018winLossRatio = 26/19;
2018winLossRatio = 27/19; //We won another match!
```

# Task
Create a program that has 4 primitive variables of types `boolean, char, int, double`.
Output these values to the console using the `System.out.println()` method that was covered in the previous tutorial.
Then, change the value of these variables, and output them once again.

Hint 1: In order to the print the value of the variable itself, type the name of the variable without quotes.

Hint 2: Do you need the access modifier inside the `public static void main(String[] args) {}` method?

A potential solution to this task is posted below; refer to it if you are stuck and need help or if you want to verify your work.

### Task Solution
```java
public class Primitives {
  public static void main(String[] args) {
    boolean lightIsOn = false;
    char light = '-';
    int lightNumber = 0;
    double brightness = 0/10;
    
    System.out.println(lightIsOn);
    System.out.println(light);
    System.out.println(lightNumber);
    System.out.println(brightness);
    
    System.out.println("Turn the light on!");
    
    lightIsOn = true;
    light = '!';
    lightNumber = 1;
    brightness = 8.0/10;
    
    System.out.println(lightIsOn);
    System.out.println(light);
    System.out.println(lightNumber);
    System.out.println(brightness);
  }
}
```

