
package org.usfirst.frc4692.Bastion.subsystems;
import org.usfirst.frc4692.Bastion.RobotMap;
import org.usfirst.frc4692.Bastion.commands.*;
import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {
    private final CANTalon leftfront = RobotMap.drivetrainleftfront;
    private final CANTalon leftback = RobotMap.drivetrainleftback;
    private final CANTalon rightfront = RobotMap.drivetrainrightfront;
    private final CANTalon rightback = RobotMap.drivetrainrightback;
    private final RobotDrive drive = RobotMap.drivetrainDrive;
    public void initDefaultCommand() {  	
    }
	public void takeJoystickInputs(Joystick joystick1, Joystick joystick2) {
		drive.tankDrive(joystick1.getY(), joystick2.getY());	
	}
	public void stop() {
		drive.tankDrive(0,0);
	}
	public void driveStraight(double d) {
		drive.tankDrive(1.0,1.0);
	}
}
