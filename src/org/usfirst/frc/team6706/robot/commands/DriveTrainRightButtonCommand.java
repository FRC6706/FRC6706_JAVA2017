package org.usfirst.frc.team6706.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team6706.robot.Robot;

/**
 *
 */
public class DriveTrainRightButtonCommand extends Command {
	public DriveTrainRightButtonCommand() {
		requires(Robot.drivetrain);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		Robot.drivetrain.drive(0.4, -0.4);
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		Robot.drivetrain.stop();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
		end();
	}
}
