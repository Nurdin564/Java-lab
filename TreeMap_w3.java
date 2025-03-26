import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap_w3 {
    public static void main(String[] args) {
        //Write a Java program to get a NavigableSet view of keys in a map.
        TreeMap < Integer, String > tree_map1 = new TreeMap < Integer, String > ();
        tree_map1.put(20, "Green");
        tree_map1.put(40, "Black");
        tree_map1.put(50, "White");
        tree_map1.put(60, "Pink");
        System.out.println(tree_map1.navigableKeySet());


        //Write a Java program to remove and get a key-value mapping associated with the least key in a map.
        TreeMap < Integer, String > tree_map = new TreeMap < Integer, String > ();
        tree_map.put(10, "Red");
        tree_map.put(20, "Green");
        tree_map.put(40, "Black");
        tree_map.put(50, "White");
        tree_map.put(60, "Pink");
        System.out.println(tree_map.pollFirstEntry());


        //Write a Java program to remove and get a key-value mapping associated with the greatest key in this map.
        TreeMap < Integer, String > tree_map2 = new TreeMap < Integer, String > ();
        tree_map2.put(10, "Red");
        tree_map2.put(20, "Green");
        tree_map2.put(40, "Black");
        tree_map2.put(50, "White");
        tree_map2.put(60, "Pink");
        System.out.println(tree_map2.pollLastEntry());


        //Write a Java program to get the portion of a map whose keys range from a given key (inclusive) to another key (exclusive).
        TreeMap < Integer, String > tree_map3 = new TreeMap < Integer, String > ();
        SortedMap < Integer, String > sub_tree_map = new TreeMap < Integer, String > ();
        tree_map.put(10, "Red");
        tree_map.put(20, "Green");
        tree_map.put(30, "Black");
        tree_map.put(40, "White");
        tree_map.put(50, "Pink");
        sub_tree_map = tree_map.subMap(20, 40);
        System.out.println(sub_tree_map);


        //Write a Java program to get the portion of a map whose keys range from a given key to another key.
        TreeMap < Integer, String > tree_map4 = new TreeMap < Integer, String > ();
        SortedMap < Integer, String > sub_tree_map4 = new TreeMap < Integer, String > ();
        tree_map4.put(10, "Red");
        tree_map4.put(20, "Green");
        tree_map4.put(30, "Black");
        tree_map4.put(40, "White");
        tree_map4.put(50, "Pink");
        sub_tree_map4 = tree_map4.subMap(20, true, 40, true);
        System.out.println(sub_tree_map4);


        //Write a Java program to get a portion of a map whose keys are greater than or equal to a given key.
        TreeMap < Integer, String > tree_map5 = new TreeMap < Integer, String > ();
        tree_map5.put(10, "Red");
        tree_map5.put(20, "Green");
        tree_map5.put(30, "Black");
        tree_map5.put(40, "White");
        tree_map5.put(50, "Pink");
        System.out.println(tree_map.tailMap(20));

    }
}
