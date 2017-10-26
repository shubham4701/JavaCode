package tk.iammohitsharma.collectionspractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
    public void show() {
        System.out.println("********************************************************\n" +
                "****************** Comparable Demo *********************\n" +
                "********************************************************");

        Student s1 = new Student(123, "Max", 25);
        Student s2 = new Student(121, "Jay", 17);
        Student s3 = new Student(110, "Andre", 12);
        Student s4 = new Student(147, "Drey", 24);
        Student s5 = new Student(131, "Leo", 23);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);

        System.out.println("\nInitial unsorted List : \n");

        for (Student student : studentList) {
            System.out.println("Roll No : " + student.rollno + " Name : " + student.name + " Age : " + student.age);
        }

        Collections.sort(studentList, new RollNoComparator());

        System.out.println("\nList after Roll No sorting : \n");

        for (Student student : studentList) {
            System.out.println("Roll No : " + student.rollno + " Name : " + student.name + " Age : " + student.age);
        }

        Collections.sort(studentList, new NameComparator());

        System.out.println("\nList after Name sorting : \n");

        for (Student student : studentList) {
            System.out.println("Roll No : " + student.rollno + " Name : " + student.name + " Age : " + student.age);
        }

        Collections.sort(studentList, new AgeComparator());

        System.out.println("\nList after Age sorting : \n");

        for (Student student : studentList) {
            System.out.println("Roll No : " + student.rollno + " Name : " + student.name + " Age : " + student.age);
        }
    }
}
