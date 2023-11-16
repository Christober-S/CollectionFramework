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
    }
}
