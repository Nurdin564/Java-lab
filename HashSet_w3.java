import java.util.*;

public class HashSet_w3 {
    public static void main(String[] args) {
        //Write a Java program to clone a hash set to another hash set.
        HashSet<String> arr = new HashSet<>(Arrays.asList("Red", "Green", "Black", "White", "Pink", "Yellow"));
        HashSet<String> arr1 = new HashSet<>(arr);
        System.out.println(arr1);


        //Write a Java program to convert a hash set to an array.
        HashSet<String> arr2 = new HashSet<>(Arrays.asList("Red", "Green", "Black", "White", "Pink", "Yellow"));
        String[] arr3 = arr2.toArray(new String[arr2.size()]);
        System.out.println(Arrays.toString(arr3));

        for (String i : arr3){
            System.out.println(i);
        }


        //Write a Java program to convert a hash set to a tree set.
        HashSet<String> arr4 = new HashSet<>(Arrays.asList("Red", "Green", "Black", "White", "Pink", "Yellow"));
        Set<String> tree_set = new TreeSet<>(arr4);
        System.out.println(tree_set);


        //Write a Java program to convert a hash set to a List/ArrayList.
        HashSet<String> arr5 = new HashSet<>(Arrays.asList("Red", "Green", "Black", "White", "Pink", "Yellow"));
        List<String> arr6 = new ArrayList<>(arr5);
        System.out.println(arr6);


        //Write a Java program to compare two hash sets.
        HashSet<String> arr7 = new HashSet<>(Arrays.asList("Red", "Green", "Black", "White", "Pink", "Yellow"));
        HashSet<String> arr8 = new HashSet<>(Arrays.asList("Red", "Green", "Black", "White", "Pink", "Yellow"));
        System.out.println(arr7.equals(arr8));

        for (String i : arr7){
            System.out.println(arr8.contains(i) ? "Yes" : "No");
        }


        //Write a Java program to compare two sets and retain elements that are yhe same.
        HashSet<String> arr9 = new HashSet<>(Arrays.asList("Red", "Green", "Pink", "Yellow"));
        HashSet<String> arr10 = new HashSet<>(Arrays.asList("Red", "Green", "Black", "White"));
        arr9.retainAll(arr10);
        System.out.println(arr9);



    }
}
