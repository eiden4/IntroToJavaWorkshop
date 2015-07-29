package day3;

import javax.swing.JOptionPane;

public class snooper {
public static void main(String[] args) {
	String a=JOptionPane.showInputDialog("What is your name");
	String b=JOptionPane.showInputDialog("what city do you live in");
	String c=JOptionPane.showInputDialog("What are you doing next week");
	String d=JOptionPane.showInputDialog("What is your phone number");
	String e=JOptionPane.showInputDialog("What school do you go to");
			JOptionPane.showMessageDialog(null, a+", I know you well. You live in "+b+ " and I will see you next week " +c+ " and I can call you at "+d+ " and you will go to "+e+ " next year. Don't give your information out to a computer.");
}
}
