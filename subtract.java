// import java.util.*;

class subtract {
    public int sub(int x, int y) {
        return (x - y);
    }

    public double sub(double a, double b) {
        return (a - b);
    }

    public float sub(float c, float d) {
        return (c - d);
    }

    public static void main(String args[]) {
        subtract s = new subtract();
        System.out.println("Subtraction of integer numbers is:" + s.sub(4, 2));
        System.out.println("Subtraction of double numbers is:" + s.sub(18.0380439408240, 2.93094928904));
        System.out.println("Subtraction of float numbers is:" + s.sub(3.14, 1.09));

    }
}