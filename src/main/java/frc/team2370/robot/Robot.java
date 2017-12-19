package org.usfirst.frc.team2370.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class Robot extends IterativeRobot {

//Defines the variables as members of our Robot class
     RobotDrive myRobot;
     Joystick stick;


//Initializes the variables in the robotInit method, this method is called when the robot is initializing
     public void robotInit() {
          myRobot = new RobotDrive(0,1);
          stick = new Joystick(1);

     }
}