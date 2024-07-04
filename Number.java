import java.util.Scanner;

public class Number {

    private int[] numbers;
    private int n;

    public Number(int n) {
        numbers = new int[n];
        this.n = n;
    }

    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
    }

    public void swap() {
        int min = 0;
        int max = 0;
        for (int i = 1; i < n; i++) {
            if (numbers[i] < numbers[min]) {
                min = i;
            }
            if (numbers[i] > numbers[max]) {
                max = i;
            }
        }
        int temp = numbers[min];
        numbers[min] = numbers[max];
        numbers[max] = temp;
    }

    public void display() {
        System.out.println("After swapping the smallest and largest elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        Number obj = new Number(n);
        obj.read();
        obj.swap();
        obj.display();
    }
}