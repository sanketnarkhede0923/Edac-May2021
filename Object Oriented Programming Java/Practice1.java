import java.util.*;
public class Que3
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the value of x,y,z");  
int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();
y= (x*x) + (3*x) - 7 ;
System.out.println("value of y" +y); 
y = x++ + ++x ;
System.out.println("value of y" +y);
 z = x++ - --y - --x  +  x++ ;
 System.out.println("value of z" +z);
 System.out.println("enter the boolean value of a,b");  
boolean a=sc.nextBoolean();
boolean b=sc.nextBoolean();
boolean c;

 
 
 c=a && b || !(a || b);
 System.out.println("value c=a && b || !(a || b)" +c);
 

}
}