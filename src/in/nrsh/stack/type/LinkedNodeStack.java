package in.nrsh.stack.type;

import in.nrsh.data.type.LinearLinkNode;
import in.nrsh.stack.Stack;

import java.util.EmptyStackException;

/**
 * Linked list implementation of stack.
 *
 * Add and Delete Time Complexity: O(1)
 * Access Complexity: O(N)
 * Space Complexity: O(1)
 *
 * @param <E> The actual data that is pushed and poped out.
 */
public class LinkedNodeStack<E> implements Stack<E> {
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
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        E poped = head.data;
        head = head.next;
        return poped;
    }

    @Override
    public E peek() {
        return head.data;
    }

    @Override
    public int capacity() {
        return -1;
    }

    @Override
    public int capacityRemaining() {
        return -1;
    }

    @Override
    public void empty() {
        head=null;
    }

    @Override
    public boolean isEmpty() {
        return head==null;
    }
}
