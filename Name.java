import java.util.*;

class Name {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name and last name:");
        String first = sc.nextLine();
        String last = sc.nextLine();
        System.out.println(last + " " + first);
    }
}