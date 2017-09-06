package tk.iammohitsharma.collectionspractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPractice {
    public void show() {
        System.out.print("********************************************************\n" +
                "****************** ArrayList Demo **********************\n" +
                "********************************************************\n");
        System.out.println("\nElements entered in ArrayList : \nGray William Joanne Maxmillian Zunich Lavendar");
        List<String> list = new ArrayList<>();
        list.add("Gray");
        list.add("William");
        list.add("Joanne");
        list.add("Maxmillian");
        list.add("Zunich");
        list.add("Lavendar");
        System.out.println("\nItreating from ArrayList : ");
        for (String item : list) {
            System.out.print(item + " ");
        }
        System.out.println("\n\nRemoving Maxmillian from ArrayList..\n");
        list.remove("Maxmillian");
        System.out.println("Itreating again using Iterator : ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
