package ADS;

class Stack{
	int arr[];
	int top;
	int cap;
	public Stack(int size){
		arr=new int[size];
		top=-1;
		cap=size;
	}
	
	boolean isFull(){
		return top==(cap-1);
	}
	
	boolean isEmpty(){
	return top==-1;
	}	
	
	void push(int element)
	{
		if(isFull()){
			System.out.println("Stack overflow");
		}
		top++;
		arr[top]=element;
		System.out.println(arr[top]);
	}
	void pop()
	{
		if(isEmpty()){
			System.out.println("Stack underflow");
		}
		System.out.println(arr[top--]);
	}
	int peek(){
		System.out.println(arr[top]);
		return arr[top];
	}
}

public class StackUsingArray {
	public static void main(String args[])
	{
		 Stack obj=new  Stack(5);
		 obj.push(15);
		 obj.push(58);
		 obj.push(86);
		 obj.push(32);
		 //obj.pop();
		// obj.pop();
		// obj.pop();
		// obj.peek();
	}
}


