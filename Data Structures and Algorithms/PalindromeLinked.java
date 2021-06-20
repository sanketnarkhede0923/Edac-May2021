package ADS;

import java.util.Scanner;

class node1
{
	char data;
	node1 next;
	node1 head;
	node1()
	{
		data = 0;
		next = null;
	}
	node1(char x)
	{
		data = x;
		next = null;
	}
	
	void add(char x)
	{
		node1 nd = new node1(x);
		node1 temp = head;
		if(head==null)
		{
			head= nd;
		}
		else
		{
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next =nd;
			
		}
		
	}
	
	void display()
	{
		node1 temp = head;
		
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
}
public class PalindromeLinked {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str =sc.nextLine();
		int flag =0;
		int len =str.length();
		node1 nd = new node1();
		
		for(int i=0;i<len;i++)
		{
			char ch = str.charAt(i);
			nd.add(ch);		
		}
		nd.display();
		
		node1 temp =nd.head;
		for(int i =len-1;i>=0;i--)
		{
			if(temp.data!= str.charAt(i))
			{
				flag =1;
				break;

			}
			else
			{
				temp =temp.next;
			}
		}
		
		if(flag==0)
			System.out.println(" is palindrome");
		else
			System.out.println(" is not palindrome");
		
		
		

	}

}