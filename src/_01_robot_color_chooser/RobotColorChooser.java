		//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) throws InterruptedException {
		//1. Create a new Robot
		Robot E = new Robot("mini");
		for (int i = 0; i < 20; i++) {
			
		
		//3. Ask the user what color they would like the robot to draw
		String A = JOptionPane.showInputDialog(null, "What color would you like?(Choose, Red, or Blue)" );
		//5. Use an if/else statement to set the pen color that the user requested
if (A.equals("Red")) {
E.setPenColor(Color.RED);	
} if(A.equals("Blue") ) {
E.setPenColor(Color.BLUE);
	
}else {
E.setRandomPenColor();
}
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		E.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
 E.microMove(90);
 E.microTurn(90);
 E.microMove(90);
 E.microTurn(90);
 E.microMove(90);
 E.microTurn(90);
 E.microMove(90);
 E.microTurn(90);

		}
	}
}
