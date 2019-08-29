# Lesson #14c Subsystem

In this lesson, you will learn how to create a subsystem for the drivetrain!

## Subsystem ##

If you remember from Lesson #10, a **subsystem** defines the capabilites of a part of the robot. In our case, the drivetrain is the subsystem. Now the capabilities. A drivetrain can have many features such as flipping the drivetrain and setting velociites, but the most basic thing we need is a method to set the motor speeds. 

Let's create the subsystem!

1. Navigate to myFIRSTproject/src/main/java/frc/robot/ and right-click on the *subsystems* folder. 
![folder](https://github.com/frc6908/JavaForBeginners/raw/master/Resources/folder.png "Folder")

2. Select *Create new class/command*
![class](https://github.com/frc6908/JavaForBeginners/raw/master/Resources/class.png "Class")

3. Select *Subsystem*
![subsystem](https://github.com/frc6908/JavaForBeginners/raw/master/Resources/subsystem.png "Subsystem")

4. Type *Drivetrain* and press enter
![drivetrain](https://github.com/frc6908/JavaForBeginners/raw/master/Resources/drivetrain.png "Drivetrain")

5. Create **SpeedControllerGroups**

**SpeedControllerGroups** group multiple motor controllers, making it easy to set the same speed for multiple motors at once.

```java
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;


public class Drivetrain extends Subsystem {
  SpeedControllerGroup 
    leftWheels = new SpeedControllerGroup(RobotMap.frontLeftTalonSRX, RobotMap.backLeftTalonSRX),
    rightWheels = new SpeedControllerGroup(RobotMap.frontRightTalonSRX, RobotMap.backRightTalonSRX);

  @Override
  public void initDefaultCommand() {
    // setDefaultCommand(new MySpecialCommand());
  }
}
```

6. Add a constructor that inverts the right motors

If wheels on both sides of the drivetrain spin the same direction, the robot will just spin around. To fix this, the robot's right wheels need to be inverted.

```java
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;


public class Drivetrain extends Subsystem {

  SpeedControllerGroup 
    leftWheels = new SpeedControllerGroup(RobotMap.frontLeftTalonSRX, RobotMap.backLeftTalonSRX),
    rightWheels = new SpeedControllerGroup(RobotMap.frontRightTalonSRX, RobotMap.backRightTalonSRX);

  public Drivetrain()
  {
    rightWheels.setInverted(true);
  }

  @Override
  public void initDefaultCommand() {
    // setDefaultCommand(new MySpecialCommand());
  }
}
```

7. Add the set method to set the motor speeds

You can set the motor speed in this manner: ***motorController*.set(double speed)** 
*speed* is a value between -1 and 1, 1 is full forward, -1 is full backward.

```java
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;


public class Drivetrain extends Subsystem {

  SpeedControllerGroup 
    leftWheels = new SpeedControllerGroup(RobotMap.frontLeftTalonSRX, RobotMap.backLeftTalonSRX),
    rightWheels = new SpeedControllerGroup(RobotMap.frontRightTalonSRX, RobotMap.backRightTalonSRX);

  public Drivetrain()
  {
    rightWheels.setInverted(true);
  }


  public void set(double leftSpeed, double rightSpeed)
  {
    leftWheels.set(leftSpeed);
    rightWheels.set(rightSpeed);
  }

  @Override
  public void initDefaultCommand() {
    // setDefaultCommand(new MySpecialCommand());
  }
}
```

8. Instantiate the subsystem in the **Robot** class

![drivetrain](https://github.com/frc6908/JavaForBeginners/raw/master/Resources/m_drivetrain.png)