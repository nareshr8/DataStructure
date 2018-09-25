package in.nrsh.queue.type;

import in.nrsh.exception.EmptyQueueException;
import in.nrsh.exception.QueueOverflowException;
import in.nrsh.queue.Queue;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Linked list implementation of queue.
 *
 * Add and Delete Time Complexity: O(1)
 * Access Complexity: O(N)
 * Space Complexity: O(1)
 *
 * @param <E> The actual data that is pushed and poped out.
 */
public class ArrayQueue<E> implements Queue<E> {

    private static final int TOTAL_SIZE = 10;

    private int capacity = TOTAL_SIZE;
    private E[] queue;

    private int head;

    private int tail;

    public ArrayQueue(){
        head = 0;
        tail = 0;
    }

    @Override
    public void enqueue(E e) throws QueueOverflowException {
        if(isFull())
            throw new QueueOverflowException();
        queue[tail] = e;

    }

    @Override
    public E dequeue() throws EmptyQueueException {
        if (isEmpty()) {
            throw new EmptyQueueException();
        }
        E val = queue[head];
        head = (head+1)%TOTAL_SIZE;
        return val;
    }

    @Override
    public boolean isEmpty() {
        return head==tail;
    }

    @Override
    public boolean isFull() {
        return ((tail + 1)% TOTAL_SIZE  == head);
    }


}
