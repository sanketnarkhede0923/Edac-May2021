package ADS;
class Queue{
	int arr[];
	int head;
	int tail;
	int n;
	int cap;
	Queue(int size)
	{
		cap=size;
		arr=new int[size];
		head=0;
		tail=-1;
		n=0;
		
	}
	public boolean isEmpty(){
			return tail==-1;
		
		}
	public boolean isFull(){
			return tail==cap-1;
		}
	public void enqueue(int element){
		if(isFull()){
			System.out.println("queue is full");
		}
		n++;
		tail++;
		arr[tail]=element;
	}
		public void dequeue(){
			if(isEmpty()){
			System.out.println("queue is empty");
			}
			n--;
			System.out.println("dequeued element: "+arr[head++]);
		}
		public void peek(){
			System.out.println(arr[tail]);
		}
		void display(){
			System.out.println("Elements in queue");
			for(int i=head;i<=tail;i++)
			{
				System.out.println(arr[i]);
			}
			
		}
		
	}
public class QueueUsingArray {
		public static void main(String args[])
		{
			Queue obj=new Queue(5);
			obj.enqueue(95);
			obj.enqueue(23);
			obj.enqueue(34);
			obj.enqueue(55);
			obj.enqueue(44);
			System.out.println(obj.isFull());
			obj.dequeue();
			obj.dequeue();
			obj.display();
		}
	}


