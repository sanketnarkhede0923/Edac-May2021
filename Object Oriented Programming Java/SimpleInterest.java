import java.util.Scanner;
public class Que8
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Principle Amount: ");
  double p=sc.nextDouble();
  
  System.out.println("Enter Rate of Interest: ");
  double r=sc.nextDouble();
  
  System.out.println("Enter Time Period: ");
  double t=sc.nextDouble();
  double SI=(p*r*t)/100;
  System.out.println("Simple Interest: " +SI);
}

}
  
  
  
  