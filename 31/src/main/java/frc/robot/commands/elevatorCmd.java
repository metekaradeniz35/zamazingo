package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.elevatorSubsystems;

public class elevatorCmd extends CommandBase{
    
    private final elevatorSubsystems elevatorSubsystems;
    double speed;
    public elevatorCmd(elevatorSubsystems elevatorSubsystems, double speed) {
        this.speed = speed;
        this.elevatorSubsystems = elevatorSubsystems;
        addRequirements(elevatorSubsystems);
    }

    @Override 
    public void initialize() {
    }

    @Override 
    public void execute() {
        elevatorSubsystems.setMotor(speed);
    }

    @Override
    public void end(boolean interrupted) {
        elevatorSubsystems.setMotor(0);
    }
}
