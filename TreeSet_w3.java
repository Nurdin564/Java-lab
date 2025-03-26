import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

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
        TreeSet<Integer> t1 = new TreeSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        TreeSet<Integer> t2 = new TreeSet<>(t1.headSet(7, false));
        System.out.println(t2);


        //Write a Java program to get the element in a tree set which is greater than or equal to the given element.
        TreeSet<Integer> t3 = new TreeSet<>(Arrays.asList(1,2,3,5,6,7,8,9));
        System.out.println(t3.ceiling(4));


        //Write a Java program to get the element in a tree set less than or equal to the given element.
        TreeSet<Integer> t4 = new TreeSet<>(Arrays.asList(1,2,3,5,6,7,8,9));
        System.out.println(t4.floor(4));


        //Write a Java program to get the element in a tree set strictly greater than or equal to the given element.
        TreeSet<Integer> t5 = new TreeSet<>(Arrays.asList(1,2,3,5,6,7,8,9));
        System.out.println(t5.higher(4));


        //Write a Java program to get an element in a tree set that has a lower value than the given element.
        TreeSet<Integer> t6 = new TreeSet<>(Arrays.asList(1,2,3,5,6,7,8,9));
        System.out.println(t6.lower(4));
    }
}
