package in.nrsh.list;

import java.util.Collection;

/**
 * Implementation of List Java API
 * @param <E> The Data type of items in the list
 */
public interface List<E> {

    boolean isEmpty();

    void add(E e);

    void add(int index,E e);

    void remove(int index);

    boolean isFull();

    int size();

    E get(int index);

}
