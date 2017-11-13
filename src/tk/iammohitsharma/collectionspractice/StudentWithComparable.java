package tk.iammohitsharma.collectionspractice;

public class StudentWithComparable implements Comparable {
    int rollno, age;
    String name;

    public StudentWithComparable(int rollno, String name, int age) {
        this.rollno = rollno;
        this.age = age;
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        StudentWithComparable s2 = (StudentWithComparable) o;
        if (this.rollno > s2.rollno) return 1;
        else if (this.rollno < s2.rollno) return -1;
        else return 0;
    }
}
