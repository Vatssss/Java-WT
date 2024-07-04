import java.util.Scanner;

public class l9q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { 1, 2, 3 };

        try {
            System.out.print("Enter an index: ");
            int index = sc.nextInt();

            if (index >= 0 && index < arr.length) {
                int x = arr[index];
                System.out.println("The element at index " + index + " is " + x);
            } else {
                throw new ArrayIndexOutOfBoundsException("Invalid index: " + index);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        sc.close();
    }
}
