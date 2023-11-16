import java.util.ArrayList;
import java.util.Arrays;

public class ArToAl {
    public static void main(String[] args) {

        //In this program array -> ArrayList
        String[] arr = {"Audi", "BMW", "FERRARI", "ROLLS ROYCE"};

        ArrayList al = new ArrayList(Arrays.asList(arr)); // Within this parameter we have to specifiy the arr whcih we need to covert as ArrayList

        System.out.println(al);
        for (String value: arr) {
            System.out.print(value+" ");
        }
    }
}
