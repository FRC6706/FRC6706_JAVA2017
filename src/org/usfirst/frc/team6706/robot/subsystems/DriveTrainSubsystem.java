package org.usfirst.frc.team6706.robot.subsystems;

import org.usfirst.frc.team6706.robot.RobotMap;
import org.usfirst.frc.team6706.robot.commands.DriveTrainCommand;

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
		setDefaultCommand(new DriveTrainCommand());
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
	public void arcadeDrive(double moveValue, double rotateValue) {
		arcadeDrive(moveValue, rotateValue);
	}
	public void tankDrive(double leftValue, double rightValue, boolean isSquareInput) {
		drive.tankDrive(leftValue, rightValue, isSquareInput);
	}
	public void drive(Joystick mStick) {
		//drive.tankDrive(mStick.getY()*(-0.7), mStick.getThrottle()*(-0.7));
		drive.arcadeDrive(mStick.getThrottle()*(-0.7), mStick.getX()*(-0.7));
	}

	/**
	 * @param joy
	 *  The ps3 style joystick to use to drive tank style.
	 */
	public void stop() {
		drive.stopMotor();
	}
}
