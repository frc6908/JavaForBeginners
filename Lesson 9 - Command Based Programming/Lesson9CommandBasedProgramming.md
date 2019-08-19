# Lesson #9 Command Based Programming

Welcome to **Command Based Programming**. Here you will learn about the Command Based Programming structure!
*This page simplifies the [screensteps](https://wpilib.screenstepslive.com/s/currentCS/m/java/c/88893) provided by FIRST and WPI*

## Subsystems and Commands ##

The backbone of **Command Based Programming** consists of **Subsystems** and **Commands**. **Subsystems** define each part and its capabilities of the Robot and are subclasses of **Subsystem**. Examples of subsystems are elevators, ball intake, shooter, climber, etc. **Commands** are actions that the robot can perform using the capabilities defined in the Robot's subsystems. Examples are shoot ball, move elevator, outtake ball, deploy climber, etc.

![Subsystems and Commands](https://media.screensteps.com/images/Wpilib/241892/1/rendered/B035F1D9-FDC6-43E4-9DFC-0E7E1919F3DB.png?AWSAccessKeyId=AKIAJRW37ULKKSXWY73Q&Expires=1566273182&Signature=qrzB1lhgxsy6C%2BpX7GAuZFNv5sc%3D)

## File Structure ##

Since robots might have multiple subsystems and commands it is paramount that all the files are organized.

Below is how the files are organized in our 2019 robot code (2019Neptune)

![Here is our file structure from 2019Neptune](https://github.com/frc6908/JavaForBeginners/raw/master/Resources/file_structure.png "2019Neptune File Structure")