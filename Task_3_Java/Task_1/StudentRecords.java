import java.util.*;

class Student {
    String name;
    int[] marks;
    int total;
    double average;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
        this.total = Arrays.stream(marks).sum();
        this.average = (double) total / marks.length;
    }
}

public class StudentRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.next();
            System.out.print("Enter number of subjects: ");
            int subjects = sc.nextInt();
            int[] marks = new int[subjects];
            for (int j = 0; j < subjects; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                marks[j] = sc.nextInt();
            }
            students[i] = new Student(name, marks);
        }

        Arrays.sort(students, (a, b) -> Double.compare(b.average, a.average));

        System.out.println("\nSorted Student List:");
        for (Student s : students) {
            System.out.println("Name: " + s.name + ", Total: " + s.total + ", Average: " + s.average);
        }
    }
}
