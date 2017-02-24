package org.usfirst.frc.team6706.robot.subsystems;

import org.usfirst.frc.team6706.robot.RobotMap;
import org.usfirst.frc.team6706.robot.commands.DriveTrainTankCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrainSubsystem extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	private SpeedController frontLeftMotor = new VictorSP(RobotMap.DriverFrontLeftPort);
	private SpeedController rearLeftMotor = new VictorSP(RobotMap.DriverRearLeftPort);
	private SpeedController frontRightMotor = new VictorSP(RobotMap.DriverFrontRightPort);
	private SpeedController rearRightMotor = new VictorSP(RobotMap.DriverRearRightPort);

	private RobotDrive drive = new RobotDrive(frontLeftMotor, rearLeftMotor, frontRightMotor, rearRightMotor);

	

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		setDefaultCommand(new DriveTrainTankCommand());
	}
	
	/**
	 * Tank style driving for the DriveTrain.
	 * 
	 * @param left
	 *            Speed in range [-1,1]
	 * @param right
	 *            Speed in range [-1,1]
	 */
	public void drive(double left, double right) {
		drive.tankDrive(left, right);
	}
	public void tankDrive(double leftValue, double rightValue, boolean isSquareInput) {
		drive.tankDrive(leftValue, rightValue, isSquareInput);
	}
	public void drive(Joystick mStick) {
		//drive.arcadeDrive(mStick.getThrottle()*(-0.7), mStick.getX()*(-0.7));
		//
		if(mStick.getRawButton(7) && mStick.getRawButton(8)){
			drive.tankDrive(mStick.getY()*(-1.0), mStick.getThrottle()*(-1.0));
		}else if(mStick.getRawButton(8)){
			drive.tankDrive(mStick.getY()*(-0.9), mStick.getThrottle()*(-0.9));
		}else if(mStick.getRawButton(7)){
			drive.tankDrive(mStick.getY()*(-0.8), mStick.getThrottle()*(-0.8));
		}else if(mStick.getRawButton(5) && mStick.getRawButton(6)){
			drive.tankDrive(mStick.getY()*(-0.4), mStick.getThrottle()*(-0.4));
		}
		else if(mStick.getRawButton(5)){
			drive.tankDrive(mStick.getY()*(-0.6), mStick.getThrottle()*(-0.6));
		}
		else if(mStick.getRawButton(6)){
			drive.tankDrive(mStick.getY()*(-0.5), mStick.getThrottle()*(-0.5));
		}
		else {
			drive.tankDrive(mStick.getY()*(-0.7), mStick.getThrottle()*(-0.7));
		}
	}

	/**
	 * @param joy
	 *  The ps3 style joystick to use to drive tank style.
	 */
	public void stop() {
		drive.stopMotor();
	}
}
