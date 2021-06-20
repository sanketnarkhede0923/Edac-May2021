import java.util.ArrayList;
import java.util.List;

//Write a Java program to remove the third element from an array list. 

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		  list.add("Red");
		  list.add("Green");
		  list.add("Orange");
		  list.add("White");
		  list.add("Black");
		
		  System.out.println(list);
		  
		  list.remove(3);
		  System.out.println("After Removing 3rd Element: " + list);
 
		 
	}

}