import java.util.HashMap;
import java.util.Set;

public class HashMap_w3 {
    public static void main(String[] args) {
        //Write a Java program to get a shallow copy of a HashMap instance.
        HashMap<Integer,String> hm= new HashMap<Integer,String>();  
        hm.put(1, "Red");
        hm.put(2, "Green");
        hm.put(3, "Black");
        hm.put(4, "White");
        hm.put(5, "Blue");
        HashMap<Integer,String> hm1 = new HashMap<Integer,String>();
        hm1 = (HashMap)hm.clone();
        System.out.println(hm1);


        //Write a Java program to test if a map contains a mapping for the specified key.
        HashMap < String, Integer > hash_map = new HashMap < String, Integer > ();
        hash_map.put("Red", 1);
        hash_map.put("Green", 2);
        hash_map.put("Black", 3);
        hash_map.put("White", 4);
        hash_map.put("Blue", 5);
        if (hash_map.containsKey("orange")) {
            System.out.println("yes" + hash_map.get("orange"));
        } else {
            System.out.println("no");
        }


        //Write a Java program to test if a map contains a mapping for the specified value.
        HashMap < String, Integer > hash_map1 = new HashMap < String, Integer > ();
        hash_map1.put("Red", 1);
        hash_map1.put("Green", 2);
        hash_map1.put("Black", 3);
        hash_map1.put("White", 4);
        hash_map1.put("Blue", 5);
        if (hash_map.containsValue(4)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


        //Write a Java program to create a set view of the mappings contained in a map.
        HashMap < Integer, String > hash_map2 = new HashMap < Integer, String > ();
        hash_map2.put(1, "Red");
        hash_map2.put(2, "Green");
        hash_map2.put(3, "Black");
        hash_map2.put(4, "White");
        hash_map2.put(5, "Blue");
        Set set = hash_map2.entrySet();
        System.out.println(set);


        //Write a Java program to get the value of a specified key in a map.
        HashMap<Integer,String> hash_map3= new HashMap<Integer,String>();  
        hash_map3.put(1,"Red");
        hash_map3.put(2,"Green");
        hash_map3.put(3,"Black");
        hash_map3.put(4,"White");
        hash_map3.put(5,"Blue");
        String val = (String)hash_map3.get(3); 
        System.out.println(val);


        //Write a Java program to get a set view of the keys contained in this map.
        HashMap<Integer,String> hash_map4= new HashMap<Integer,String>();  
        hash_map4.put(1,"Red");
        hash_map4.put(2,"Green");
        hash_map4.put(3,"Black");
        hash_map4.put(4,"White");
        hash_map4.put(5,"Blue");
        Set keyset = hash_map4.keySet();
        System.out.println(keyset);

    }
}
