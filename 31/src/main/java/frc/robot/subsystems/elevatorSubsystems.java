package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class elevatorSubsystems extends SubsystemBase{
    
        private final Spark motor1 = new Spark(0);
        double speed;
        private final Encoder encoder = new Encoder(7,8);
        private final double kEncoderTick2Meter = 1.0 / 4096 * 0.1 * Math.PI; // formül hafif kopyalandı

        public void setMotor(double speed) {
            motor1.set(speed);  
        }

        public double getEncoderMeters() {
            return encoder.get() * kEncoderTick2Meter;
        }


}
