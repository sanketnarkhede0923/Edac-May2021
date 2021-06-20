public class pyramid1
{ 

public static void main(String[]args){

for(int i=1;i<=9;i++)
{
for(int c=9;c>=i;c--)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print(i+" ");
}
System.out.println();
}
}
}