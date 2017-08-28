package in.nrsh.list;

import java.util.Collection;

/**
 * Created by Naresh on 27-08-2017.
 */
public interface List<E> {

    public boolean isEmpty();

    public void add(E e);

    public void add(int index,E e);

    public void remove(E e);

    public boolean isFull();

    public int size();

    public E get(int index);

}
