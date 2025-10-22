class LinkedListException extends RuntimeException{    
	public LinkedListException(String err) {
		super(err);
	}
}

public class DLinkedList {

	private class Node {
		private Object value;
		private Node nextNode;
		private Node prevNode;

		public Node(Object v) {
			value = v;
			nextNode = null;
			prevNode = null;
		}

		public Object getValue() {
			return value;
		}

		public void setValue(Object v) {
			value = v;
		}
		
		public Node getNextNode() {
			return nextNode;
		}

		public void setNextNode(Node n) {
			nextNode = n;
		}
		
		public Node getPrevNode() {
			return prevNode;
		}

		public void setPrevNode(Node n) {
			prevNode = n;
		}
	
	}

	// Holds a reference to the head and tail of the list
	private Node headNode;
	private Node tailNode;

	public DLinkedList() {
		headNode = null;
		tailNode = null;
	}
	
	public Object getHeadValue(){
		if (headNode == null)
			return null;
		return headNode.value;
	}
	
	public Object getTailValue(){
		if (tailNode == null)
			return null;
		return tailNode.value;
	}
	
	public void addAtHead(Object o) {
		Node newNode = new Node(o); 
		newNode.setNextNode(headNode); 
		if (headNode != null)
			headNode.setPrevNode(newNode);
		headNode = newNode; 
		// special case for empty list
		if (tailNode == null)
			tailNode = newNode;
	}

	public void addAtTail(Object o) {
		Node newNode = new Node(o);
		// this means that headNode == null too!
		if(tailNode == null){
			tailNode = newNode;
			headNode = newNode;
		}else{
			newNode.setPrevNode(tailNode);
			tailNode.setNextNode(newNode);
			tailNode = newNode;
		}
	}
		
	public Object removeAtHead() throws LinkedListException {
		// list is empty 
		if(headNode == null){
			throw new LinkedListException("List is empty");
		}
		// singleton: must update tailnode too
		if(headNode == tailNode){
			Object res = headNode.getValue();
			headNode = null;
			tailNode = null;
			return res;
		}
		
		Object res = headNode.getValue();
		headNode = headNode.getNextNode();
		headNode.setPrevNode(null);
		return res;
	}

	public Object removeAtTail() throws LinkedListException {
		// list is empty 
		if(tailNode == null){
			throw new LinkedListException("List is empty");
		}
		// singleton: must update tailnode too
		if(headNode == tailNode){
			Object res = tailNode.getValue();
			headNode = null;
			tailNode = null;
			return res;
		}
		Object res = tailNode.getValue();
		tailNode = tailNode.getPrevNode();
		tailNode.setNextNode(null);
		return res;
	}

	/**
	 * @param idx the index position of the value
	 * @return the value in the list at a given index
	 */
	public Object get(int idx) {
		Object value = null;
		int i = 0;
		Node n = headNode;
		while (i <= idx) {
			if (n == null) {
				return -1;
			}
			else {
				value = n.getValue();
				n = n.getNextNode();
				i++;
			}
		}
		return value;
	}

	
	// Part 4: complete
	public void reverse(){
		
		Node currentNode = headNode;
		//Creating a new node which will represent the current Node and will be used to go through and reverse the list.
		Node tempNode = null;
		//Creating a temp value to briefly store data later.
		Node tempHeadNode = headNode;
		//Creating a temp value to briefly store the headNode.
		
		while(currentNode != null) {
			//While loop will repeat until every node in the list has been reversed.
			tempNode = currentNode.prevNode;
			//The temp value will be used to briefly hold the value of the previous node from the current node. 
			currentNode.prevNode = currentNode.nextNode;
			//Changing the previous node of the current node to the next node from the current node.
			currentNode.nextNode = tempNode;
			//Using the temp value to change the next node from the current node to the previous node of the current node before the value changed.
			
			currentNode = currentNode.prevNode;
			//Is used to go to the next node in the list.
			
		}
		
		if (tempNode != null) {
			//Checks if the list is not empty.
			headNode = tailNode;
			tailNode = tempHeadNode;
			//Since the list is reversed we need to swap the head and the tail around.
		}
		
		
	}	

}


