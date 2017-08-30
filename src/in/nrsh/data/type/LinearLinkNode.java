package in.nrsh.data.type;

/**
 * The Linear Linked Node is a node that contains data and a pointer to the next node.
 * @param <E> The data type of the data
 */
public class LinearLinkNode<E> {

    public E data;

    public LinearLinkNode<E> next;

    public LinearLinkNode(E data){
        this.data=data;
    }

}
