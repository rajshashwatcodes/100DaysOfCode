import static java.lang.System.exit;

public class stackOverflow {
    public static void main(String[] args) {

		StackUsingLinkedlist obj = new StackUsingLinkedlist();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);

		obj.display();

		System.out.printf("\nTop element is %d\n",
						obj.peek());

		obj.pop();
		obj.pop();

		obj.display();

		System.out.printf("\nTop element is %d\n",
						obj.peek());
	}
}

class StackUsingLinkedlist {

	private class Node {

		int data; // integer data
		Node link; // reference variable Node type
	}
	Node top;
	StackUsingLinkedlist() { this.top = null; }

	public void push(int x) // insert at the beginning
	{
		Node temp = new Node();

		//if (temp == null) {
		//	System.out.print("\nHeap Overflow");
		//}

		temp.data = x;

		temp.link = top;

		top = temp;
	}

	public boolean isEmpty() { return top == null; }

	public int peek()
	{
		if (!isEmpty()) {
			return top.data;
		}
		else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	public void pop() // remove at the beginning
	{
		if (top == null) {
			System.out.print("\nStack Underflow");
			return;
		}

		// update the top pointer to point to the next node
		top = (top).link;
	}

	public void display()
	{
		// check for stack underflow
		if (top == null) {
			System.out.printf("\nStack Underflow");
			exit(1);
		}
		else {
			Node temp = top;
			while (temp != null) {

				// print node data
				System.out.print(temp.data);

				// assign temp link to temp
				temp = temp.link;
				if(temp != null)
					System.out.print(" -> ");
			}
		}
	}
}
