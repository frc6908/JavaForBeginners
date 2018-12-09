# Lesson #1 Hello World

This is the first tutorial in the subseries of **Intro Courses**. Here you will learn about a simple Java class and create a program that outputs text to the console!

# Getting Started
Create a new Java file in your environment called "HelloWorld.java". **Be sure that the file extension is .java and remove any default code generated.**

# Hello World
Printing out "Hello World" is a common task completed when someone is learning a new language. You will be able to print this, and more, by the end of this tutorial.

In Java, all your code will be contained in a class. A class is a blueprint created to outline the properties and functionalities of something you want in your code.
In every program you write, there will only be one method (or function) called `main`, which is where the program starts. The class that contains the `main` function is also called the *driver class*.

Example of declaring a new class:

```java
public class ClassName {
}
```
* `public` declares that the class can be viewed and accessed by any other class in your project
* `class` declares that we're creating a class
* `ClassName` is simply the name of the class; it can be anything you want, but must match the name of the file. For example if I create a class called `Airplane`, it must be stored in a file called "Airplane.java".
* The body, or the contents, of the class go inside the curly braces `{ }`

Example of declaring a new `main` method:
```java
public static void main(String[] args) {
}
```

* `public` declares that the method can be viewed and accessed by other classes in your project
* `void` declares that the method returns no values
* `static` declares that the method can be called without an instance of the class (you will see more of this later in Java)
* `main` is the name of the method
* `String[] args` are the parameters of the method. This is what the method expects to receive when it is called.
* The body, or the contents, of the function go inside the curly braces `{ }`

The method we will be using to print out to the console is
```java
System.out.println("");
```

Inside the quotes `""`, you can type out the text you want to be printed to the console.

With this knowledge, you can now create a Hello World program in Java. Give it a try and refer to the solution if you are stuck and need help or if you want to verify your code!

### Print "Hello World!"
```java
public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
```
