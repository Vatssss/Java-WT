interface Motor {
    int capacity = 5; // capacity is a data member of the interface

    void run();

    void consume();
}

class WashingMachine implements Motor {
    public void run() {
        System.out.println("Washing machine is running.");
    }

    public void consume() {
        System.out.println("Washing machine is consuming power.");
    }
}

public class l8q2 {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.consume();
        System.out.println("The capacity of the washing machine is: " + Motor.capacity);
    }
}