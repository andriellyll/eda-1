
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentQueueTest {

	public Queue<Integer> queue1;
	public Queue<Integer> queue2;
	public Queue<Integer> queue3;

	@Before
	public void setUp() throws QueueOverflowException {

		getImplementations();

		// Fila com 3 elementos não cheia.
		queue1.enqueue(1);
		queue1.enqueue(2);
		queue1.enqueue(3);

		// Fila com 2 elementos de tamanho 2. Fila cheia.
		queue2.enqueue(1);
		queue2.enqueue(2);

	}

	private void getImplementations() {
		// TODO O aluno deve ajustar aqui para instanciar sua implementação
		queue1 = new QueueUsingStack<Integer>(4);
		queue2 = new QueueUsingStack<Integer>(2);
		queue3 = new QueueUsingStack<Integer>(1);
	}

	// MÉTODOS DE TESTE
	@Test
	public void testHead() {
		assertEquals(Integer.valueOf(1), queue1.head());
		assertEquals(Integer.valueOf(1), queue2.head());
	}

	@Test
	public void testIsEmpty() {
		assertFalse(queue1.isEmpty());
		assertTrue(queue3.isEmpty());
	}

	@Test
	public void testIsFull() {
		assertFalse(queue1.isFull());
		assertTrue(queue2.isFull());
	}

	@Test
	public void testEnqueue() throws QueueOverflowException {
		queue1.enqueue(5);
		queue3.enqueue(5);
	}

	@Test(expected = QueueOverflowException.class)
	public void testEnqueueComErro() throws QueueOverflowException {
		queue1.enqueue(5); // vai depender do tamanho que a fila
		queue1.enqueue(5); // foi iniciada!!!
	}

	@Test
	public void testDequeue() {
		try {
			assertEquals(Integer.valueOf(1), queue1.dequeue());
			assertEquals(Integer.valueOf(2), queue1.dequeue());
		} catch (QueueUnderflowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(expected = QueueUnderflowException.class)
	public void testDequeueComErro() throws QueueUnderflowException {
		assertEquals(Integer.valueOf(1), queue1.dequeue()); // vai depender do
		assertEquals(Integer.valueOf(2), queue1.dequeue());												// tamanho que a fial
		assertEquals(Integer.valueOf(3), queue1.dequeue());												// tamanho que a fial
		assertEquals(Integer.valueOf(3), queue1.dequeue());												// foi iniciada!!!
	}
}
