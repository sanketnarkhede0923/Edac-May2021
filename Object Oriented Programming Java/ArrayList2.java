import java.util.ArrayList;
import java.util.List;
//Write a Java program to retrieve an element (at a specified index) from a given array list.
public class Exerciser4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		  list.add("Red");
		  list.add("Green");
		  list.add("Orange");
		  list.add("White");
		  list.add("Black");
		
		  System.out.println(list);
		  
		  String element= list.get(0);
		  System.out.println("First Element :"+ element);
		  
		  String element1= list.get(4);
		  System.out.println("Fifth Element :"+ element1);
		  
		  
		 
		 
	}

}


