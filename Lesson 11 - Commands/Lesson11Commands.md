# Lesson #11 Commands

Welcome to **Commands**. Here you will learn about Commands!

## Commands ##

Commands are robot actions that are use the capabilities defined in subsystems.

Let's look at a command!

```java 
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

public class ExampleCommand extends Command {
    public ExampleCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run (every 20ms)
    @Override
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    }
}
```

The ArcadeDrive() command from 2019Neptune retrieves input from the joystick and changes the speed of the drivetrain motors accordingly.

```java
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.drivetrain;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Constants;
import frc.robot.Robot;
import frc.util.RobotMath;

public class ArcadeDrive extends Command {
  public ArcadeDrive() {
    requires(Robot.drivetrain);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    
    double speed;

    // Account for joystick dead zones and retreive throttle from joystick
    if(Math.abs(Robot.oi.driveStick.getY()) > 0.08) {
      speed = -Robot.oi.driveStick.getY();
    }
    else {
      speed = 0;
    }

    // retrieve turn and acceleration values
    double acceleration = Robot.oi.driveStick.getThrottle();
    double turn = Robot.oi.driveStick.getX() * 0.5;

    // compute the multiplier for throttle depending on acceleration
    double throttleAcc = RobotMath.normalize(Constants.kMaxAxis, Constants.kMinAxis, Constants.kLowRangeTurn, Constants.kHighRangeTurn, acceleration);
    
    // set the new motor speeds
    Robot.drivetrain.setDriveMotors((speed + turn) * throttleAcc, (speed - turn) * throttleAcc);
  }

  @Override
  protected boolean isFinished() {
      // never stop running
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