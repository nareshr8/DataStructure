package in.nrsh.stack.type;

import in.nrsh.stack.Stack;

import java.util.Arrays;
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
public class ArrayStack<E> implements Stack<E> {

    private static final int INITIAL_SIZE = 10;

    private int capacity =INITIAL_SIZE;
    private E[] stack;

    private int size;

    public ArrayStack(){
        size=0;
    }
    @Override
    public void push(E e) {
        ensureCapacity();
        stack[size] = e;

    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        size--;
        return stack[size];
    }

    @Override
    public E peek() {
        return stack[size];
    }

    @Override
    public int capacity() {
        return capacity;
    }

    @Override
    public int capacityRemaining() {
        return capacity-size;
    }

    @Override
    public void empty() {
        size=0;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    private void ensureCapacity() {
        if (size == 0)
            stack= (E[]) new Object[INITIAL_SIZE];
        else if (size == stack.length) {
            grow();
        }
    }

    private void grow() {
        stack = Arrays.copyOf(stack, (size + (size >> 1)));
    }
}
