package in.nrsh.list.type;

/**
 * The Linear Linked Node is a node that contains data and a pointer to the next node.
 * @param <E> The data type of the data
 */
class LinearLinkNode<E> {

    E data;

    LinearLinkNode<E> next;

    LinearLinkNode(E data){
        this.data=data;
    }

    public void setNext(LinearLinkNode<E> next) {
        this.next = next;
    }
}
