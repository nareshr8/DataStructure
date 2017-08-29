package in.nrsh.list.type;

import in.nrsh.list.List;

/**
 * Linear Linked List is a implementation of list where the head node contains the data and has a pointer to the next node.
 * We always can traverse from head to tail. Not in other way.
 * Its Big O notation is as follows:
 * Access - O(N)
 * Insert - O(N)
 * Remove - O(N)
 * Add    - O(N) - Add takes constant time as, when array is full, it needs to copy all the N items to the new array.
 * @param <E>
 */
public class LinearLinkedList<E> implements List<E> {

    private LinearLinkNode<E> head;
    private int size = 0;

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void add(E e) {
        if (head == null) {
            head = new LinearLinkNode<>(e);
        } else {
            LinearLinkNode<E> currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = new LinearLinkNode<>(e);
            size++;
        }

    }

    @Override
    public void add(int index, E e) {
        LinearLinkNode<E> linkNode = head;
        if (head == null) {
            if (index == 0)
                head = new LinearLinkNode<>(e);
            else
                throw new IndexOutOfBoundsException("Requested for index " + index + " when item has only " + size + " items");
            return;
        }
        if (index == 0) {
            LinearLinkNode<E> linearLinkNode = new LinearLinkNode<>(e);
            linearLinkNode.next = head;
            head = linearLinkNode;
        }
        for (int i = 0; i < index - 1; i++) {
            linkNode = linkNode.next;
        }
        LinearLinkNode<E> linearLinkNode = new LinearLinkNode<>(e);
        linearLinkNode.next = linkNode.next;
        linkNode.next = linearLinkNode;
        size++;
    }

    @Override
    public void remove(int index) {
        LinearLinkNode<E> linkNode = head;
        if (head == null) {
            throw new IndexOutOfBoundsException("Requested for index " + index + " when item has only " + size + " items");
        }
        for (int i = 0; i < index - 1; i++) {
            if (linkNode.next == null)
                throw new IndexOutOfBoundsException("Requested for index " + index + " when item has only " + size + " items");
            linkNode = linkNode.next;
        }
        linkNode.next = linkNode.next.next;
        size--;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int index) {
        LinearLinkNode<E> linkNode = head;
        if (head == null) {
            throw new IndexOutOfBoundsException("Requested for index " + index + " when item has only " + size + " items");
        }
        for (int i = 0; i < index; i++) {
            if (linkNode.next == null)
                throw new IndexOutOfBoundsException("Requested for index " + index + " when item has only " + size + " items");
            linkNode = linkNode.next;
        }
        return linkNode.data;
    }

    @Override
    public String toString() {
        StringBuilder simpleStringBuilder = new StringBuilder();
        simpleStringBuilder.append("(");
        boolean isFirst = true;
        LinearLinkNode<E> linkNode = head;
        while (linkNode != null) {
            if (!isFirst)
                simpleStringBuilder.append(",");
            simpleStringBuilder.append(linkNode.data);
            linkNode=linkNode.next;
            isFirst = false;
        }
        simpleStringBuilder.append(")");
        return simpleStringBuilder.toString();
    }
}
