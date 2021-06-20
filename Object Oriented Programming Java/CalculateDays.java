import java.util.Scanner;
public class Que9
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
  System.out.println("Enter number of days: ");
  int days=sc.nextInt();
  
 int yr=(days/365);
 int months=(days%365)/30;
 int rd=(days%365)%30;
 
 System.out.println(yr+" Years "+months+" Months "+rd+" Days " );
}
}
 
 
 
 
 
 
 
 
 
 