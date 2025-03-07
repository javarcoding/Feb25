import java.util.Scanner;

class Student {
    String name;
    int age;
    double marks;

    // Constructor
    Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Display method
    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Marks: " + marks);
    }
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating an array of Student objects
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n]; // Array of objects

        // Input student details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of student " + (i + 1) + ":");
            System.out.print("Enter Name: ");
            sc.nextLine(); // Consume newline
            String name = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();

            // Creating and storing Student objects in the array
            students[i] = new Student(name, age, marks);
        }

        // Display student details
        System.out.println("\nStudent Details:");
        for (Student s : students) {
            s.display();
        }

        sc.close();
    }
}
