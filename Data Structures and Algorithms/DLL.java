package ADS;

 public class DLL {
	static Node head; // head of list

	static class Node {
		int data;
		Node prev;
		Node next;
		Node temp;

		Node(int d) { data = d; }
	}
	public void insert(int new_data)
	{
		
		Node new_Node = new Node(new_data);
		new_Node.next = head;
		new_Node.prev = null;
		if (head != null)
			head.prev = new_Node;
		head = new_Node;
	}
	
public void insertEnd(int new_data)
{
	Node new_Node=new Node(new_data);
	Node temp=head;
	new_Node.next=null;
	if(head==null) {
		new_Node.prev=null;
		head=new_Node;
	}
		while(temp.next!=null) {
			temp=temp.next;
			
		}
		new_Node.prev=temp;
		temp.next=new_Node;
	}
//public void insertBet(Node prev_Node,int new_data) {
//	if(prev_Node==null) {
//		System.out.println("Previous node cannot be null");
//		return;
//	}
//	Node new_Node=new Node(new_data);
//	prev_Node.next=new_Node.next;
//	prev_Node.next=new_Node;
//	new_Node.prev=prev_Node;
//	
//	if(new_Node.next!=null){
//		new_Node.next.prev=new_Node;
//	}
//}

public void InsertAtPos(int new_data,int poss)
{
	int i=0;
	// to check position is valid or not
	if(poss>0){
    Node new_Node =new Node (new_data);
	
	Node trav= head;
	if(poss==1)
	{
			new_Node.next = head;
		   head = new_Node;
	}
	
	for(i=2;i<poss;i++)
		 {
		   	trav = trav.next;
		 }
	new_Node.next= trav.next;
	trav.next = new_Node;
    }
    else
	{
    	
    	System.out.println("Invalid position\n");
    }
}

	
	public void display()
	{
		Node new_data = head;
		while( new_data != null ){
			System.out.print(new_data.data + "--->");
			new_data = new_data.next;		
		}
		

	}
	public void reverse() {
		
    	Node prev=null;
		Node curr=head;
		Node next=null;
		
		System.out.println("Reverse direction");
		while(curr!=null) {
			
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
		
		
		
	}
//		Node last = null;
//		System.out.println("forward Direction");
//		while (node != null) {
//			System.out.print(node.data + "--->");
//			last = node;
//			node = node.next;
//		}
//		System.out.println();
//		System.out.println("Reverse direction");
//		while (last != null) {
//			System.out.print(last.data + "--->");
//			last = last.prev;
//		}
//	}
	
	void delete(int index)
	{
		
		if(head == null)
		{
			System.out.println("List is empty");
			System.exit(0);
		}
		if(index == 0)
		{
			if(head.next != null)		//if there are 2 or more nodes
			{
				head = head.next;
			}
			else						//if there is only one node
			{
				head = null;
			}
		}
		else
		{
			Node temp = head;
			for(int i = 0; i<index-1; i++)
			{
				temp = temp.next;
			}
			temp.next = temp.next.next;
			temp.next.prev = temp;
		}
	}
	
	void deleteLast()
	{
		if(head == null)
		{
			System.out.println("List is empty");
		}
		if(head.next == null)
		{
			head = null;
		}
		else
		{
			Node temp = head;
			while(temp.next.next != null)
			{
				temp = temp.next;
			}
			temp.next = null;
		}
	}
	void findMid() {
		Node slow=head;
		Node fast=head;
		
		while(fast!=null && fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
			
		}
		System.out.println("Mid Element: " + slow.data);
		
	}
	
	
	public static void main(String[] args) {
		DLL DLink=new DLL();
		DLink.insert(200);
		DLink.insert(150);
		DLink.insert(125);
		DLink.insert(120);
		DLink.insert(100);
		DLink.insertEnd(50);
		DLink.insertEnd(40);
//		DLink.insertEnd(30);
//		DLink.insert(10000);
//		DLink.insertEnd(1000000);
//		
		//DLink.insertBet((100), 45);
		
		//DLink.InsertAtPos(45,5);
		
	
		
		DLink.display();
		System.out.println();
		
		
//		DLink.delete(0);
//		DLink.deleteLast();
//		DLink.display();
//		System.out.println();
		
		DLink.reverse();
		DLink.display();
		System.out.println();
		
		DLink.findMid();
		//DLink.display();
		
		

	}


	}


