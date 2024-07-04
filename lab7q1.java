
// A plastic manufacturer sells plastic in different shapes like 2D sheet and 3D box. The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft. Implement it in Java to calculate the cost of plastic as per the dimensions given by the user where 3D inherits from 2D.
import java.util.Scanner;

abstract class Plastic {
    abstract int getCost();
}

class Sheet extends Plastic {
    int length, width;

    Sheet(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int getCost() {
        int costsheet = 40 * length * width;
        return costsheet;
    }
}

class Box extends Sheet {
    int height;

    Box(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }

    int getCost() {
        int costbox = 60 * super.getCost() * height;
        return costbox;
    }
}

class lab7q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of plastic: ");
        int length = sc.nextInt();

        System.out.print("Enter width of plastic: ");
        int width = sc.nextInt();

        System.out.print("Enter height of plastic: ");
        int height = sc.nextInt();

        sc.close();

        Plastic S1 = new Sheet(length, width);
        System.out.println("Cost of plastic in Sheet: Rs " + S1.getCost());

        Plastic B1 = new Box(length, width, height);
        System.out.println("Cost of plastic in Box: Rs " + B1.getCost());
    }
}
