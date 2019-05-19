package algorithms;

import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
String number = JOptionPane.showInputDialog("Pick a random number");
int prime = Integer.parseInt(number);
boolean check = false;
for (int i = 2; i < prime; i++) {	
if (prime % i == 0) {
check = true;
}
}
if (check == true) {
JOptionPane.showMessageDialog(null, "The number you entered is not a prime number");
}
else {
JOptionPane.showMessageDialog(null, "The number you entered is a prime number");
}
}
}



