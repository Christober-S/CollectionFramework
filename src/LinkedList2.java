import java.util.Collections;
import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("Hello World");
        ll.add("Welcome");
        ll.add("Christober");
        ll.add("Java");
        ll.add("Cloud");

        LinkedList ll2 = new LinkedList();

        //addAll() method
        ll2.addAll(ll);
        System.out.println(ll2);

        //removeAll() method
        ll2.removeAll(ll);
        System.out.println(ll2);

        //Sort() method
        Collections.sort(ll);
        System.out.println(ll);

        //shuffle method
        Collections.shuffle(ll);
        System.out.println(ll);

        //ReverseOrder
        Collections.sort(ll, Collections.reverseOrder());
        System.out.println(ll);
    }
}
