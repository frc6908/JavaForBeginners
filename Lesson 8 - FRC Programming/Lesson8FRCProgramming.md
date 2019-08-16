# Lesson #8 FRC Programming

Welcome to **FRC Programming**. Here you will learn about WPILib and Robot Classes!
*This page simplifies the [screensteps](https://wpilib.screenstepslive.com/s/currentCS/m/java) provided by FIRST and WPI*

## WPILib ##

The WPI Robotics Library (WPILib) is a library that interfaces with the hardware and software components of an FRC Robot's Contol System. The classes contained in this library handle sensors, motor speed controllers, the driver station, and a number of other utility functions. In addition, WPILib supports many commonly used sensors that are not in the Kit of Parts (KOP), such as ultrasonic rangefinders. *Infuzed uses the Java version of WPILib*

![WPILib](https://wpilib.screenstepslive.com/s/currentCS/m/java/l/599696-what-is-wpilib/show_image?image_id=4336496)

## Robot Base Classes ##

The robot base class is the starting point for the robot program and it sets the style and structure of the program. There are multiple base classes such as **SampleRobot**, **IterativeRobot**, **Time Robot**, and **Command Based Robot**.

Base Class  | Description
------------- | -------------
SampleRobot  |  good for writing small programs to test ideas, hard to extend for extra capabilities
Iterative Robot  | methods are called when new data is recieved from DS, does NOT have precise timing, hard to implement time-based control algorithms
Timed Robot  | methods are called every 20 ms, uses timers (Notifier) to guarantee timing
Command Based Robot  | based on Timed Robot, easy to expand as features are added to the robot

At Infuzed, we use the **Command Based Robot** program structure for its expandabilty and ease of use. 

*To get started with Command Based Programming, visit the [screensteps](https://wpilib.screenstepslive.com/s/currentCS/m/java/l/599732-what-is-command-based-programming)*