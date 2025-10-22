public class ReverseStack {


	/*
	 * 1: complete implementation
	 */
	/** Reverses the order of elements in the given stack
	 * 
	 * Where N is the number of elements in the stack the complexity is:
	 *
	 * O(N)
	 * 
	 * Because: The amount of elements in the list will affect the time the code will take to reverse the elements (a list with two elements will compile faster
	 * than a list with 12 elements).
	 * 
	 * @param st the stack to be reversed
	 */
	public static <T> void reverseStack(Stack<T> st){
		Queue<T> q = new Queue<T>(st.size()+1);
		
		while(!st.isEmpty()) {
		//Will ensure that every element will be transfered to the queue and prevent empty list errors.
			q.enqueue(st.pop());
			//Moving the values in the stack to the queue q, the elements will be placed into the queue in a reverse order.
		}

		while(!q.isEmpty()) {
		//Will ensure that every element will be transfered to the stack and prevent empty list errors.
			st.push(q.dequeue());
			//Move the values back into the now empty stack but this time they are in a reversed order.
			}
		
		
	}
	
	
	
	
}
