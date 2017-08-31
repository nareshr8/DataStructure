package in.nrsh.queue.stack;

/**
 * Class to test Queue
 */
public class QueueMain {

    public static void main(String[] args) {
        Queue<String> sampleQueue=new LinkedNodeQueue<>();
        System.out.println("Empty? "+sampleQueue.isEmpty());
        sampleQueue.push("Sample");
        sampleQueue.push("value");
        System.out.println("Deleting : "+sampleQueue.pop());
    }
}
