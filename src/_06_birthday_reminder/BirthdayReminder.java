
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "August 20th";
		String dadsBirthday = "June 20th";
		String myBirthday = "January 8th";

		// 2. Find out which birthday the user wants and and store their response in a variable
String E = JOptionPane.showInputDialog(null, "Which birthday do you want to store. Mom, Dad, or Me.");
		// 3. Print out what the user typed
System.out.println(E);
		// 4. if user asked for "mom"
			//print mom's birthday

if (E.equals("Mom")) {
	System.out.println("August 20th");
}
if (E.equals("Dad")) {
	System.out.println("June 20th");
}
if (E.equals("Me")) {
	System.out.println("January 8th");
}
else {
	System.out.println("Sorry I dont know that birthday.");
}







		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
