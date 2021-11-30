//Imports

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

//Wouldn't take import org.junit.jupiter.api.* for some reason, couldn't figure out why

class BoundedQueueTest{

//Fixtures and Pre-test method

private BoundedQueue queue;

//Post Test Teardown method

	@AfterEach
	void tearDown()
	{
		queue = null;
	}

//11 Tests

//Exception Tests
//Negative Capacity

	@Test
	void testForNegativeCapacity()
	{
		assertThrows(IllegalArgumentException.class, () -> new BoundedQueue(-1));
	}

//Null value enqueue

	@Test
	void testForNullEnqueue()
	{
		BoundedQueue queue = new BoundedQueue(2);
		assertThrows(NullPointerException.class, () -> queue.enQueue(null));
	}

//Enqueue on full queue

	@Test
	void testForFullQueue()
	{
		BoundedQueue queue = new BoundedQueue(1);
		queue.enQueue(3);
		assertThrows(IllegalStateException.class, () -> queue.enQueue(2));
	}

//Dequeue on empty queue

	@Test
	void testForEmptyQueue()
	{
		BoundedQueue queue = new BoundedQueue(1);
		assertThrows(IllegalStateException.class, () -> queue.deQueue());
	}

//Non-Exception Tests
//Enqueue

	@Test
	void testEnqueue()
	{
		BoundedQueue queue = new BoundedQueue(1);
		queue.enQueue(3);
		assertTrue(queue.isFull());
	}

//Double Enqueue

	@Test
	void testDoubleEnqueue()
	{
		BoundedQueue queue = new BoundedQueue(2);
		queue.enQueue(3);
		queue.enQueue(1);
		assertTrue(queue.isFull());
	}

//Dequeue

	@Test
	void testDequeue()
	{
		BoundedQueue queue = new BoundedQueue(1);
		queue.enQueue(3);
		queue.deQueue();
		assertTrue(queue.isEmpty());
	}

//Double Dequeue

	@Test
	void testDoubleDequeue()
	{
		BoundedQueue queue = new BoundedQueue(2);
		queue.enQueue(3);
		queue.enQueue(1);
		queue.deQueue();
		queue.deQueue();
		assertTrue(queue.isEmpty());
	}

//isEmpty

	@Test
	void testEmptyCheck()
	{
		BoundedQueue queue = new BoundedQueue(1);
		assertTrue(queue.isEmpty());
	}

//isFull

	@Test
	void testFullCheck()
	{
		BoundedQueue queue = new BoundedQueue(1);
		queue.enQueue(3);
		assertTrue(queue.isFull());
	}


//toString

	@Test
	void testStringTest()
	{
		BoundedQueue queue = new BoundedQueue(2);
		queue.enQueue(3);
		queue.enQueue(1);
		String actual = queue.toString();
		String expected = "[3, 1]";
		assertEquals(expected, actual);
	}
}