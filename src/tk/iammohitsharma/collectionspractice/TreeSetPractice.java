package tk.iammohitsharma.collectionspractice;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {
    public void show() {
        System.out.print("********************************************************\n" +
                "****************** TreeSet Demo **********************\n" +
                "********************************************************\n");
        System.out.println("\nElements entered in TreeSet : \nZunich Gray William Joanne Gray Maxmillian Zunich Lavendar");
        Set<String> set = new TreeSet<>();
        set.add("Zunich");
        set.add("Gray");
        set.add("William");
        set.add("Joanne");
        set.add("Gray");
        set.add("Maxmillian");
        set.add("Zunich");
        set.add("Lavendar");
        System.out.println("\nItreating from TreeSet : ");
        for (String item : set) {
            System.out.print(item + " ");
        }
        System.out.println("\n\nRemoving Maxmillian from TreeSet..\n");
        set.remove("Maxmillian");
        System.out.println("Itreating again using Iterator : ");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
