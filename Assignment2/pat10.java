public class pat10
{ 

public static void main(String[]args){
	int c=64;

for(int i=5;i>=1;i--)
{
	for(int k=1;k<=i;k++)   // For space
{
	
System.out.print(" ");
}

for(int j=i;j<=5;j++)   // For Printing
{
	
System.out.print((char)(c+j)+" ");
}

System.out.println();
c=64;

}
}
}