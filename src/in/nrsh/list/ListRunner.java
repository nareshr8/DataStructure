package in.nrsh.list;

import in.nrsh.list.type.ArrayList;
import in.nrsh.list.type.LinearLinkedList;

/**
 * Sample running class
 */
public class ListRunner {

    public static void main(String[] args) {
        List<String> sampleList = new LinearLinkedList<>();
        sampleList.add("This");
        sampleList.add("is");
        sampleList.add("Sample");
        System.out.println(sampleList);
        sampleList.remove(1);
        System.out.println("Now the value is "+sampleList.get(1));
    }
}
