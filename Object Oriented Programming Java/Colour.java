import java.util.*;

//Write a Java program to create a new array list, add some colors (string) and print out the collection.

public class Colour {
	public static void main(String[] args) {
		List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		for(String e: list_Strings)
		  System.out.println(e);	
	}

}
