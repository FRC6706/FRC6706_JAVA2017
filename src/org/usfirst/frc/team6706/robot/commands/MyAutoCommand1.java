package org.usfirst.frc.team6706.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class MyAutoCommand1 extends CommandGroup {

    public MyAutoCommand1() {
        // Add Commands here:
    	addSequential(new GyroDriveCommand(0.6, 0.6), 2);
        addSequential(new GetInBallCommand(), 2);
        addSequential(new CastInBallCommand(), 2);
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
