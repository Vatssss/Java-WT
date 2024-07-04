import java.util.*;

class A {
    public int x, y;

    void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of x and y:");
        x = sc.nextInt();
        y = sc.nextInt();
        int c = x + y;
        System.out.println("Output of base class is:" + c);
    }
}

class B extends A {
    int z;

    void mul() {
        Scanner ref = new Scanner(System.in);
        System.out.println("Enter the value of z");
        z = ref.nextInt();
        int b = x * y * z;
        System.out.println("Output of child class is:" + b);
    }
}

public class Inheritence {
    public static void main(String args[]) {
        B objB = new B();
        objB.add();
        objB.mul();
    }

}
