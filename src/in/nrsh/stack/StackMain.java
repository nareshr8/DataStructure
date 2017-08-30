package in.nrsh.stack;

/**
 * Created by Naresh on 29-08-2017.
 */
public class StackMain {

    public static void main(String[] args) {
        Stack<String> sampleStack=new LinkedNodeStack<String>();
        System.out.println("Empty? "+sampleStack.isEmpty());
        sampleStack.push("Sample");
        sampleStack.push("value");
        System.out.println("Deleting : "+sampleStack.pop());
    }
}
