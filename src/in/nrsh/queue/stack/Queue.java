package in.nrsh.queue.stack;

/**
 * Interface of Queue to be implemented
 * @param <E>
 */
public interface Queue<E> {

    void push(E e);

    E pop();

    boolean isEmpty();
}
