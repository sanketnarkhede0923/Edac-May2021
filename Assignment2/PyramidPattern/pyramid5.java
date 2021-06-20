public class pyramid5
{ 

public static void main(String[]args){
for(int i=9;i>=1;i--)
{
for(int c=1;c<=i;c++)
{
System.out.print(" ");
}
for(int k=i;k<=9;k++)
{
System.out.print(k);
}
for(int j=8;j>=i;j--)
	{
		System.out.print(j);
		
	}
	System.out.println();

}

}
}
