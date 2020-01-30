package _05_horoscope;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	
String A =	JOptionPane.showInputDialog(null, "What is your star sign?");
	
	if (A.equals("Aries")) {
		JOptionPane.showMessageDialog(null, "Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action.");
	}
	if (A.equals("Taurus")) {
		JOptionPane.showMessageDialog(null, "Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature.");
	}
	if (A.equals("Gemini")) {
		JOptionPane.showMessageDialog(null, "Cerebral, chatty, loves learning and education, charming, and adventurous.");
	}
	if (A.equals("Cancer")) {
		JOptionPane.showMessageDialog(null, "Emotional, group oriented, seeks security, family.");
	}
	if (A.equals("Leo")) {
		JOptionPane.showMessageDialog(null, "Generous, organized, protective, beautiful.");
	}
	if (A.equals("Virgo")) {
		JOptionPane.showMessageDialog(null, "Particular, logical, practical, sense of duty, critical.");
	}
	if (A.equals("Libra")) {
		JOptionPane.showMessageDialog(null, "Balanced, seeks beauty, sense of justice.");
	}
	if (A.equals("Scorpio")) {
		JOptionPane.showMessageDialog(null, "Passionate, exacting, loves extremes, combative, reflective.");
	}
	if (A.equals("Saggitarius")) {
		JOptionPane.showMessageDialog(null, "Happy, absent minded, creative, adventurous.");
	}
	if (A.equals("Capricorn")) {
		JOptionPane.showMessageDialog(null, "Timeless, driven, calculating, ambitious.");
	}
	if (A.equals("Aquarius")) {
		JOptionPane.showMessageDialog(null, "Forward thinking, communicative, people oriented, stubborn, generous, and dedicated.");
	}
	if (A.equals("Pisces")) {
		JOptionPane.showMessageDialog(null, "Likeable, energetic, passionate, sensitive.");
	}
	else {
		JOptionPane.showMessageDialog(null, "That is not a star sign.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
