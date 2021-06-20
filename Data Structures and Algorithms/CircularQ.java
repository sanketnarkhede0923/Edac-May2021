package ADS;

public class CircularQ {

		int SIZE = 5;
		int front, rear;
		int items[] = new int[SIZE];

		CircularQ() 
		{
			front = -1;
			rear = -1;
		}

		boolean isFull() {
			if (front == 0 && rear == SIZE - 1) {
				return true;
			}
			if (front == rear + 1) {
				return true;
			}
			return false;
		}

		boolean isEmpty() {
			if (front == -1)
				return true;
			else
				return false;
		}

		void enQueue(int element) {
			if (isFull()) {
				System.out.println("\nQueue is full !!!-------");
			} else {
				if (front == -1)
					front = 0;
				rear = (rear + 1) % SIZE;
				items[rear] = element;
				System.out.print(" " + element);
			}
		}

		int deQueue() {
			int element;
			if (isEmpty()) {
				System.out.println("\nQueue is empty !!!-------");
				return (-1);
			} else {
				element = items[front];
				if (front == rear) {
					front = -1;
					rear = -1;
				} else {
					front = (front + 1) % SIZE;
				}
				return (element);
			}
		}

		void display() {

			int i;
			if (isEmpty()) {
				System.out.println("Empty Queue---------");
			} else {
				
				for (i = front; i != rear; i = (i + 1) % SIZE)
				System.out.print(items[i] + " ");
				
			}
		}

		public static void main(String[] args) {

			CircularQ q = new CircularQ();

			q.deQueue();

			q.enQueue(11);
			q.enQueue(22);
			q.enQueue(33);
			q.enQueue(44);
			q.enQueue(55);
			q.enQueue(66);
			q.display();

			int elem = q.deQueue();

			if (elem != -1) 
			{
				System.out.println("\nDeleted Element is " + elem);
			}
			q.display();
			q.enQueue(8);
		}

	}


