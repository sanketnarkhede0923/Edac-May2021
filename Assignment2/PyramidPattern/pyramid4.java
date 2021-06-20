public class pyramid4
{ 

public static void main(String[]args){
for(int i=1;i<=9;i++)
{
for(int c=8;c>=i;c--)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print(k);
}
for(int j=i-1;j>=1;j--)
	{
		System.out.print(j);
		
	}
	System.out.println();
}

}
}
