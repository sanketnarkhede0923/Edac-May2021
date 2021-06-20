import java.util.Scanner;
public class Que7
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter marks of five subjects: ");
  
  int math=sc.nextInt();
  int social=sc.nextInt();
  int science=sc.nextInt();
  int english=sc.nextInt();
  int hindi=sc.nextInt();
  
  float total=math+social+science+english+hindi;
  float percentage= (total/500)*100;
  
  System.out.println("Percentage marks= "+percentage);
}
}
  
  