package tk.iammohitsharma.collectionspractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractice {
    public void show() {
        System.out.print("********************************************************\n" +
                "****************** LinkedHashMap Demo ******************\n" +
                "********************************************************\n");
        System.out.println("\nElements entered in LinkedHashMap : \n{1=First Entry, 1=First Entry Duplicate, 2=Second Entry, " +
                "3=Third Entry, 4=Fourth Entry), 4=Fourth Entry Duplicate}");
        Map<Object, String> map = new LinkedHashMap<>();
        map.put(1, "First Entry");
        map.put(1, "First Entry Duplicate");
        map.put(2, "Second Entry");
        map.put(3, "Third Entry");
        map.put(4, "Fourth Entry");
        map.put(3, "Third Entry Duplicate");
        System.out.println("\nItreating from LinkedHashMap : ");
        System.out.println(map);
        System.out.println("\n\nRemoving key=3 from LinkedHashMap..\n");
        map.remove(3);
        System.out.println("Itreating again : ");
        System.out.println(map);
    }
}
