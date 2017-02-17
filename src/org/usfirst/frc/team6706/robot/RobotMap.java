package org.usfirst.frc.team6706.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
		// RobotDrive Motor
		public static final int DriverFrontLeftPort = 3;
		public static final int DriverRearLeftPort = 2;
		public static final int DriverFrontRightPort = 0;		
		public static final int DriverRearRightPort = 1;		 
		public static final int ClimbRopeMotor = 4; 
		public static final int CastBallMotor = 5;
		public static final int GetBallMotor = 6;
		//GetBall Motor
		public static final double GetBallMotorSpeed = 0.6;
		public static final double CastBallMotorSpeed = 0.8;
		public static final double ClimbRopeMotorSpeed = 1; 
		//GetBall Button
		public static final int CastInBall = 1;
		public static final int StopCastBall = 2;
		public static final int CastOutBall = 3;
		public static final int GetInBall = 5;
		public static final int StopGetBall = 6;
		public static final int ClimbRopeUpButton = 7;
		public static final int ClimbRopeDownButton = 8;
		public static final int ClimbRopeHoldButton = 11;
		// GetBall Button Axis
		public static final int GetBallLeftAxis = 2;
		public static final int GetBallRightAxis = 3;
		//Drive Mode
		public static final int SlowCross = 5;
		public static final int FastCross = 6;
		public static final int DriveStraight = 4;
		// Gyro Drive Settings
		public static final double GyroDegreeTolerance = 3;
		public static final double GyroDegreeReduce = 40;
		public static final double GyroTurnSpeedMinimum = 0.3;
		public static final double GyroTurnSpeedMaximum = 0.95;
		public static final double GyroStraightRotateAdjust = 0.2;
		public static final double GyroStraightRotateTolerance = 1;
		//Autonomous 
		public static final double SlowCrossSpeed = 0.4;
		public static final double SlowCrossTime = 3;
		public static final double FastCrossSpeed = 0.4;
		public static final double FastCrossTime = 3;
}
