package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class pivotSubsystems extends SubsystemBase{

    public final Spark motor = new Spark(1);
    double speed;

    public void setMotor(double speed){
        motor.set(speed);
        
    }
}
