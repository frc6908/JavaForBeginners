# Lesson #12 Timed Commands

Welcome to **Timed Commands**! Here you will learn about different ways you can time commands!

## Timed Command ##

Commands can be timed so that they only run for a set period of time. There are two ways to time commands : the **TimedCommand** class and using the *timeout* feature of the standard **Command** class. 

## TimedCommand Class ##

The TimedCommand class is looks just like a regular command, but has one small change: the constructor has a *timeout* parameter that specifies how long the command should run.

Let's take a look!

```java
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.TimedCommand;

public class ExampleTimedCommand extends TimedCommand {

    // The timout parameter specifies how long the command should run in seconds
    // Specify the timeout when instantiating the command 
    public ExampleTimedCommand(double timeout) {
        super(timeout);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    }

    // Called once after timeout
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

## Regular Command ##

The *setTimeout(double timeout)* method can be used in a regular **Command** class to time a command as well.

Let's take a look!

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

        // Use setTimeout(double seconds) to specify timeout duration
        // eg. setTimeout(2);
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    }

    // Returns true when timed out
    // Do *NOT* add any code here
    // Add any code that needs to run after the timeout in the end() method
    @Override
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after the timeout
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