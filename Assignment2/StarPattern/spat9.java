public class spat9
{ 

public static void main(String[]args){


for(int i=1;i<=6;i++)
{
	for(int k=5;k>=i;k--)   // For space
{
	
System.out.print(" ");
}

for(int j=1;j<=i;j++)   // For Printing
{
	
System.out.print("*");
}

System.out.println();

}

for(int i=1;i<=5;i++)
{
	for(int k=1;k<=i;k++)   // For space
{
	
System.out.print(" ");
}

for(int j=5;j>=i;j--)   // For Printing
{
	
System.out.print("*");
}

System.out.println();

}

}
}