# Lesson #13 Instant Commands

Welcome to **Instant Commands**! Here you will learn about Instant Commands!

## Instant Command ##

Unlike regular commands, an **Insant Command** runs one time immediately after it's called.

Let's take a look!

```java
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;

public class ExampleInstantCommand extends InstantCommand {

  public ExampleInstantCommand() {
    super();
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);s
  }

  // Called once when the command executes
  @Override
  protected void initialize() {
  }

}
```