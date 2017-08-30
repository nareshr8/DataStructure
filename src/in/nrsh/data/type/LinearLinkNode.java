package in.nrsh.data.type;

/**
 * The Linear Linked Node is a node that contains data and a pointer to the next node.
 * @param <E> The data type of the data
 */
public class LinearLinkNode<E> {

    E data;

    LinearLinkNode<E> next;

    public LinearLinkNode(E data){
        this.data=data;
    }

    public E getData() {
        return data;
    }

    public void setNext(LinearLinkNode<E> next) {
        this.next = next;
    }

    public LinearLinkNode<E> getNext() {
        return next;
    }
}
