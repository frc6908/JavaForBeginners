# Lesson #14d Joystick

In this lesson, you will learn how to define a Joystick connected to the DS in code!

## OI ##

If you remember from Lesson #8, the **OI** class is used to define behaviors for operator devices. We will be using a standard Joystick for this project.

Operator devices are defined in this way : **public *deviceClass* *deviceName* = new *deviceClass*(int portNumber)**

1. Open the OI.java file at myFIRSTproject/src/main/java/frc/robot/OI.java
![oi](https://github.com/frc6908/JavaForBeginners/raw/master/Resources/oi.png)

2. Define the Joystick
```java
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  public Joystick stick = new Joystick(0);
}
```

3. Create the *ArcadeDrive* command in the *commands* folder.

```java
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ArcadeDrive extends Command {
  public ArcadeDrive() {
    // this command needs the drivetrain subsystem
    requires(Robot.m_drivetrain);
  }

  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run (every 20ms)
  @Override
  protected void execute() {
    double leftSpeed = 0, rightSpeed = 0;

    // retrieve the y-value from the joystick
    // negated since the bottom is 1 and the top is -1 on the joystick by default
    double throttle = -Robot.m_oi.stick.getY();

    // get the x-value from the joystick
    double turn = Robot.m_oi.stick.getX();

    // compute the left and right speeds
    leftSpeed = throttle + turn;
    rightSpeed = throttle - turn;

    // set the speed
    Robot.m_drivetrain.set(leftSpeed, rightSpeed);
  }

  // never stop running
  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
  }

  @Override
  protected void interrupted() {
  }
}
```

4. Set *ArcadeDrive* as the default command for the drivetrain subsystem

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
import frc.robot.commands.ArcadeDrive;


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
    // set the defaut command
    setDefaultCommand(new ArcadeDrive());
  }
}
```

