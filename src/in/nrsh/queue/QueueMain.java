package in.nrsh.queue;

import in.nrsh.exception.EmptyQueueException;
import in.nrsh.exception.QueueOverflowException;
import in.nrsh.queue.type.LinkedNodeQueue;

/**
 * Class to test Queue
 */
public class QueueMain {

    public static void main(String[] args) throws QueueOverflowException, EmptyQueueException {
        Queue<String> sampleQueue=new LinkedNodeQueue<>();
        System.out.println("Empty? "+sampleQueue.isEmpty());
        sampleQueue.enqueue("Sample");
        sampleQueue.enqueue("value");
        System.out.println("Deleting : "+sampleQueue.dequeue());
    }
}
