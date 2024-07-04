import java.util.Scanner;

class ques6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the shape:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Triangle");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double r = sc.nextDouble();
                double areacir = Math.PI * r * r;
                System.out.println("The area of the circle is " + areacir);
                break;
            case 2:
                System.out.print("Enter the side of the square: ");
                double a = sc.nextDouble();
                double areasq = a * a;
                System.out.println("The area of the square is " + areasq);
                break;
            case 3:
                System.out.print("Enter the base of the triangle: ");
                double b = sc.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double h = sc.nextDouble();
                double areatri = 0.5 * b * h;
                System.out.println("The area of the triangle is " + areatri);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
