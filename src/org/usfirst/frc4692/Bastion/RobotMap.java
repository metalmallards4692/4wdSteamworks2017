// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4692.Bastion;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.RobotDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANTalon drivetrainleft;
    public static CANTalon drivetrainright;
    public static RobotDrive drivetrainDrive;
    public static CANTalon winchWheel;
    public static CANTalon winchWheel1;
    public static CANTalon ballstuffSpitpick;
    public static CANTalon ballstuffAgitator;
    public static DoubleSolenoid toggleHood;
    public static DoubleSolenoid gearSlide;
    public static DoubleSolenoid gearSpit;
    public static DoubleSolenoid shiftshifter;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        drivetrainleft = new CANTalon(2);
        LiveWindow.addActuator("Drivetrain", "left", drivetrainleft);
        
        drivetrainright = new CANTalon(3);
        LiveWindow.addActuator("Drivetrain", "right", drivetrainright);
        
        drivetrainDrive = new RobotDrive(drivetrainleft, drivetrainright);
        
        drivetrainDrive.setSafetyEnabled(true);
        drivetrainDrive.setExpiration(0.1);
        drivetrainDrive.setSensitivity(0.5);
        drivetrainDrive.setMaxOutput(1.0);

        winchWheel = new CANTalon(4);
        LiveWindow.addActuator("Winch", "Wheel", winchWheel);
        
        winchWheel1 = new CANTalon(5);
        LiveWindow.addActuator("Winch", "Wheel1", winchWheel1);
        
        ballstuffSpitpick = new CANTalon(6);
        LiveWindow.addActuator("Ballstuff", "Spitpick", ballstuffSpitpick);
        
        ballstuffAgitator = new CANTalon(7);
        LiveWindow.addActuator("Ballstuff", "Agitator", ballstuffAgitator);
        
        toggleHood = new DoubleSolenoid(0, 0, 1);
        LiveWindow.addActuator("Toggle", "Hood", toggleHood);
        
        gearSlide = new DoubleSolenoid(0, 2, 3);
        LiveWindow.addActuator("Gear", "Slide", gearSlide);
        
        gearSpit = new DoubleSolenoid(0, 4, 5);
        LiveWindow.addActuator("Gear", "Spit", gearSpit);
        
        shiftshifter = new DoubleSolenoid(0, 6, 7);
        LiveWindow.addActuator("shift", "shifter", shiftshifter);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
