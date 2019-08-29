# Lesson #14b Motors

In this lesson, you will learn how to define and control 4 motor controllers through code!

## Defining the Motor Controllers ##

If you can recall from Lesson #8, all devices that are connected to the robot are defined in the **RobotMap** class. 

In our case, the drivetrain has 4 motors, and a motor controller for each motor. There are several different types of motor controllers such as TalonSRX, VictorSPX, VictorSP, and Sparks. We will be using 4 TalonSRXs for this Control System. 

1. Open the **RobotMap** class at myFIRSTproject/src/main/java/frc/robot/RobotMap.java
![RobotMap](https://github.com/frc6908/JavaForBeginners/raw/master/Resources/robotmap.png "RobotMap")

This is where we will define all our motor controllers. But before we do that, it is good practice to create a **Constants** file which contains all the universal constants for the project. Since we are coding a drivetrain that has TalonSRXs (CAN devices), we will be storing the CAN IDs in the **Constants** file. 

2. Right-click on the *robot* folder, then click on *Create a new class/command*.
![NewClass](https://github.com/frc6908/JavaForBeginners/raw/master/Resources/new_class.png "New Class")

3. Select *Empty Class*
![EmptyClass](https://github.com/frc6908/JavaForBeginners/raw/master/Resources/empty_class.png "Empty Class")

4. Type *Constants* and then press enter
![Constants](https://github.com/frc6908/JavaForBeginners/raw/master/Resources/constants.png "Constants")

The way constants are declared in Java is **public static final *varType* *k+varName* = *value*** . The **final** keyword indicates that this variable is a constant. For example, the CAN ID constant for a drivetrain TalonSRX may be :
```java
public static final int kLeftDrivetrainSRX = 0;
```

5. Define the constants needed for the drivetrain in the **Constants** file

The constants needed for the drivetrain are the 4 CAN IDs of the motor controllers. 
```java
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;


public class Constants {

    // These CAN IDs will we dependent on your CAN configuration.

    public static final int 
        kFrontLeftDrivetrainSRX = 0,
        kFrontRightDrivetrainSRX = 1,
        kBackLeftDrivetrainSRX = 2,
        kBackRightDrivetrainSRX = 3;

}
```

6. Navigate back to the **RobotMap** class, and let's define the motor controllers!

A motor controller is generally defined in this style: **public static *motorControllerClass* *name* = new *motorControllerClass*(Constants.*CAN ID/Port Number*)**
The TalonSRXs for our drivetrain can be defined like this:

```java
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class RobotMap {
    public static WPI_TalonSRX 
        frontLeftTalonSRX = new WPI_TalonSRX(Constants.kFrontLeftDrivetrainSRX),
        frontRightTalonSRX = new WPI_TalonSRX(Constants.kFrontRightDrivetrainSRX),
        backLeftTalonSRX = new WPI_TalonSRX(Constants.kBackLeftDrivetrainSRX),
        backRightTalonSRX = new WPI_TalonSRX(Constants.kBackRightDrivetrainSRX);
  
}

```