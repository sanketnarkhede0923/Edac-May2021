package ADS;

public class BinarySearch {
	static int bsearch(int a1[], int x, int l, int h)
	{
		if (h >= l) {
				int mid = l + (h - l) / 2;
			if (a1[mid] == x)
				return mid;
			if (a1[mid] > x)
			return bsearch(a1, x, l, mid - 1);
			return bsearch(a1, x, mid + 1, h);
		}
		return -1;

	}

	public static void main(String args[])
	{
		int a1[]={1,2,3,4,5};
		int  x =4;
		int n = a1.length;
		int res = bsearch(a1,x,0,n-1);
		if( res == -1)
			System.out.print("Not found");
		else
			System.out.println(x+" is Found ");
		
	}
}



