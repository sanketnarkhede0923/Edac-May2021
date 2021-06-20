public class pyramid2
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
System.out.print(k+" ");
}
System.out.println();
}
}
}