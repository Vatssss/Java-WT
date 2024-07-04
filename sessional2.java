import java.util.*;

class Stack {
    int arr[] = new int[5];
    int count = 0;

    void push(int x) throws StackEmptyFullException {
        if (count == 4) {
            throw new StackEmptyFullException("Stack full");
        }
        arr[count] = x;
        count++;
    }

    void pop() throws StackEmptyFullException {
        if (count == -1) {
            throw new StackEmptyFullException("Stack empty");
        }
        int temp = arr[count];
        count--;
    }
}

class StackEmptyFullException extends Exception {
    public StackEmptyFullException(String message) {
        super(message);
    }
}

public class sessional2 {
    public static void main(String args[]) {
        Stack s = new Stack();
        try {
            s.push(5);
            s.push(5);
            s.push(5);
            s.push(5);
            s.push(5);
            s.push(5);
            s.push(5);
            s.pop();
            s.pop();
            s.pop();
            s.pop();
            s.pop();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
