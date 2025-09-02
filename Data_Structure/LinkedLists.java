package Data_Structure;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLists {

    public static void main(String[] args) {
//        LinkedList<String> linkedList = new LinkedList<String>();
//        linkedList.add("Hello");
//        linkedList.add("World");
//        linkedList.addFirst("First");
//        linkedList.addLast("Last");
//        linkedList.add(2, "Middle");
//        linkedList.add(3, "Middle2");
//
//        Iterator it = linkedList.iterator();
//
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }

//        System.out.println(linkedList.get(0) + " " + linkedList.get(1));
//        System.out.println(linkedList.get(2) + " " + linkedList.get(3));
//        System.out.println(linkedList.get(4) + " " + linkedList.get(5));
//        System.out.println(linkedList.getFirst() + " " + linkedList.getLast());
//        System.out.println(linkedList.size());
//        System.out.println(linkedList.contains("Hello"));
//        System.out.println(linkedList.contains("Hello2"));
//        System.out.println(linkedList.indexOf("Hello"));
//        System.out.println(linkedList.indexOf("Hello2"));
//        System.out.println(linkedList.removeFirst());
//        System.out.println(linkedList.removeLast());
//        System.out.println(linkedList.remove(2));
//        System.out.println(linkedList.remove("Hello"));
//        System.out.println(linkedList.size());
//        System.out.println(linkedList.contains("Hello"));
//        System.out.println(linkedList.contains("Hello2"));
//        System.out.println(linkedList.indexOf("Hello"));

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Hello");
        linkedList.add("World");
        linkedList.add("Hello");
        linkedList.add("World");
        linkedList.offer("what");
        linkedList.removeFirstOccurrence("Hello");

        Iterator it = linkedList.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("--------------------");
        System.out.println(linkedList.peek());
        System.out.println(linkedList.poll());
        System.out.println(linkedList.poll());
        System.out.println(linkedList.poll());
        System.out.println(linkedList.poll());

        System.out.println(linkedList.isEmpty());

    }
}
