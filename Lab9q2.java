import java.util.Scanner;

public class Lab9q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        System.out.println("Enter another string:");
        String str2 = sc.nextLine();

        // Change the case of the string
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                newStr += (char) (ch - 32);
            } else if (ch >= 'A' && ch <= 'Z') {
                newStr += (char) (ch + 32);
            } else {
                newStr += ch;
            }
        }
        System.out.println("String with case changed: " + newStr);

        // Reverse the string
        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }
        System.out.println("Reversed string: " + reverseStr);

        // Compare two strings
        if (str.equals(str2)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }

        // Insert one string into another string
        System.out.println("Enter a position to insert:");
        int pos = sc.nextInt();
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == pos) {
                newString += str2;
            }
            newString += str.charAt(i);
        }
        System.out.println("New string after insertion: " + newString);
        sc.close();
    }
}