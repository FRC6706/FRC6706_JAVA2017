package org.usfirst.frc.team6706.robot.subsystems;

import org.usfirst.frc.team6706.robot.RobotMap;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CastBallSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	VictorSP castball = new VictorSP(RobotMap.CastBallMotor);
	
	public void setspeed(double speed) {
		castball.set(speed);
	}
	
	public void stop() {
		castball.stopMotor();
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

