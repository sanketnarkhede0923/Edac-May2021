import java.util.Scanner;


public class spat6
{ 

public static void main(String[]args){

Scanner sc=new Scanner(System.in);
System.out.println("Enter the lenth of STAR");
int n=sc.nextInt();

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

