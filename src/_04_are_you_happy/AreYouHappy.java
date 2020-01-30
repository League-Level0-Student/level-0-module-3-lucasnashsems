package _04_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {

	String A = JOptionPane.showInputDialog(null, "In this questioning you can only answer Yes or No."
			+ " Are you happy?");
	
	if (A.equals("Yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever your doing.");
	} else {
String AA = JOptionPane.showInputDialog(null, "Do you want to be happy?");
	
	
	if (AA.equals("Yes")) {
		JOptionPane.showMessageDialog(null, "Change something.");
	} else {
		JOptionPane.showMessageDialog(null, "Keep doing whatever your doing.");
	}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
