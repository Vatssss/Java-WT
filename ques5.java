import java.util.Scanner;

public class ques5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        Student[] st = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1) + ":");
            System.out.print("Roll No.: ");
            int roll = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("CGPA: ");
            double cgpa = sc.nextDouble();
            st[i] = new Student(roll, name, cgpa);
        }
        System.out.println("\nStudent details:");
        for (int i = 0; i < n; i++) {
            System.out.println(st[i].toString());
        }
        double minCgpa = st[0].getCgpa();
        String lowCgpa = st[0].getName();
        for (int i = 1; i < n; i++) {
            if (st[i].getCgpa() < minCgpa) {
                minCgpa = st[i].getCgpa();
                lowCgpa = st[i].getName();
            }
        }
        System.out.println("\nStudent with the lowest CGPA: " + lowCgpa);
    }
}

class Student {
    private int roll;
    private String name;
    private double cgpa;

    public Student(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getRollNo() {
        return roll;
    }

    public void setRollNo(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public String toString() {
        return "Roll No.: " + roll + ", Name: " + name + ", CGPA: " + cgpa;
    }
}
