//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _02_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
	String Cat =	JOptionPane.showInputDialog(null, "How many cats do you have" );
		// 2. Convert their answer into an int
	int A = Integer.parseInt(Cat);
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
	if (A > 2) {
	JOptionPane.showMessageDialog(null, "You are a crazy cat lady.");
	
}
	
if (A < 3 && A > 0)	{
	
	playVideo("https://www.youtube.com/watch?v=qIDEC2h4dZo");
	
}
		// 4. If t