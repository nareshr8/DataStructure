package in.nrsh.queue.stack;

import in.nrsh.data.type.LinearLinkNode;

import java.util.EmptyStackException;

/**
 * Linked list implementation of Queue.
 * <p>
 * Time Complexity Add and Delete: O(1)
 * Access: ON)
 * Space Complexity: O(1)
 *
 * @param <E> The actual data that is pushed and poped out.
 */
public class LinkedNodeQueue<E> implements Queue<E> {
    private LinearLinkNode<E> head;

    @Override
    public void push(E e) {
        if (head == null) {
            head = new LinearLinkNode<>(e);
        } else {
            LinearLinkNode<E> newHead = new LinearLinkNode<>(e);
            newHead.next = head;
            head = newHead;
        }
    }

    @Override
    public E pop() {
        E poped;
        if (head == null) {
            throw new EmptyStackException();
        } else if (head.next == null) {
            poped = head.data;
            head = null;
        } else if (head.next.next == null) {
            poped = head.next.data;
            head.next = null;
        } else {
            LinearLinkNode<E> linkedNode = head;
            while (linkedNode.next.next != null) {
                linkedNode = linkedNode.next;
            }
            poped = linkedNode.data;
        }
        return poped;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
