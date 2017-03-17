
package org.usfirst.frc.team6706.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team6706.robot.commands.GyroDriveCommand;
import org.usfirst.frc.team6706.robot.commands.MyAutoCommand1;
import org.usfirst.frc.team6706.robot.commands.MyAutoCommand2;
import org.usfirst.frc.team6706.robot.subsystems.CastBallSubsystem;
import org.usfirst.frc.team6706.robot.subsystems.ClimbRopeSubsystem;
import org.usfirst.frc.team6706.robot.subsystems.DriveTrainSubsystem;
import org.usfirst.frc.team6706.robot.subsystems.GetBallSubsystem;
import org.usfirst.frc.team6706.robot.subsystems.VisionSubsystem;
import org.usfirst.frc.team6706.robot.subsystems.VisionSubsystem2;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static final DriveTrainSubsystem drivetrain = new DriveTrainSubsystem();
	public static final GetBallSubsystem getball = new GetBallSubsystem();
	public static final CastBallSubsystem castball = new CastBallSubsystem();
	public static final VisionSubsystem vision = new VisionSubsystem();
	public static final VisionSubsystem2 vision2 = new VisionSubsystem2();
	public static final ClimbRopeSubsystem climbrope = new ClimbRopeSubsystem();
	public static OI oi;

	Command mAutonomousCommand;
	public SendableChooser<Command> autoChooser;

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		oi = new OI();
		autoChooser = new SendableChooser<Command>();
		autoChooser.addDefault("My Auto 1", new MyAutoCommand1());
		//autoChooser.addObject("My Auto 2", new MyAutoCommand2());
		//autoChooser.addObject("My Auto 3", new GyroDriveCommand(0.6, 0.6));
		SmartDashboard.putData("Auto mode", autoChooser);
	}

	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {
		mAutonomousCommand = (Command) autoChooser.getSelected();
		//mAutonomousCommand.start();
		if (mAutonomousCommand != null)
			mAutonomousCommand.start();
		/*
		 * String autoSelected = SmartDashboard.getString("Auto Selector",
		 * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
		 * = new MyAutoCommand(); break; case "Default Auto": default:
		 * autonomousCommand = new ExampleCommand(); break; }
		 */

		/*
		// schedule the autonomous command (example)
		if (autonomousCommand != null)
			autonomousCommand.start();
		*/
	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		if (mAutonomousCommand != null)
			mAutonomousCommand.cancel();
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
		LiveWindow.run();
	}
}
