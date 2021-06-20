import java.util.*;

public class QueueExample {
	public static void main(String[] args) {
		Queue<String> items = new LinkedList<String>();
		items.add("Apple");
		items.add("Mango");
		items.add("Orange");
		items.add("Banana");
		items.add("Kiwi");
	    items.offer("Sumpra");
	    
		if(items.size() == 5)
			items.remove(); 
		System.out.println(items);
		
		items.forEach((i)->System.out.println(i));
	}

}