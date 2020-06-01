
import java.util.ArrayList;
import java.util.Collections;

public class CombiningArrayLists {

    public static void combine(ArrayList<Integer> first, ArrayList<Integer> second)
    {
        first.addAll(second);
    }

    public static void main(String[] args) {

        // You can change the values while testing
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 10, 11);
        // A shorthand for:
        // first.add(4);
        // first.add(3);


        Collections.addAll(list2, 5);
        // A shorthand for:
        // second.add(5);
        // second.add(10);
        // second.add(7);


        // Implement the following method and then remove the comment
        combine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);


    }
}
