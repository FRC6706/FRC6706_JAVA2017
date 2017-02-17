package org.usfirst.frc.team6706.robot.subsystems;

import org.usfirst.frc.team6706.robot.RobotMap;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class GetBallSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	VictorSP getball = new VictorSP(RobotMap.GetBallMotor);
	
	public void setspeed(double speed) {
		getball.set(speed);
	}
	
	public void stop() {
		getball.stopMotor();
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

