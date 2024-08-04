package frc.robot.commands;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.elevatorSubsystems;

public class elevatorPID extends CommandBase{

    private final Spark motor = new Spark(0);
    double disctance;
    private final PIDController pidController;
    private final elevatorSubsystems elevatorSubsystems;
    public elevatorPID(elevatorSubsystems elevatorSubsystems, PIDController pidController, double distance) {
        this.elevatorSubsystems = elevatorSubsystems;
        this.pidController = new PIDController(2.11, 0,0); //rastgele
        addRequirements(elevatorSubsystems);
    }

    
    @Override 
    public void initialize() {
        pidController.reset();
    }

    @Override 
    public void execute() {
        
    }

    @Override
    public void end(boolean interrupted) {
        elevatorSubsystems.setMotor(0);
    }
}
