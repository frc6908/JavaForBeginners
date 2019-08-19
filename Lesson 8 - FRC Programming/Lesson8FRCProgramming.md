# Lesson #8 FRC Programming

Welcome to **FRC Programming**. Here you will learn about WPILib and Robot Classes!

**The [FRC environment](https://docs.google.com/document/d/1gsHRuXv4nH3QgOnL0EUB5_rmLXk-JnR6QtYgkNwiXGk/edit?usp=sharing) is required moving forward**.

*This series simplifies the [screensteps](https://wpilib.screenstepslive.com/s/currentCS/m/java) provided by FIRST and WPI*

## WPILib ##

The WPI Robotics Library (WPILib) is a library that interfaces with the hardware and software components of an FRC Robot's Contol System. The classes contained in this library handle sensors, motor speed controllers, the driver station, and a number of other utility functions. In addition, WPILib supports many commonly used sensors that are not in the Kit of Parts (KOP), such as ultrasonic rangefinders. *We will be using the Java version of WPILib in this series*

![WPILib](https://wpilib.screenstepslive.com/s/currentCS/m/java/l/599696-what-is-wpilib/show_image?image_id=4336496)

## Robot Base Classes ##

The robot base class is the starting point for the robot program and it sets the style and structure of the program. There are multiple base classes such as **SampleRobot**, **IterativeRobot**, **Time Robot**, and **Command Based Robot**.

Base Class  | Description
------------- | -------------
SampleRobot  |  good for writing small programs to test ideas, hard to extend for extra capabilities
Iterative Robot  | methods are called when new data is recieved from DS, does NOT have precise timing, hard to implement time-based control algorithms
Timed Robot  | methods are called every 20 ms, uses timers (Notifier) to guarantee timing
Command Based Robot  | based on Timed Robot, easy to expand as features are added to the robot

We will be using the **Command Based Robot** structure in this series.

## The Robot Class ##

The **Robot** class is the heart of the Robot Control System and it is where all code execution begins. The **Robot** class may extend **SampleRobot**, **IterativeRobot**, or **TimedRobot** depending on which program structure is chosen for the Robot Control System. Since we are using the **Command Based Robot** program structure, the **Robot** class extends **TimedRobot**.

Let's take a closer look at the Robot class.

```java
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.ExampleSubsystem;


public class Robot extends TimedRobot {

    // Instantiate all your subsystems here
    public static ExampleSubsystem m_subsystem = new ExampleSubsystem();

    // OI class for input from joysticks, controllers, etc
    public static OI m_oi;

    // Currently selected autonomous command
    Command m_autonomousCommand;
    SendableChooser<Command> m_chooser = new SendableChooser<>();

    /**
    * This function is run when the robot is first started up and should be
    * used for any initialization code.
    */
    @Override
    public void robotInit() {
        m_oi = new OI();
        m_chooser.setDefaultOption("Default Auto", new ExampleCommand());
        // chooser.addOption("My Auto", new MyAutoCommand());
        SmartDashboard.putData("Auto mode", m_chooser);
    }

    /**
    * This function is called every robot packet, no matter the mode. Use
    * this for items like diagnostics that you want ran during disabled,
    * autonomous, teleoperated and test.
    */
    @Override
    public void robotPeriodic() {
    }

    /**
    * This function is called once each time the robot enters Disabled mode.
    * You can use it to reset any subsystem information you want to clear when
    * the robot is disabled.
    */
    @Override
    public void disabledInit() {
    }

    @Override
    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    /**
    * This autonomous (along with the chooser code above) shows how to select
    * between different autonomous modes using the dashboard.
    *
    * <p>You can add additional auto modes by adding additional commands to the
    * chooser code above (like the commented example)
    */
    @Override
    public void autonomousInit() {
        m_autonomousCommand = m_chooser.getSelected();

        // schedule the autonomous command (example)
        if (m_autonomousCommand != null) {
            m_autonomousCommand.start();
        }
    }

    /**
    * This function is called periodically during autonomous.
    */
    @Override
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    /**
    * This function is called when the robot enters operator control.
    */
    @Override
    public void teleopInit() {
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (m_autonomousCommand != null) {
            m_autonomousCommand.cancel();
        }
    }

    /**
    * This function is called periodically during operator control.
    */
    @Override
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }

    /**
    * This function is called periodically during test mode.
    */
    @Override
    public void testPeriodic() {
    }
}
```

## Robot Map ##

The **RobotMap** class contains all the devices attached to the robot. 

Example from 2019Neptune:

```java
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.VictorSP;
import frc.util.LimitSwitch;

public class RobotMap {

    // Drivetrain motor controllers
    public static WPI_VictorSPX
        frontRightDriveMotor = new WPI_VictorSPX(Constants.kFrontRightMotor), 
        frontLeftDriveMotor = new WPI_VictorSPX(Constants.kFrontLeftMotor),
        backRightDriveMotor = new WPI_VictorSPX(Constants.kBackRightMotor), 
        backLeftDriveMotor = new WPI_VictorSPX(Constants.kBackLeftMotor);

    // Cargo intake motor controllers
    public static Spark
        leftCargoIntakeMotor = new Spark(Constants.kLeftCargoIntakeMotor), 
        rightCargoIntakeMotor = new Spark(Constants.kRightCargoIntakeMotor);
    
    // Climber wheel motor controller
    public static Spark 
        climberWheelMotor = new Spark(Constants.kClimberWheelPort);
    
    // Climber lift motor controller
    public static VictorSP
        climberLiftMotor = new VictorSP(Constants.kClimberLiftPort);
   
    // Arm motor controllers
    public static WPI_TalonSRX
        armMasterMotor = new WPI_TalonSRX(Constants.kArmMasterPort),
        armSlaveMotor = new WPI_TalonSRX(Constants.kArmSlavePort);
     
    // Hatch intake motor controller
    public static Spark 
        hatchIntakeWheelMotor = new Spark(Constants.kHatchIntakeWheelPort);
    
    // Hatch pivot motor controller
    public static WPI_TalonSRX
        hatchIntakePivotMotor = new WPI_TalonSRX(Constants.kHatchIntakePivotPort);

    // Limit switches for arm reset, and autonomous climb
    public static LimitSwitch
        armZeroLimitSwitch = new LimitSwitch(Constants.kArmZeroLimitSwitchPort),
        climberTopLimitSwitch = new LimitSwitch(Constants.kClimberTopLimitSwitchPort),
        climberBottomLimitSwitch = new LimitSwitch(Constants.kClimberBottomLimitSwitchPort);
}
```

## OI ##

The **OI** class is used to retrieve input from devices connected to the driver station such as joysticks and controllers.

Example from 2019Neptune:

```java
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.cargointake.IntakeCargo;
import frc.robot.commands.climber.DeployClimber;
import frc.robot.commands.climber.RetractClimber;
import frc.robot.commands.hatchintake.IntakeHatch;
import frc.robot.commands.vision.AlignToTarget;
import frc.robot.commands.vision.DriveToTarget;

public class OI {
    // Joystick connected to the driver station
    public Joystick
        driveStick = new Joystick(Constants.kDriveStickPort);
    
    // Xbox Controller connected to the driver station
    public XboxController
        operatorController = new XboxController(Constants.kOperatorControllerPort);

    // Instantiate all the buttons used on the Xbox Controller and Joystick
    public Button
        intakeCargo = new JoystickButton(driveStick, Constants.kIntakeCargoButton),
        intakeHatch = new JoystickButton(driveStick, Constants.kIntakeHatchButton),
        alignToTarget = new JoystickButton(driveStick, Constants.kAlignToTargetButton),
        driveToTarget = new JoystickButton(driveStick, Constants.kDriveToTargetButton),
        deployClimber = new JoystickButton(operatorController, Constants.kDeployClimberButton),
        retractClimber = new JoystickButton(operatorController, Constants.kRetractClimberButton),
        autoDeployClimber = new JoystickButton(operatorController, Constants.kAutoDeployClimberButton),
        autoRetractClimber = new JoystickButton(operatorController, Constants.kAutoRetractClimberButton);

    // Map commands to certain button actions
    public OI() {
        intakeCargo.whileHeld(new IntakeCargo());
        intakeHatch.whileHeld(new IntakeHatch());
        alignToTarget.whileHeld(new AlignToTarget());
        deployClimber.whileHeld(new DeployClimber());
        retractClimber.whileHeld(new RetractClimber());
        driveToTarget.whileHeld(new DriveToTarget());
    }
}
```
