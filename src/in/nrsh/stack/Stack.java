package in.nrsh.stack;

/**
 * Created by Naresh on 29-08-2017.
 */
public interface Stack<E> {

    public void push(E e);

    public E pop();

    public boolean isEmpty();
}
