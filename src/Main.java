import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {

        //ArrayList declaration and it can store hetrogeonus data's
        ArrayList al = new ArrayList();

        //To add values to the object add() method is used and it's in java.util package
        //adding elements to the object
        al.add(100);
        al.add("Hello World");
        al.add('C');
        al.add(true);
        al.add(28.9);

        //To know the size of object size method is used.
        System.out.println("The number of elements in the ArrayList: "+al.size());

        //To remove elements remove() method is used.
        al.remove(2); //here removing element with index
        al.remove(true); //here removing element with object
        System.out.println("After remove : "+al);

        //insert a new element in desired position
        //after inserting the values will be preserve
        //add(index, object)
        al.add(1, "Hey");
        System.out.println("After insertion : "+al);

        //To retreive specific element from object. get() method is used.
        //specifing index of element or target
        System.out.println(al.get(1));

        //To change element or replace. set() method is used.
        al.set(1, "Java");
        System.out.println("After Replacing : "+al);

        //To search element - contains() - Returns true / false
        System.out.println(al.contains("Java")); //return true
        System.out.println(al.contains("Python")); //return false

        //To know whether the object is empty. isEmpty() method is used.
        //It will return bool values
        System.out.println(al.isEmpty());


    }
}