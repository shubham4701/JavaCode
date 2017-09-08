package tk.iammohitsharma.collectionspractice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {
    public void show() {
        System.out.print("********************************************************\n" +
                "***************** LinkedList Demo **********************\n" +
                "********************************************************\n");
        System.out.println("\nElements entered in LinkedList : \nGray William Joanne Maxmillian Zunich Lavendar");
        List<String> list = new LinkedList<>();
        list.add("Gray");
        list.add("William");
        list.add("Joanne");
        list.add("Maxmillian");
        list.add("Zunich");
        list.add("Lavendar");
        System.out.println("\nItreating from LinekdList : ");
        for (String item : list) {
            System.out.print(item + " ");
        }
        System.out.println("\n\nRemoving Maxmillian from LinkedList..\n");
        list.remove("Maxmillian");
        System.out.println("Itreating again using Iterator : ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
