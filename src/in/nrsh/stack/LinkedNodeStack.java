package in.nrsh.stack;

import in.nrsh.data.type.LinearLinkNode;

import java.util.EmptyStackException;

/**
 * Linked list implementation of stack.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 *
 * @param <E> The actual data that is pushed and poped out.
 */
public class LinkedNodeStack<E> implements Stack<E> {
    LinearLinkNode<E> head;

    @Override
    public void push(E e) {
        if (head == null) {
            head = new LinearLinkNode<E>(e);
        } else {
            LinearLinkNode<E> newHead = new LinearLinkNode<E>(e);
            newHead.next = head;
            head = newHead;
        }
    }

    @Override
    public E pop() {
        if (head == null) {
            throw new EmptyStackException();
        }
        E poped = head.data;
        head = head.next;
        return poped;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
