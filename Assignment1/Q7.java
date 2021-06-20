import java.util.Scanner;
public class Q7
{
public static void main (String args [])
{
	Scanner in =new Scanner(System.in);
	System.out.print("Input a number: ");
	int number1=in.nextInt();
	for(int i=0;i<10;i++)
	{
		System.out.println(number1 + "x" + (i+1) +" = " + (number1 * (i+1)));
	}
}
}
