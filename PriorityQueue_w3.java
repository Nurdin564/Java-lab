
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueue_w3 {
    public static void main(String[] args) {
    // Write a Java program to count the number of elements in a priority queue.
    PriorityQueue<String> p = new PriorityQueue<>(Arrays.asList("Red", "Green", "Black", "Pink", "Orange"));
    System.out.println(p.size());


    //Write a Java program to compare two priority queues.
    PriorityQueue<String> p1 = new PriorityQueue<>(Arrays.asList("Red", "Green", "Black", "Orange"));
    PriorityQueue<String> p2 = new PriorityQueue<>(Arrays.asList("Green", "Black", "Pink", "Orange"));
    System.out.println(p1.equals(p2));

    for (String i : p1){
        System.out.println(p2.contains(i) ? "Yes" : "No");
    }


    //Write a Java program to retrieve the first element of the priority queue.
    PriorityQueue<Integer> pr = new PriorityQueue<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
    System.out.println(pr.peek());


    //Write a Java program to retrieve and remove the first element.
    PriorityQueue<Integer> pr1 = new PriorityQueue<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
    System.out.println(pr1.poll());


    //Write a Java program to convert a priority queue to an array containing all its elements.
    PriorityQueue<String> pt = new PriorityQueue<>(Arrays.asList("Red", "Green", "Black", "Orange"));
    List<String> pt1 = new ArrayList<>(pt);
    System.out.println(pt1);


    //Write a Java program to convert a Priority Queue element to string representations.
    PriorityQueue<String> pt3 = new PriorityQueue<>(Arrays.asList("Red", "Green", "Black", "Orange"));
    String s = pt3.toString();
    System.out.println(s);


    }
}
