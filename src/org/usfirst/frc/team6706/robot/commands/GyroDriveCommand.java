package org.usfirst.frc.team6706.robot.commands;

import org.usfirst.frc.team6706.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GyroDriveCommand extends Command {

	double leftspeed;
	double rightspeed;
    
    public GyroDriveCommand(double leftspeed, double rightspeed) {
        // Use requires() here to declare subsystem dependencies
    	requires(Robot.drivetrain);
    	this.leftspeed = leftspeed;
        this.rightspeed = rightspeed;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drivetrain.drive(leftspeed, rightspeed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drivetrain.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
