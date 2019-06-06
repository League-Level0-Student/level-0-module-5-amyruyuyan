package nested_loops;

import javax.swing.JOptionPane;

public class SkillPracticeWorksheet {
public static void main(String[] args) {
String dimes = JOptionPane.showInputDialog("How many dimes do you have right now? This will translate it into cents");
int amount = Integer.parseInt(dimes);
int total = amount * 10;
JOptionPane.showMessageDialog(null, total);
String height = JOptionPane.showInputDialog("How tall are you in inches?");
int inches = Integer.parseInt(height);
if (inches <36) {
JOptionPane.showMessageDialog(null, "YOU need to eat your Wheaties!");
}
else {
JOptionPane.showMessageDialog(null, "I guess you DON'T have to eat your Wheaties!");	
}
for (int i = 1; i < 30; i ++) {
if (i % 3 == 0) {
System.out.println(i);
}
}
String number1 = JOptionPane.showInputDialog("Choose a number between 1 and 20. This will tell you the difference between this number and the next number you are going to pick.");
String number2 = JOptionPane.showInputDialog("Choose a number that is less than ten.");
int mixednumber1 = Integer.parseInt(number1);
int mixednumber2 = Integer.parseInt(number2);
int difference = mixednumber1 - mixednumber2;
JOptionPane.showMessageDialog(null, difference);
String city = JOptionPane.showInputDialog("Which city do YOU currently live in?");
int hometown = Integer.parseInt(city);
if (city == "San Diego") {
JOptionPane.showMessageDialog(null, "YOU live in America's finest city!");
}
else {
JOptionPane.showMessageDialog(null, "YOU SHOULD really move to San Diego");	
}
}
}
