package tk.iammohitsharma.collectionspractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public void show() {
        System.out.println("********************************************************\n" +
                "****************** Comparable Demo *********************\n" +
                "********************************************************");

        StudentWithComparable s1 = new StudentWithComparable(123, "Max", 25);
        StudentWithComparable s2 = new StudentWithComparable(121, "Jay", 17);
        StudentWithComparable s3 = new StudentWithComparable(110, "Andre", 12);
        StudentWithComparable s4 = new StudentWithComparable(147, "Drey", 24);
        StudentWithComparable s5 = new StudentWithComparable(131, "Leo", 23);

        List<StudentWithComparable> StudentWithComparableList = new ArrayList<>();
        StudentWithComparableList.add(s1);
        StudentWithComparableList.add(s2);
        StudentWithComparableList.add(s3);
        StudentWithComparableList.add(s4);
        StudentWithComparableList.add(s5);

        System.out.println("\nInitial unsorted List : \n");

        for (StudentWithComparable StudentWithComparable : StudentWithComparableList) {
            System.out.println("Roll No : " + StudentWithComparable.rollno + " Name : " + StudentWithComparable.name + " Age : " + StudentWithComparable.age);
        }

        Collections.sort(StudentWithComparableList);

        System.out.println("\nList after sorting : \n");

        for (StudentWithComparable StudentWithComparable : StudentWithComparableList) {
            System.out.println("Roll No : " + StudentWithComparable.rollno + " Name : " + StudentWithComparable.name + " Age : " + StudentWithComparable.age);
        }
    }
}
