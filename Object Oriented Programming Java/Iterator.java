import java.util.*;

public class Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList <String> list_Strings = new ArrayList <String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  
		  java.util.Iterator<String> itr=list_Strings.iterator();
		  while(itr.hasNext()){
          System.out.println(itr.next());

	}

	
	}

}
                                 