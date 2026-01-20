package Collections.comparable;



import java.util.Arrays;

class Student implements Comparable<Student> {
    private int rollNo;
    private String name;
    private int marks;

    public Student(int rollNo, String name, int marks) {
        this.rollNo=rollNo;
        this.name=name;
        this.marks=marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.marks,other.marks);
    }

    @Override
    public String toString() {
        return "RollNo: "+rollNo+", Name: "+name+", Marks: "+marks;
    }
}
public class comparestudent {
    

    public static void main(String[] args) {

        Student[] students = {
            new Student(101, "Alice", 85),
            new Student(102, "Bob", 72),
            new Student(103, "Charlie", 90),
            new Student(104, "Diana", 78)
        };
        System.out.println("Students before sorting:");
        for (Student s : students) {
            System.out.println(s);
        }
        Arrays.sort(students);
        System.out.println("\nStudents after sorting (by marks ascending):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
