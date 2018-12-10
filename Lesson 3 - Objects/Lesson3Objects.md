# Lesson #3 Objects

This is the second tutorial in the subseries of **Intro Courses**. Here you will learn about objects in Java and what they can do!

# Getting Started
Create a new Java file in your environment called "Objects.java". **Be sure that the file extension is .java and remove any default code generated.**

# Objects
Objects are one of the most important aspects of Java. Coming from Java's title of being an `objected-oriented programming (OOP) language`, objects refer to the other set of variables in Java (the first set being primitives).

**An object is an instance of a class in Java.** 

In order to create an object, you follow this structure: `type name = new type(parameters);`

For example, let's create a **String** object. A string is an object that holds a collection of characters to emulate text. The parameter to create a new String is the String itself, in quotes `""`.
The `String` class actually has many more ways to initialize a String object, but we will focus on this one for now.
We would do:

```java
String myString = new String("This is my first String!");
System.out.println(myString); //Outputs: This is my first String!
```

If you do not give an object a complete reference (with the `new` keyword), the it is **`null`** by default.
For example:

```java
String myString; //myString is null - it holds no value
myString = new String("Now it's not!");
```

An object can be characterized by its state and behavior.
For example, a dog can have **states** such as its name, age, and breed, and **behaviors** such as running and barking.

In a class, the states of an object are modeled with variables inside the class, called **instance data** and the behavior of an object is modeled with **methods**.

In order to better understand objects, we must dive deeper into classes.

As defined in Lesson #1 of this subseries,
> A class is a blueprint created to outline the properties and functionalities of something you want in your code.

If an object is an instance of a class, it must follow the blueprint provided by the class in order to be created.

The first step in an object's initialization is its initial values. Say you want to make a variable object for a Dog in your program. You might want to create an empty Dog representation, or provide the program with some initial values to construct your dog with.
The key word here is **construct**.

The **constructor method** in Java is a method which is called when an object is created. It has a few important properties
* It has no return type
* It *must* have the same name as the class it's located in
* It may be given several implementations

Let's look at an example:

```java
//Dog.java
public class Dog {

  //Instance variables - states
  public String name;
  public String breed;
  public int age;
  
  //Default constructor
  Dog() {
    name = null;
    breed = null;
    age = 0;
  }
  
  //Manual constructor
  Dog(String n, String b, int a) {
    name = new String(n);
    breed = new String(b);
    age = a;
  }
  
  //Methods - behaviors
  public void bark() {
    System.out.println(name + " says woof!");
  }
}
```

This may be a lot to take in right now, but let's break it down step by step.

We have created a new class called `Dog`. It has 3 variables that define its state - `name`, `breed`, and `age`.

Next we see two methods called **constructors**. The **default constructor** is one which takes no parameters; thus, it does not know what to make the instance variables equal to. For this reason, we provide default values of `null` and `0`.
The **manual constructor** is one which takes some parameters; thus, we can set the instance data of the class equal to the values passed in. Note that when assigning values to the String variables, we use the `new` keyword because Strings are objects.
Also note that *both constructors have the same name as the class: `Dog`, and have no return type.*

Let's say we wanted to use our Dog class. We can make a **driver class** (which houses the `main` method) called "Main.java".
**Keep the Main.java file in the same folder as the Dog.java file. If you do this, you will NOT have to import Dog.java in Main.java.**

Here is our Main.java class:

```java
public class Main {
  public static void main(String[] args) {
    Dog d1 = new Dog(); //calls default constructor
    Dog d2 = new Dog("Infuzed", "FRC Team", 6908); //calls manual constructor
  }
}
```

Note that we used the object declaration convention that was stated before: `type name = new type(parameters);`

The initialization of **`d1`calls the default constructor** - notice that the parameters passed through the `new Dog()` are empty, just like the default constructor's parameters.
Likewise, the initialize of **`d2` calls the manual constructor** - the parameters passed through `new Dog("Infuzed", "FRC Team", 6908)` are String, String, int - just like the manual constructor's parameters.

In order to access the variables of an object, you type: `object.variable`. In order to access the methods of an object, you type: `object.method(parameters)`.

For example:

```java
//Inside main method
System.out.println(d2.name); //Outputs: Infuzed
System.out.println(d2.breed); //Outputs: FRC Team
System.out.println(d2.age); //Outputs: 6908

d2.bark(); //Outputs: Infuzed says woof!
```

Notice that calling `d1.bark()` would result in "null says woof!" because the String name for d1 still has not been set to anything.


# Task
Using this knowledge, see if you can create a program with two classes: one custom class with instance variables and methods to emulate states and behavior, and one driver class with `public static void main(String[] args) {}`.

The solution posted will be the complete version of the Dog class and the Main driver class. Use the solution to model your own custom class and driver class.

### Task Solution
```java
public class Dog {

  //Instance variables - states
  public String name;
  public String breed;
  public int age;
  
  //Default constructor
  Dog() {
    name = null;
    breed = null;
    age = 0;
  }
  
  //Manual constructor
  Dog(String n, String b, int a) {
    name = new String(n);
    breed = new String(b);
    age = a;
  }
  
  //Methods - behaviors
  public void bark() {
    System.out.println(name + " says woof!");
  }
}

//Main class in Main.java (driver class)
public class Main {
  public static void main(String[] args) {
    Dog d1 = new Dog(); //calls default constructor - empty dog
    Dog d2 = new Dog("Infuzed", "FRC Team", 6908); //calls manual constructor - dog initialized with "Infuzed", "FRC Team" and 6908
    System.out.println(d2.name); //Outputs: Infuzed
    System.out.println(d2.breed); //Outputs: FRC Team
    System.out.println(d2.age); //Outputs: 6908
    d2.bark(); //Outputs: Infuzed says woof!
    d1.bark(); //Outputs: null says woof!
    
    d1.name = new String("New Team");
    d1.bark(); //Now outputs: New Team says woof!
  }
}

  
  
  
  
