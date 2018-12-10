# Lesson #7 Imports & Packages

This is the seventh tutorial in the subseries of **Intro Courses**. Here you will learn about packages and imports in Java and how you can use them to use various libraries in your code!

# Packages
A **package** in Java is simply a directory or folder in a project. Each package may contain several classes (.java files) that relate to this package.

The first line of each file should be the location of the file in terms of its package.

Say we have the file hierarchy: `Math/Shapes/Circle.java`. Inside the `Circle.java` class, the first line should be:

```java
package Shape;
```

which indicates that `Circle.java` is inside the `Shape` package or directory.

# Imports
An **import** in Java is a way to insert external libraries in your code. Importing a class follows a general formula as follows:

```java
import package.subpackage1.subpackage2.ClassName;
```

You can import all classes in a package by using the `*`:
```java
import package.subpackage1.*;
```

### Common Packages to Import
Package | Use
---- | ----
`java.awt.*` | Common GUI elements
`java.awt.event.*` | Common GUI event listeners
`javax.swing.*` | More common GUI elements (javax)
`java.util.*` | Event model, collections framework, date and time facilities, and contain various utility classes
`java.lang.*` | Classes that are fundamental to the design of the JavaTM programming language
`java.io.*` | Classes related to input/output
`java.text.*` | Formatting classes
`java.util.regex.*` | Classes dealing with regular expressions

# Example
Let's take the `Circle.java` class as an example.

Its package will be `package Shape;`.
Since this class is about Circles, we may need to calculate some values; as a result, let's import some mathematics related libraries.

We can use all Java math functions by importing the class:

```java
import java.lang.Math;
```

