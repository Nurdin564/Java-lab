import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_w3 {
    public static void main(String[] args) {
        //Write a Java program to remove and return the first element of a linked list.
        LinkedList <String> arr1 = new LinkedList<>(Arrays.asList("Red", "Green", "Black", "White", "Pink"));
        arr1.pop();
        System.out.println(arr1);


        //Write a Java program to retrieve, but not remove, the first element of a linked list.
        LinkedList <String> arr2 = new LinkedList<>(Arrays.asList("Red", "Green", "Black", "White", "Pink"));
        System.out.println(arr2.get(0));

        String b = arr2.peekFirst();
        System.out.println(b);


        //Write a Java program to retrieve, but not remove, the last element of a linked list.
        LinkedList <String> arr3 = new LinkedList<>(Arrays.asList("Red", "Green", "Black", "White", "Pink"));
        System.out.println(arr3.getLast());

        String c = arr3.peekLast();
        System.out.println(c);


        //Write a Java program to check if a particular element exists in a linked list.
        LinkedList <String> arr4 = new LinkedList<>(Arrays.asList("Red", "Green", "Black", "White", "Pink"));
        System.out.println(arr4.contains("Red"));


        //Write a Java program to convert a linked list to an array list.
        LinkedList<String> ll = new LinkedList<>(Arrays.asList("Red", "Green", "Black", "White", "Pink"));
        List<String> list = new ArrayList<>(ll);
        System.out.println(list);


        //Write a Java program to compare two linked lists.
        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("Red", "Green", "Black"));
        LinkedList<String> ll2 = new LinkedList<>(Arrays.asList("Red", "Green", "Pink"));
        System.out.println(ll1.equals(ll2));

        LinkedList <String> ll3 = new LinkedList<>();
        for (String i : ll1){
            ll3.add(ll2.contains(i) ? "Yes" : "No");
        }
        System.out.println(ll3);

        for (String e : ll1){
            System.out.println(ll2.contains(e) ? "Yes" : "No");
        }

    }
}
