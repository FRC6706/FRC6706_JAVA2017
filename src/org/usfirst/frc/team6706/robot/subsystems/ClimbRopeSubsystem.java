package org.usfirst.frc.team6706.robot.subsystems;

import org.usfirst.frc.team6706.robot.RobotMap;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ClimbRopeSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	VictorSP climbRope = new VictorSP(RobotMap.ClimbRopeMotor);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
	public void setspeed(double speed) {
		climbRope.set(speed);
	}
	
	public void stop() {
		climbRope.stopMotor();
	}
}

