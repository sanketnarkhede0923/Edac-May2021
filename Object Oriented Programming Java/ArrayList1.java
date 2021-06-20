import java.util.ArrayList;
import java.util.List;
//Write a Java program to insert an element into the array list at the first position.
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		  list.add("Red");
		  list.add("Green");
		  list.add("Orange");
		  list.add("White");
		  list.add("Black");
		
		  System.out.println(list);
		 
		  list.add(1,"Pink");
		  list.add(5,"Grey");
		  
		  System.out.println(list);

	}

}
