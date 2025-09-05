package Hcollections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {
public static void main(String[] args) {
    
    // arraylist

    ArrayList<String> food = new ArrayList<>();
    food.add("Apple");
    food.add("bread");
    food.add("pasta");
    food.add("orange");
    food.add("grapes");
    System.out.println(food);

    // access an item:

    food.get(0);
    food.set(0, "cereal");
    food.remove(1);
    //food.clear()
    food.size();

    for (String j : food){
        System.out.println(j);
    }

    Collections.sort(food);
        for (String i : food){
            System.out.println(i);
        }


    // Deque - implements the deque interface. DOuble-ended queue.
    //       - Supports FIFO and LIFO
    
    ArrayDeque<Integer> deque = new ArrayDeque<>();

    //ArrayDeque<Integer> deque1 = new ArrayDeque<>(List.of(1,2,4));

        deque.addFirst(1); // add to the head
        deque.addLast(2);    // add to the tail

        deque.offerFirst(3); // returns boolean
        deque.offerLast(5);  // returns boolean


        deque.removeFirst();
        deque.removeLast();
        deque.pollFirst();
        deque.pollLast();

        //System.out.println(deque.getFirst());
        //System.out.println(deque.getLast());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());


        // hashmap:
        //  - keys need to be unique, values anything (dulpicates ok)
        //  - Allows null for key once many for values.

        HashMap<String, Integer> map = new HashMap<>();

        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
    
        System.out.println(map);

        // accessing + updating:

        map.put("a", 10);
        System.out.println(map);

        map.putIfAbsent("a", 100);
        System.out.println(map);

        map.get("a");
        System.out.println(map.get("j"));
        System.out.println(map.getOrDefault("h", 0));

        for (Integer value : map.values()){
            System.out.println(value);
        }

        for (String keys : map.keySet()){
            System.out.println(keys);
        }
}
}



/*
 *  Collections:
 *      - arrays had significant drawbacks:
 *              - not rezible
 *              - no methods
 * 
 *      - Collections is a framework - provides a dynamic way to manage objects.
 *      - Implements list, map, set, deque interfaces. 
 *      - Generics - newer implementation of collections. <T> - type safety.
 * 
 *      charactorists:
 *      - Dynamic sizing: grow or shrink.
 *      - Generics - specific data types
 *      - flexible - int, string, objs (primitves get wrapped as objs)
 * 
 *      types:
 *          list: Ordered (indexed), allow dulpicates (arraylist, linkedlists)
 *          sets: unordered, unique elements (hashset, treeset)
 *          map: key-value pairs, unordered (unindexed), (hashmap, linkedhashmap, treemap)
 * 
 * // no generic
    // ArrayList list = new ArrayList();
    // list.add(123);
    // list.add("One, Two, Three"); // allowed but unsafe. 

    // with generic
    // ArrayList<String> list = new ArrayList<>();
    // list.add("23"); //type safety
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */