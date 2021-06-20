import java.util.Scanner;


public class spat7
{ 

public static void main(String[]args){

Scanner sc=new Scanner(System.in);
System.out.println("Enter the lenth of STAR");
int n=sc.nextInt();

for(int i=1;i<=n;i++)
{
for(int j=n;j>=i;j--)//space program
{
System.out.print(" ");
}

for(int k=1;k<=i;k++)//for  1st star 
{
System.out.print("*");
}

for(int g=2;g<=i;g++)//for 2nd star
{
System.out.print("*");
}
System.out.println();

}




n=n-1;
for(int l=1;l<=n;l++)
{
for(int j=0;j<=l;j++)//space program
{
System.out.print(" ");
}

for(int k=n-1;k>=l;k--)//for  1st star 
{
System.out.print("*");
}

for(int g=n;g>=l;g--)//for 2nd star
{
System.out.print("*");
}
System.out.println();

}

}

}