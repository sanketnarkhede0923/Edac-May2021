import java.util.Stack;

public class Stack {
	public static void main(String[] args) {
		Stack<Integer> myStack = new Stack<Integer>();
		for (int i = 0; i < 10; i++) {
			myStack.push(i + 1);
		}
		
		for (int i = 0; i < myStack.size(); i++) {
			System.out.println(myStack.get(i));
		}
		for (int i = 0; i < myStack.capacity(); i++) {
			
			System.out.println(myStack.pop());
		}
	}
}