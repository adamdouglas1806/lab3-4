import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LQueueTest {

	LQueue q;
	@Before
	public void setup()
	{
		q = new LQueue();
	}
	
	/*
	 * 2: complete the following test methods as specified. 
	 */
	
	@Test
	public void testIsEmpty() {
		// test that q.isEmpty returns true
		assertTrue("The queue is empty", q.isEmpty());
		//The expected return is true and the line of code checks if the queue is empty by calling q.isEmpty.
	}
	
	@Test
	public void testIsEmptyFalse() {
		// add an element to the queue "q"
		q.enqueue("A");
		// adds the value A to the queue.
		
		// then test that q is not an empty queue.
		assertFalse("The queue is not empty", q.isEmpty());
		//The expected return is false and the line of code checks if the queue is not empty by calling q.isEmpty.
	}

	@Test
	public void testSizeEmpty() {
		// test the size of an empty queue is 0
		assertEquals("The size of the queue is 0", 0, q.size());
		//Expected result is 0 and it checks what the size of the queue q is with q.size().
	}
	
	@Test
	public void testSizeNonEmpty() {
		// add an element(s) to the queue
		q.enqueue("A");
		// adds the value A to the queue.
		q.enqueue("B");
		// adds the value B to the queue.

		// then test the size of the queue
		assertEquals("The size of the queue is 2", 2, q.size());
		//Expected result is 2 and it checks what the size of the queue q is with q.size().
	}

	@Test
	public void testEnqueue() {
		// enqueue an element(s) to the queue
		q.enqueue("A");
		// adds the value A to the queue.
		q.enqueue("B");
		// adds the value B to the queue.
		
		// then test that the correct element is at the front
		assertEquals("A is at the front of the queue", "A", q.front());
		//Expected result is A and it checks for the value at the front of the queue.
	}
	
	@Test
	public void testDequeue() {
		// enqueue multiple elements to the queue
		q.enqueue("A");
		// adds the value A to the queue.
		q.enqueue("B");
		// adds the value B to the queue.
		q.enqueue("C");
		// adds the value C to the queue.

		// then check that they are returned in the
		// correct order with dequeue.
		assertEquals("A was at the front of the queue", "A", q.dequeue());
		//Expected result is A and it checks for the value that was just dequeued.
		assertEquals("B was at the front of the queue", "B", q.dequeue());
		//Expected result is B and it checks for the value that was just dequeued.
		assertEquals("C was at the front of the queue", "C", q.dequeue());
		//Expected result is C and it checks for the value that was just dequeued.
	}
	
	@Test(expected = QueueException.class)  
	public void testEmptyDequeue() throws Exception {  
		// try to dequeue an empty queue
		q.dequeue();
		// This line of code will try to dequeue from an empty queue.
		throw new Exception("QueueException");
		// QueueException is thrown to prevent any errors when trying to dequeue from an empty queue.
	}
	
	@Test(expected = QueueException.class)  
	public void testEmptyFront() throws Exception {
		// try to get the front value of an empty queue
		q.front();
		// This line of code will try to get the front value of an empty queue.
		throw new Exception("QueueException");
		// QueueException is thrown to prevent any errors when trying to get the front value from an empty queue.
	}
}
