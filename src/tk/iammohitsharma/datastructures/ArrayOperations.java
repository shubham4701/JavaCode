package tk.iammohitsharma.datastructures;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {

    private static int[] array = new int[1000];
    private static int index = 0;

    private static void arrayInsert(int num) {
        array[index] = num;
        index++;
    }

    private static void arrayRemove(int index) {
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        index--;
    }

    public static void main(String[] args) {
        System.out.println("********** Array Data Structure **********");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\nArray default length = 10");
            while (true) {
                System.out.print("\n\n1. Default Array Initialize\n2. Add an Element\n3. Remove an Element" +
                        "\n4. Traverse Element\n5. Search Element\n6. Binary Search\n7. Exit\n\nEnter your choice : ");
                switch (scanner.nextInt()) {
                    case 1:
                        array = new int[]{13, 12, 45, 1, 26, 17, 28, 66, 34, 10};
                        System.out.println("\nArray length : 10, Array elements : ");
                        Arrays.stream(array).forEach(a -> System.out.print(a + " "));
                        index = 10;
                        break;
                    case 2:
                        System.out.print("\nEnter elemant : ");
                        arrayInsert(scanner.nextInt());
                        System.out.println("Insertion successful!!");
                        break;
                    case 3:
                        System.out.print("\nEnter index of element to remove : ");
                        arrayRemove(scanner.nextInt());
                        System.out.println("Deletion successful!!");
                        break;
                    case 4:
                        System.out.println("The array is : ");
                        Arrays.stream(array).forEach(a -> System.out.print(a + " "));
                        break;
                    case 5:
                        System.out.print("Enter search term : ");
                        System.out.println(String.format("Search term found at : %s position",
                                linearSerach(scanner.nextInt())));
                        break;
                    case 6:
                        System.out.print("Enter search term : ");
                        System.out.println(String.format("Search term found at : %s position",
                                binarySearch(scanner.nextInt())));
                        break;
                    case 7:
                        System.out.println("Bye...");
                        return;
                    default:
                        System.out.println("Invalid choice!! Please try again.");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    private static int linearSerach(int i) {
        int pos = -1;
        int j = 0;
        for (; j < array.length; j++) {
            if (array[j] == i) {
                pos = j;
                break;
            }
        }
        System.out.println("No of match attempts : " + j);
        return pos + 1;
    }

    private static int binarySearch(int i) {
        int pos = -1, j = 5;
        int comparisons = 0;
        Arrays.sort(array);
        int start = 0, end = index, mid = (start + end) / 2;
        while (start <= end) {
            if (array[mid] == i) {
                pos = mid;
                System.out.println("1");
                break;
            } else if (array[mid] > i) {
                System.out.println("2");
                end = (mid) - 1;
            } else {
                System.out.println("3");
                start = (mid) + 1;
            }
            mid = (start + end) / 2;
            comparisons++;
        }
        System.out.println(String.format("Number of comparisons done : %d", comparisons));
        return pos;
    }

}
