import java.util.Scanner;
public class Que6
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the value of radius: ");
  double r=sc.nextDouble();
  double a=3.14*r*r;
  double c=2*3.14*r;
  
  System.out.println("Area of circle is: "+a);
  System.out.println("Circumference of circle is: "+c);
}
}