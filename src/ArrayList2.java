import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        //Created arrayList and added new values
        al.add(9);
        al.add(5);
        al.add(19);
        al.add(2);
        al.add(1);
        al.add(20);
        al.add(4);

        //printing values of arraylist
        System.out.println(al);

        //Created new arrayList
        ArrayList al2 = new ArrayList<>();
        al2.addAll(al);

        System.out.println(al2);

    }
}
