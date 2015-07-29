package day3;

import javax.swing.JOptionPane;

public class greeter {
public static void main(String[] args) {
	String userInput=JOptionPane.showInputDialog("what's your name?");
	JOptionPane.showMessageDialog(null, "hello, "+userInput);
}
}
