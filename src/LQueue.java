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
	 * O(?)
	 * 
	 * Because: TODO
	 */
	public boolean isEmpty(){
		return false; // dummy value
	}
	
	// Part 3: complete
	/**
	 * Returns how many elements are in the queue.
	 * 
	 * TODO Where N is the number of elements in the queue the complexity is:
	 *
	 * O(?)
	 * 
	 * Because: TODO
	 */
	public int size(){
		return -1; // dummy value 
	}
	
	// Part 3: complete
	/**
	 * Adds a new element to the end of the queue.
	 * 
	 * TODO Where N is the number of elements in the queue the complexity is:
	 *
	 * O(?)
	 * 
	 * Because: TODO
	 */
	public void enqueue(Object o) {

	}
	
	// Part 3: complete	
	/**
	 * Removes the element at the front of the queue.
	 * 
	 * TODO Where N is the number of elements in the queue the complexity is:
	 *
	 * O(?)
	 * 
	 * Because: TODO
	 */
	public Object dequeue() throws QueueException{
		return null; // dummy value
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
		return null; // dummy value
	}
	
}
