import java.util.*;

public class TreeSet_w3 {
    public static void main(String[] args) {
        //Create a reverse order view of the elements contained in a given tree set.
        TreeSet<String> t = new TreeSet<>(Arrays.asList("Red", "Green", "Black", "Pink", "Orange"));
        System.out.println(t.descendingSet());

        Iterator<String> it = t.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


        //Find numbers less than 7 in a tree set.



    }
}
