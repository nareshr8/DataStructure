package in.nrsh.stack;

/**
 * Created by Naresh on 29-08-2017.
 */
public interface Stack<E> {

    void push(E e);

    E pop();

    E peek();

    int capacity();

    int capacityRemaining();

    void empty();

    boolean isEmpty();
}
