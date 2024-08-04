// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.elevatorCmd;
import frc.robot.commands.pivotCmd;
import frc.robot.subsystems.elevatorSubsystems;
import frc.robot.subsystems.pivotSubsystems;

public class RobotContainer {

  private final elevatorSubsystems elevatorSubsystems = new elevatorSubsystems();
  private final pivotSubsystems pivotSubsystems = new pivotSubsystems();
  private final Joystick joy1 = new Joystick(7);

    public RobotContainer() {
      elevatorSubsystems.setDefaultCommand(new elevatorCmd(elevatorSubsystems, 0));
      pivotSubsystems.setDefaultCommand(new pivotCmd(pivotSubsystems, 0));

    configureBindings();
  }

  private void configureBindings() {
    new JoystickButton(joy1, 1).whileTrue(new elevatorCmd(elevatorSubsystems, 0.5)); // rastgele sayı
    new JoystickButton(joy1, 2).whileTrue(new pivotCmd(pivotSubsystems, 0.5));
    new JoystickButton(joy1, 3).whileTrue(new elevatorPID(elevatorSubsystems, 0.5));
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
