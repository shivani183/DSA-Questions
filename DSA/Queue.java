/*Implement a queue using a linked list in Java. Include the necessary methods such as 
enqueue, dequeue, and isEmpty.*/

package DSA;

class Node {
	int value;
	Node next;

	public Node(int value) {
		this.value = value;
		this.next = null;
	}
}

public class Queue {
	Node front, rear;

	static void Enqueue(Queue q, int d) {
		Node node = new Node(d);
		node.value = d;
		if (q.front == null)
			q.front = node;
		else
			q.rear.next = node;
		q.rear = node;
		q.rear.next = q.front;
	}

	static void Dequeue(Queue q) {
		if (q.front == null)
			System.out.print("Queue is empty");

		if (q.front == q.rear) {
			q.front = null;
			q.rear = null;
		} else {
			Node tp = q.front;
			q.front = q.front.next;
			q.rear.next = q.front;
		}
	}
	static boolean isEmpty(Queue q) {
		if (q.front == null)
			return true;
		else
			return false;
	}

	static void display(Queue q) {
		Node disp = q.front;
		while (disp.next != q.front) {
			System.out.print(disp.value + " ");
			disp = disp.next;
		}
		System.out.println(disp.value);
	}
	public static void main(String args[]) {
		Queue q = new Queue();
		q.front = q.rear = null;
		/*
		 * Enqueue(q, 34); Enqueue(q, 3); Enqueue(q, 8);
		 */
		
		Enqueue(q, 12);

		System.out.println("Values are ::- ");
		display(q);
		System.out.println();
		
		Dequeue(q);
		System.out.println("Values left ::- ");
		display(q);
		if(isEmpty(q))
			System.out.println("queue is empty");
		else
			System.out.println("queue is not empty");
			
	}
}
