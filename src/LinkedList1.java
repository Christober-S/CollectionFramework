import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
    public static  void main(String[] args) {

        //Declaration of LinkedList
        //LinkedList <Integer> ll = new LinkedList<Integer>();
        //List<String> ll = new LinkedList<String>(); //using root interface

        LinkedList ll = new LinkedList();
        ll.add(28);
        ll.add("HelloWorld");
        ll.add('A');
        ll.add(6.89);
        ll.add(true);
        ll.add(null); //In LinkedList null also supported

        System.out.println(ll);

        //There is no default size
        System.out.println(ll.size());

        //Removal of element
        ll.remove(3);
        System.out.println("LinkedList After Removal: "+ll);

        //Insert/Adding element in the middle of linkedList
        ll.add(3, 7.14);
        System.out.println("LinkedList after Insertion: "+ll);

        //Retriving of element
        System.out.println(ll.get(3));

        //Seting value replace
        ll.set(5, "Java");
        System.out.println("LinkedList after replacing value: "+ll);
    }
}
