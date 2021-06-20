public class pat9
{ 

public static void main(String[]args){
int c=64;
for(int i=1;i<=5;i++)
{
	for(int k=5;k>=i;k--)   // For space
{
	
System.out.print(" ");
}

for(int j=1;j<=i;j++)   // For Printing
{
	
System.out.print((char)(c+j)+" ");
}

System.out.println();
c=64;
}
}
}