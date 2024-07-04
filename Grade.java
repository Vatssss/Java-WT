import java.util.*;

class Grade {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks:");
        int marks = sc.nextInt();
        char g = ' ';
        if (marks > 100)
            System.out.println("Invalid Entry!");
        else if (marks >= 90)
            g = 'O';
        else if (marks >= 80)
            g = 'E';
        else if (marks >= 70)
            g = 'A';
        else if (marks >= 60)
            g = 'B';
        else if (marks >= 50)
            g = 'C';
        else if (marks >= 40)
            g = 'D';
        else
            g = 'F';
        System.out.println("Your grade is:" + g);
    }
}
