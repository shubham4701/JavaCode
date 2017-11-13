package tk.iammohitsharma.collectionspractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetPractice {
    public void show() {
        System.out.print("********************************************************\n" +
                "****************** HashSet Demo **********************\n" +
                "********************************************************\n");
        System.out.println("\nElements entered in HashSet : \nZunich Gray William Joanne Gray Maxmillian Zunich Lavendar");
        Set<String> set = new HashSet<>();
        set.add("Zunich");
        set.add("Gray");
        set.add("William");
        set.add("Joanne");
        set.add("Gray");
        set.add("Maxmillian");
        set.add("Zunich");
        set.add("Lavendar");
        System.out.println("\nItreating from HashSet : ");
        for (String item : set) {
            System.out.print(item + " ");
        }
        System.out.println("\n\nRemoving Maxmillian from HashSet..\n");
        set.remove("Maxmillian");
        System.out.println("Itreating again using Iterator : ");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
