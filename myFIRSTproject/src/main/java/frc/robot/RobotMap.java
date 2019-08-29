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
