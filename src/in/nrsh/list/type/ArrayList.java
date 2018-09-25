package in.nrsh.list.type;

import in.nrsh.list.List;

import java.util.Arrays;

/**
 * In ArrayList implemntation Our Big O notation is as follows:
 * <p>
 * Access - O(1)
 * Insert - O(N)
 * Remove - O(N)
 * Add    - O(N) - Add takes constant time as, when array is full, it needs to copy all the N items to the new array.
 */
public class ArrayList<E> implements List<E> {

    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public ArrayList() {
        elements = new Object[]{};
    }

    /**
     * Check if the list is empty
     *
     * @return true if the list is empty
     * false if the list has values
     */
    @Override
    public boolean isEmpty() {
        return elements.length == 0;
    }

    /**
     * Add an element at the last of the index
     *
     * @param e thee actual elemt to be added
     */
    @Override
    public void add(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    private void ensureCapacity() {
        if (size == 0)
            elements = new Object[DEFAULT_CAPACITY];
        else if (size == elements.length) {
            grow();
        }
    }

    private void grow() {
        elements = Arrays.copyOf(elements, (size + (size >> 1)));
    }

    /**
     * Add an element to the index
     *
     * @param index The actual index position on which the element should be added
     * @param e     the actual elemt to be added
     */
    @Override
    public void add(int index, E e) {
        if (size == elements.length) {
            grow();
        }
        for (int i = size; i <= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = e;
        size++;
    }

    /**
     * Method to remove the element from the index
     *
     * @param index the position from which we must remove the object
     */
    @Override
    public void remove(int index) {
        if (index < 0 || index > size)
            throw new ArrayIndexOutOfBoundsException("Invalid index " + index + " when array has " + size + " elements");
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }

    /**
     * This is dynamically growing. So the List must never be considered full
     *
     * @return false as the list is always growing
     */
    @Override
    public boolean isFull() {
        return false;
    }

    /**
     * Get actual size of the  list
     *
     * @return the actual size of the list
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Mthod to retrieve the actual size of the list
     *
     * @param index the position to look for
     * @return The actual index
     */
    @Override
    public E get(int index) {
        if (index > 0 && index < size)
            return (E) elements[index];
        else
            throw new ArrayIndexOutOfBoundsException("Invalid index " + index + " when array has " + size + " elements");
    }

    @Override
    public String toString() {
        StringBuilder simpleStringBuilder = new StringBuilder();
        simpleStringBuilder.append("(");
        boolean isFirst = true;
        for (Object object : elements) {
            if (object != null) {
                if (!isFirst)
                    simpleStringBuilder.append(",");
                simpleStringBuilder.append((E) object);
                isFirst = false;
            }
        }
        simpleStringBuilder.append(")");
        return simpleStringBuilder.toString();
    }
}
