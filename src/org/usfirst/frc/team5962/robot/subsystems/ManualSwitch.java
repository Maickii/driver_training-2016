package org.usfirst.frc.team5962.robot.subsystems;

import org.usfirst.frc.team5962.robot.RobotMap;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ManualSwitch extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	private final static DigitalInput stopSwitch = RobotMap.ManualSwitch;
	
	public static boolean sensor (){
		return stopSwitch.get();
	  //Say when ball reaches sensor
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    
}

