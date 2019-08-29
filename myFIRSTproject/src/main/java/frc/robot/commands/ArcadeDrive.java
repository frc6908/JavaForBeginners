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
