package org.usfirst.frc.team6706.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team6706.robot.commands.CastInBallCommand;
import org.usfirst.frc.team6706.robot.commands.CastOutBallCommand;
import org.usfirst.frc.team6706.robot.commands.ClimbRopeHoldCommand;
import org.usfirst.frc.team6706.robot.commands.ClimbRopeUpCommand;
import org.usfirst.frc.team6706.robot.commands.DriveTrainBackButtonCommand;
import org.usfirst.frc.team6706.robot.commands.DriveTrainForwardButtonCommand;
import org.usfirst.frc.team6706.robot.commands.DriveTrainLeftButtonCommand;
import org.usfirst.frc.team6706.robot.commands.DriveTrainRightButtonCommand;
import org.usfirst.frc.team6706.robot.commands.DriveTrainTurnLeft;
import org.usfirst.frc.team6706.robot.commands.DriveTrainTurnRight;
import org.usfirst.frc.team6706.robot.commands.GetInBallCommand;
import org.usfirst.frc.team6706.robot.commands.StopCastBallCommand;
import org.usfirst.frc.team6706.robot.commands.StopGetBallCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	Joystick myStick = new Joystick(0);
	
	Joystick myRobotStick = new Joystick(1);	
	public Joystick getJoystick() {
		return myStick;
	}
	
	public OI(){
		
		//SmartDashboard.putNumber("Get Ball Speed", Robot.pivot.getAngle());
		
		SmartDashboard.putData("Cast Ball In", new CastInBallCommand());
		SmartDashboard.putData("Cast Ball Out", new CastOutBallCommand());
		SmartDashboard.putData("Stop Cast Ball", new StopCastBallCommand());
		SmartDashboard.putData("Get Ball In", new GetInBallCommand());
		SmartDashboard.putData("Stop Get Ball", new StopGetBallCommand());
		
		SmartDashboard.putData("Climb Rope Up", new ClimbRopeUpCommand());
		SmartDashboard.putData("Stop Climb Rope", new ClimbRopeHoldCommand());

		//Button Drive
		new JoystickButton(myStick, RobotMap.DriveForward).whileHeld(new DriveTrainForwardButtonCommand());
		new JoystickButton(myStick, RobotMap.DriveBack).whileHeld(new DriveTrainBackButtonCommand());
		new JoystickButton(myStick, RobotMap.DriveLeft).whileHeld(new DriveTrainLeftButtonCommand());
		new JoystickButton(myStick, RobotMap.DriveRight).whileHeld(new DriveTrainRightButtonCommand());
		new JoystickButton(myStick, RobotMap.TurnLeft).whenPressed(new DriveTrainTurnLeft());//need test
		new JoystickButton(myStick, RobotMap.TurnRight).whenPressed(new DriveTrainTurnRight());//need test
		// GetBall buttons
		new JoystickButton(myRobotStick, RobotMap.GetInBall).whenPressed(new GetInBallCommand());	
		new JoystickButton(myRobotStick, RobotMap.StopGetBall).whenPressed(new StopGetBallCommand());	
		// CastBall buttons
		new JoystickButton(myRobotStick, RobotMap.CastInBall).whenPressed(new CastInBallCommand());	
		new JoystickButton(myRobotStick, RobotMap.CastOutBall).whenPressed(new CastOutBallCommand());	
		new JoystickButton(myRobotStick, RobotMap.StopCastBall).whenPressed(new StopCastBallCommand());
		// CastBall buttons
		new JoystickButton(myRobotStick, RobotMap.ClimbRopeUpButton).whenPressed(new ClimbRopeUpCommand());
		new JoystickButton(myRobotStick, RobotMap.ClimbRopeHoldButton).whenPressed(new ClimbRopeHoldCommand());
	}
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
