
package org.usfirst.frc4692.Bastion;

import org.usfirst.frc4692.Bastion.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
    
    public Joystick joystick1;
    public Joystick joystick2;
    public Joystick gamepad;
    public JoystickButton lift;
    public JoystickButton belt;
    public JoystickButton hoodflipup;
    public JoystickButton hoodflipdown;
    public JoystickButton gearEject;
    public JoystickButton beltstop;
    public JoystickButton  shiftdown;
    public JoystickButton  shiftup;
    
    public OI() {
        
    	joystick1 = new Joystick(0);
        joystick2 = new Joystick(1);
        gamepad = new Joystick(2);
        gearEject = new JoystickButton(gamepad, 3);
        gearEject.whileHeld(new Spitgear());
        belt = new JoystickButton(gamepad, 5);
        belt.whenPressed(new ballbelt());
        hoodflipdown = new JoystickButton(gamepad, 1);
        hoodflipdown.whenPressed(new Flipdown());
        hoodflipup = new JoystickButton(gamepad, 4);
        hoodflipup.whenPressed(new Flipup());
        lift = new JoystickButton(gamepad, 2);
        lift.whileHeld(new Climb());
        beltstop = new JoystickButton(gamepad, 6);
        beltstop.whenPressed(new beltstop());
        shiftup = new JoystickButton(joystick1, 1);
        shiftup.whenPressed(new upshift());
        shiftdown = new JoystickButton(joystick2, 1);
        shiftdown.whenPressed(new downshift());
        
        SmartDashboard.putData("Autonomous", new Autonomous());
        SmartDashboard.putData("DriveWithJoysticks", new DriveWithJoysticks());
        SmartDashboard.putData("Climb", new Climb());
        SmartDashboard.putData("Flip up", new Flipup());
        SmartDashboard.putData("ballbelt", new ballbelt());
        SmartDashboard.putData("Flip down", new Flipdown());
        SmartDashboard.putData("Spitgear", new Spitgear());
        SmartDashboard.putData("Slide Extend", new SlideExtend());
    }
    public Joystick getJoystick1() {
        return joystick1;
    }
    public Joystick getJoystick2() {
        return joystick2;
    }
    public Joystick getGamepad() {
        return gamepad;
    }
}

