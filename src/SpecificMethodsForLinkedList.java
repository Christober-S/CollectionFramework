import java.util.LinkedList;

public class SpecificMethodsForLinkedList {
    public static void main(String[] args) {

        //Special Methods used to implement stack and queue
        LinkedList l = new LinkedList();

        l.add("BMW");
        l.add("Audi");
        l.add("Rolls Royce");
        l.add("Buggati");

        System.out.println(l);

        //Adding element to the first
        l.addFirst("Benz");
        System.out.println("First value is added: "+l);

        //Adding element to the last
        l.addLast("Fortuner");
        System.out.println("Last value is added: "+l);

        //Getting first element
        System.out.println("Getting first element :"+l.getFirst());

        //Getting last element
        System.out.println("Getting last element :"+l.getLast());

        //Removing first element
        l.removeFirst();
        System.out.println("After removing first element: "+l);

        //Removing last element
        l.removeLast();
        System.out.println("After removing last element: "+l);
    }
}
