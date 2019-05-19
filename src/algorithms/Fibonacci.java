package algorithms;

public class Fibonacci {
public static void main(String[] args) {
int x = 0; 
int y = 1;
int z = x+y;
for (int i = 0; i < 12; i++) {
System.out.println(z);
x = y;
y = z;
z = x+y;
}
}
}


