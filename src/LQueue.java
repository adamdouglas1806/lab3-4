/*
 * Queue implementation with a linked list.
 */
public class LQueue {
	
	private class Node{
		Object element;
		Node next;
		
		public Node(Object e, Node n){
			element = e;
			next = n;
		}
		
		public Node(Object e){
			element = e;
			next = null;
		}
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public LQueue(){
		head = null;
		tail = null;	
		size = 0;
	}
	
	/*
	 * Part 3: complete the following methods
	 */
	
	// Part 3: complete	
	/**
	 * Returns true if the queue is empty, false otherwise.
	 * 
	 * TODO Where N is the number of elements in the queue the complexity is:
	 *
	 * O(1)
	 * 
	 * Because: The code checks if head is equal to null. THis will take the same amount of time to calculate regardless of the length of the queue, therefore
	 * the notation is constant.
	 */
	public boolean isEmpty(){
		
		if (head != null) {
			//Checks if the head node is not pointing towards null/checks if there are any other nodes in the list.
			return false;
			//If there are other nodes false will be returned.
		}
			return true;
			//If there are no other nodes then true will be returned.
			
	}
	
	// Part 3: complete
	/**
	 * Returns how many elements are in the queue.
	 * 
	 * Where N is the number of elements in the queue the complexity is:
	 *
	 * O(N)
	 * 
	 * Because: If there are more elements in the queue then there will be more loop iterations and it will take longer to calculate the size of the queue.
	 */
	public int size(){
		
		Node currentNode = head;
		//Creating a new node called current node which will represent the current node.
		int size = 0;
		//Creating a int variable.
		
		while(currentNode != null) {
		//Loop which will continue to repeat until the current node reaches the end of the list/current node points towards null.
			currentNode = currentNode.next;
			//This line of code will make current the next node in the list.
			size++;
			//For every iteration 1 will be added to the size variable.
		}
		
		return size;
		//The number of elements in the queue is returned.
		
	}
	
	// Part 3: complete
	/**
	 * Adds a new element to the end of the queue.
	 * 
	 * Where N is the number of elements in the queue the complexity is:
	 *
	 * O(1)
	 * 
	 * Because: There is no need to traverse the entire queue to add a new element in the end, therefore it will take the same amount of time to enqueue this
	 * new node regardless of the amount of elements in the queue.
	 */
	public void enqueue(Object o) {
		
		Node newNode = new Node(o);
		//Creates the new node that will be added at the end of the queue.
		
		if (head == null) {
			//Checks if the queue is empty.
			head = newNode;
			tail = newNode;
			return;
			//If the queue is empty then the head and tail are set to point towards the new node and the program will then end at the return;.
		}
		
		tail.next = newNode;
		// Will add the node at the end of the queue.
		tail = newNode;
		// Will make tail point towards the new node.
	}
	
	// Part 3: complete	
	/**
	 * Removes the element at the front of the queue.
	 * 
	 * TODO Where N is the number of elements in the queue the complexity is:
	 *
	 * O(1)
	 * 
	 * Because: Since the value which is first is being affected there is no need to traverse the queue, meaning that no matter the size of the queue it will
	 * not affect the compile time.
	 */
	public Object dequeue() throws QueueException{
		
		if (head == null) {
			throw new QueueException("QueueException");
		}
		//The if statement will check if the queue is empty and if so then it will throw a QueueException to prevent any errors.
		
		Object dequeuedValue;
		//Creating a new object which will store the dequeued value.
		
		dequeuedValue = head.element;
		//Sets the dequeuedValue variable to the value at the head/front of the queue.
		
		head = head.next;
		//Sets the head to point to the next node in the queue.
		
		return dequeuedValue;
		//Returns the dequeued value which was originally first in the queue.
	}
	
	// Part 3: complete
	/**
	 * Returns the element at the front of the queue without removing it.
	 * 
	 * TODO Where N is the number of elements in the queue the complexity is:
	 *
	 * O(?)
	 * 
	 * Because: TODO
	 */
	public Object front() throws QueueException{
		
		if (head == null) {
			throw new QueueException("QueueException");
		}
		//The if statement will check if the queue is empty and if so then it will throw a QueueException to prevent any errors.
		
		Object frontValue;
		//Creating a new object which will store the dequeued value.
		
		frontValue = head.element;
		//Sets the frontValue variable to the value at the head/front of the queue.
		
		return frontValue;
		//Returns the value at the front of the queue.
	}
	
}
