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
    setDefaultCommand(new ArcadeDrive());
  }
}
