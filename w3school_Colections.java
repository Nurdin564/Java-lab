import java.util.*;
public class w3school_Colections {
    public static void main(String[] args) {
        /* Write a Java program to sort a given array list. */
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("Red");
        arr1.add("Green");
        arr1.add("Black");
        arr1.add("White");
        arr1.add("Pink");
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("Red");
        arr2.add("Green");
        arr2.add("Black");
        arr2.add("Pink");
        arr1.addAll(arr2);
        System.out.println(arr1);

//        Write a Java program to clone an array list to another array list.
        ArrayList<String> arr3 = new ArrayList<>(Arrays.asList("Red", "Green", "Black", "White", "Pink"));
        System.out.println(arr3);
        ArrayList<String> arr4 = (ArrayList<String>) arr3.clone();
        System.out.println(arr4);

        ArrayList<String> arr5 = new ArrayList<>(arr3);
        System.out.println(arr5);


//        Write a Java program to test whether an array list is empty or not.
        ArrayList<String> arr6 = new ArrayList<>(Arrays.asList("Red", "Green", "Black", "White", "Pink"));
        System.out.println(arr6);
        System.out.println(arr6.isEmpty());
        arr6.removeAll(arr6);
        System.out.println(arr6);
        System.out.println(arr6.isEmpty());


//        Write a Java program for trimming the capacity of an array list.
        ArrayList<String> arr7 = new ArrayList<>(Arrays.asList("Red", "Green", "Black", "White", "Pink"));
        arr7.trimToSize();
        System.out.println(arr7);


//        Write a Java program to increase an array list size.
        ArrayList<String> arr8 = new ArrayList<>(Arrays.asList("Red", "Green", "Black"));
        arr8.ensureCapacity(6);
        arr8.add("White");
        arr8.add("Pink");
        arr8.add("Yellow");
        System.out.println(arr8);


//        Write a Java program to replace the second element of an ArrayList with the specified element.
        ArrayList<String> arr9 = new ArrayList<>(Arrays.asList("Red", "Green"));
        String NewColor = "White";
        arr9.set(1, NewColor);
        System.out.println(arr9);

    }
}


