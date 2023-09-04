package stack.and.queue;

import org.junit.jupiter.api.Test;
import stack.and.queue.queue.PseudoQueue;

import static org.junit.jupiter.api.Assertions.*;

public class PseudoQueueTest {
    @Test
    public void enqueueIntoQueue_And_ReturnValues() throws Exception {
        PseudoQueue<Integer> queue = new PseudoQueue<>();
        assertTrue(queue.isEmpty());

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertFalse(queue.isEmpty());
        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertEquals(3, queue.dequeue());

        assertTrue(queue.isEmpty());
    }





}
