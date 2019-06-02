package nested_loops;

public class FourLoopGuantlet {
public static void main(String[] args) {
for(int i = 0; i < 100; i ++) {
System.out.println(i);
}
for(int j = 100; j > 0; j --) {
System.out.println(j);
}
for(int k = 2; k < 100; k ++) {
if (k % 2 == 0)	{
System.out.println(k);
}
}
for(int k = 1; k < 99; k ++) {
if (k % 2 == 0)	{
System.out.println(k);
}
}
}
}
