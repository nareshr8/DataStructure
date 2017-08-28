package in.nrsh.list.type;

import in.nrsh.list.List;

import java.util.Arrays;

/**
 * Created by Naresh on 27-08-2017.
 */
public class ArrayList<E> implements List<E> {

    private int size = 0;
    private static final int DEFAULT_CAPACITY = 2;
    private Object elements[];

    public ArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    /**
     * Check if the list is empty
     * @return true if the list is empty
     *         false if the list has values
     */
    @Override
    public boolean isEmpty() {
        return elements.length == 0;
    }

    /**
     * Add an element at the last of the index
     * @param e thee actual elemt to be added
     */
    @Override
    public void add(E e) {
        if (size == elements.length) {
            expandArray();
        }
        elements[size++] = e;
    }

    private void expandArray() {
        elements = Arrays.copyOf(elements, size * 2);
    }

    /**
     * Add an element to the index
     * @param index The actual index position on which the element should be added
     * @param e the actual elemt to be added
     */
    @Override
    public void add(int index, E e) {
        if (size == elements.length) {
            expandArray();
        }
        for (int i = size; i <= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = e;
        size++;
    }

    /**
     * Method to remove the element from the index
     * @param e the actual object to remove
     */
    @Override
    public void remove(E e) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (found) {
                if (i != size - 1) {
                    elements[i] = elements[i + 1];
                }
            } else {
                if(elements[i].equals(e)){
                    found=true;
                    i--;
                }
            }
        }
        size--;
    }

    /**
     * This is dynamically growing. So the List must never be considered full
     * @return false as the list is always growing
     */
    @Override
    public boolean isFull() {
        return false;
    }

    /**
     * Get actual size of the  list
     * @return the actual size of the list
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Mthod to retrieve the actual size of the list
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
}
