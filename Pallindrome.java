import java.util.*;

class Pallindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        while (temp != 0) {
            int dig = temp % 10;
            rev = (rev * 10) + dig;
            temp = temp / 10;
        }
        if (rev == num)
            System.out.println("Pallindrome!");
        else
            System.out.println("Not a pallindrome!");
    }
}