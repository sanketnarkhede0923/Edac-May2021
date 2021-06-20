public class ExceptionExample{
	public static void main(String args[]){
		try{
			int a[]=new int[10];
			a[11]=55;
			}catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}
		//int data=100/0;
		//}catch(ArithmeticException e){System.out.println(e);}
		
		System.out.println("rest of the code.......");
	}
}