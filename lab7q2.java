import java.util.PropertyResourceBundle;
import java.util.Scanner;

// Illustrate the execution of constructors in multi-level inheritance with three Java classes – plate(length, width), box(length, width, height), wood box (length, width, height, thick)
class Plate {
    int length, width;

    Plate(int length, int width) {
        this.length = length;
        this.width = width;
        System.out.println("Plate constructor.");
    }
}

class Box extends Plate {
    int height;

    Box(int length, int width, int height) {
        super(length, width);
        this.height = height;
        System.out.println("Box constructor.");
    }
}

class Woodbox extends Box {
    int thick;

    Woodbox(int length, int width, int height, int thick) {
        super(length, width, height);
        this.thick = thick;
        System.out.println("Woodbox constructor.");
    }
}

class lab7q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();

    }
}