/*Implement a stack using an array in Java. Include the necessary methods such 
as push, pop, and isEmpty*/

package DSA;

import java.util.Iterator;
import java.util.Stack;

public class Que1 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(100); // Operation 1
		s.add(12); // Operation 2
		s.push(90); // Operation 3

		Iterator i;
		i = s.iterator();
		System.out.println("Elements after 3 operations of 'push' and 'add' are :: ");
		while (i.hasNext()) {
			System.out.println(i.next() + " ");
		}

		s.pop(); // Operation 4 "pop"

		i = s.iterator();
		System.out.println("Elements after 4th operation i.e. 'pop' are :: ");
		while (i.hasNext()) {
			System.out.println(i.next() + " ");
		}

		if (s.isEmpty()) {
			System.out.println("The stack is empty");
		} else {
			System.out.println("The stcak is not empty");
		}

	}

}
