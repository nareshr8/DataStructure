package in.nrsh.queue;

import in.nrsh.exception.EmptyQueueException;
import in.nrsh.exception.QueueOverflowException;

/**
 * Interface of Queue to be implemented
 * @param <E>
 */
public interface Queue<E> {

    void enqueue(E e) throws QueueOverflowException;

    E dequeue() throws EmptyQueueException;

    boolean isEmpty();

    boolean isFull();
}
