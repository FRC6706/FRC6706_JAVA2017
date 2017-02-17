package org.usfirst.frc.team6706.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team6706.robot.commands.CastInBallCommand;
import org.usfirst.frc.team6706.robot.commands.CastOutBallCommand;
import org.usfirst.frc.team6706.robot.commands.ClimbRopeDownCommand;
import org.usfirst.frc.team6706.robot.commands.ClimbRopeHoldCommand;
import org.usfirst.frc.team6706.robot.commands.ClimbRopeUpCommand;
import org.usfirst.frc.team6706.robot.commands.GetInBallCommand;
import org.usfirst.frc.team6706.robot.commands.StopCastBallCommand;
import org.usfirst.frc.team6706.robot.commands.StopGetBallCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	Joystick myStick = new Joystick(0);
	
	public Joystick getJoystick() {
		return myStick;
	}
	
	public OI(){
		
		SmartDashboard.putData("Ball In", new CastInBallCommand());
		SmartDashboard.putData("Ball Out", new CastOutBallCommand());
		SmartDashboard.putData("Stop Ball", new StopCastBallCommand());
				
		// GetBall buttons
		new JoystickButton(myStick, RobotMap.GetInBall).whenPressed(new GetInBallCommand());	
		new JoystickButton(myStick, RobotMap.StopGetBall).whenPressed(new StopGetBallCommand());	
		// CastBall buttons
		new JoystickButton(myStick, RobotMap.CastInBall).whenPressed(new CastInBallCommand());	
		new JoystickButton(myStick, RobotMap.CastOutBall).whenPressed(new CastOutBallCommand());	
		new JoystickButton(myStick, RobotMap.StopCastBall).whenPressed(new StopCastBallCommand());
		// CastBall buttons
		new JoystickButton(myStick, RobotMap.ClimbRopeUpButton).whenPressed(new ClimbRopeUpCommand());
		new JoystickButton(myStick, RobotMap.ClimbRopeDownButton).whenPressed(new ClimbRopeDownCommand());
		new JoystickButton(myStick, RobotMap.ClimbRopeHoldButton).whenPressed(new ClimbRopeHoldCommand());
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
