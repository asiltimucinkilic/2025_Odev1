// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.


package frc.robot;

import edu.wpi.first.wpilibj.PS5Controller;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.Spark1Command;
import frc.robot.subsystems.Spark1;

public class RobotContainer {
  Spark1 spark1 = new Spark1();
  PS5Controller mDrivController = new PS5Controller(0);

  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();
  }

  private void configureBindings() {
    new JoystickButton(mDrivController, 1).onTrue(new Spark1Command(spark1, 0.5));
    new JoystickButton(mDrivController, 2).onTrue(new Spark1Command(spark1, -0.35));
  }

  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    return null;
  }
}