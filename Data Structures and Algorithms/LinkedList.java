package ADS;
public class LinkedList
{
Node head;//Start of list

static class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
	
}
 public void display()
 {
	 Node n = head;
	 while(n != null)
	 {
		 System.out.print(n.data+ "--->");
		 n = n.next;
		 
	 }
		 
 }
 
 //Insert at begining
  public void insert(int new_data)
  {
	Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	
  }
  
  public void deleteList() {
		head = null;
	}
 	public int CountNode()
	{
		Node temp = head;
		int count = 0;
		while (temp != null)
		{
			count++;
			temp = temp.next;
		}
		return count;
	}
	 

public static void main(String args[])
{
	LinkedList l1 = new LinkedList();
	
	l1.head = new Node(11);
	Node second  = new Node(12);
	Node third = new Node(13);
	
	l1.head.next = second;
	second.next = third;
	
	l1.display();
	System.out.println();
	System.out.println("...........");
	l1.insert(44);
	l1.insert(55);
	l1.insert(88);
	
	System.out.println();
	l1.display();
	
	System.out.println();

	System.out.println("Count of Nodes :"+ l1.CountNode());
	
	
	l1.deleteList();
	System.out.println();
	System.out.println("Linked List is deleted.");
	

}

}