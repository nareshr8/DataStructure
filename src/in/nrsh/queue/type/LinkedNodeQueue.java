package in.nrsh.queue.type;

import in.nrsh.data.type.LinearLinkNode;
import in.nrsh.queue.Queue;

import java.util.EmptyStackException;

/**
 * Linked list implementation of Queue.
 * <p>
 * Time Complexity Add and Delete: O(1)
 * Access: O(N)
 * Space Complexity: O(1)
 *
 * @param <E> The actual data that is pushed and poped out.
 */
public class LinkedNodeQueue<E> implements Queue<E> {
    private LinearLinkNode<E> head;
    private LinearLinkNode<E> tail;

    @Override
    public void enqueue(E e) {
        if (isEmpty()) {
            head = new LinearLinkNode<>(e);
            tail = head;
        } else {
            LinearLinkNode<E> newTail = new LinearLinkNode<>(e);
            tail.next = newTail;
            tail = newTail;
        }
    }

    @Override
    public E dequeue() {
        E poped;
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            poped=head.data;
            head = head.next;
        }
        return poped;
    }

    @Override
    public boolean isEmpty() {
        return head ==null;
    }

    @Override
    public boolean isFull() {
        return false;
    }
}
