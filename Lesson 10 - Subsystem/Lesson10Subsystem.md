# Lesson #10 Subsystem

Welcome to **Subsystem**. Here you will learn about Subsystems!
*This page simplifies the [screensteps](https://wpilib.screenstepslive.com/s/currentCS/m/java/c/88893) provided by FIRST and WPI*

## Subsystems ##

Subsystems define each part of the robot and its capabilities.

Let's take a look at an example of a drivetrain subsystem.

```java
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.drivetrain.ArcadeDrive;

public class Drivetrain extends Subsystem {

    // Motor controller groups (left side, right side) for the drivetrain
    private static SpeedControllerGroup
        leftMotors = new SpeedControllerGroup(RobotMap.frontLeftDriveMotor, RobotMap.backLeftDriveMotor),
        rightMotors = new SpeedControllerGroup(RobotMap.frontRightDriveMotor, RobotMap.backRightDriveMotor);

    // Preliminary code to be called when the subsystem is instantiated
    public Drivetrain() {
        RobotMap.frontLeftDriveMotor.setNeutralMode(NeutralMode.Brake);
        RobotMap.frontRightDriveMotor.setNeutralMode(NeutralMode.Brake);
        RobotMap.backLeftDriveMotor.setNeutralMode(NeutralMode.Brake);
        RobotMap.backRightDriveMotor.setNeutralMode(NeutralMode.Brake);
        rightMotors.setInverted(true);
    }

    // Put methods for controlling this subsystem here. Call these from Commands.

    // Method to set the speed of the drivetrain motors
    public void setDriveMotors(double leftVoltage, double rightVoltage) {
        leftMotors.set(leftVoltage);
        rightMotors.set(rightVoltage);
    }

    // Run the ArcadeDrive() command as default
    @Override
    public void initDefaultCommand() {
        setDefaultCommand(new ArcadeDrive());
    }

    /**
    * 
    * Don't forget to instantiate the subsystem in Robot.java! 
    *
    */
}
```
