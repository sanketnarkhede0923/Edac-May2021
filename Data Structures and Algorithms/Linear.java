package ADS;


public class Linear{
   public static void search(int a[],int n,int key)
   { int i;
	   for(i=0;i<n;i++)
     {
	   if(key==a[i])
	   {
		   System.out.println("Element " +key+ " is found at index "+i);
		   break;
	   }
     }
	  if(i==n)
	  {
		  System.out.println("Element is not found");
	  }
   }
	
	public static void main(String[] args) {
	int a[]={100,25,36,89,78,52,45,89,96,32,45,85,78,45,12};
	int n=a.length;
	search(a,n,85);

	}

}


