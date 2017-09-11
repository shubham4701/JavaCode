package tk.iammohitsharma.collectionspractice;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public void show() {
        System.out.print("********************************************************\n" +
                "****************** HashMap Demo ************************\n" +
                "********************************************************\n");
        System.out.println("\nElements entered in HashMap : \n{1=First Entry, 1=First Entry Duplicate, 2=Second Entry, " +
                "3=Third Entry, 4=Fourth Entry), 4=Fourth Entry Duplicate}");
        Map<Object, String> map = new HashMap<>();
        map.put(1, "First Entry");
        map.put(1, "First Entry Duplicate");
        map.put(2, "Second Entry");
        map.put(3, "Third Entry");
        map.put(4, "Fourth Entry");
        map.put(3, "Third Entry Duplicate");
        System.out.println("\nItreating from HashMap : ");
        System.out.println(map);
        System.out.println("\n\nRemoving key=3 from HashMap..\n");
        map.remove(3);
        System.out.println("Itreating again : ");
        System.out.println(map);
    }
}
