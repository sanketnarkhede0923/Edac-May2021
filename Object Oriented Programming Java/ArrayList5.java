
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Write a Java program to search an element in an array list. 

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		  list.add("Red");
		  list.add("Green");
		  list.add("Orange");
		  list.add("White");
		  list.add("Black");
		
		  System.out.println(list);
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter Element: ");
		  String colour=sc.next();
		  
		   if(list.contains (colour)) {
			   System.out.println("Element Found");
		   }
		   else {
			   System.out.println("Invalid Element");
		   }
 
		 
	}

}