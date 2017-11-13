package tk.iammohitsharma.collectionspractice;

import java.util.Scanner;

public class CollectionsAndSortingDemo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("*****************************************************************************\n" +
                    "*************** Collections & Comparator/Comparable Demo ********************\n" +
                    "*****************************************************************************");
            while (true) {
                System.out.println("\nPlease choose from options : ");
                System.out.print("1. ArrayList Example\n2. LinkedList Example\n3. HashSet Example\n4. TreeSet Example\n" +
                        "5. HashMap Example\n6. LinkedHashMap Example\n7. TreeMap Example\n8. HashTable Example\n" +
                        "9. Comparable Example\n10. Comparator Example\n11. Exit\n\nEnter your choice : ");
                switch (scanner.nextInt()) {
                    case 1:
                        new ArrayListPractice().show();
                        break;
                    case 2:
                        new LinkedListPractice().show();
                        break;
                    case 3:
                        new HashSetPractice().show();
                        break;
                    case 4:
                        new TreeSetPractice().show();
                        break;
                    case 5:
                        new HashMapPractice().show();
                        break;
                    case 6:
                        new LinkedHashMapPractice().show();
                        break;
                    case 7:
                        new TreeMapPractice().show();
                        break;
                    case 8:
                        new HashTablePractice().show();
                        break;
                    case 9:
                        new ComparableDemo().show();
                        break;
                    case 10:
                        new ComparatorDemo().show();
                        break;
                    case 11:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice, please try again\n");
                }
            }
        }
    }
}
