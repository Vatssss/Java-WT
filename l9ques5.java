import java.util.Scanner;

class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}

class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) throws HrsException, MinException, SecException {
        if (hours < 0 || hours > 24) {
            throw new HrsException("Invalid hours: " + hours);
        }

        if (minutes < 0 || minutes > 60) {
            throw new MinException("Invalid minutes: " + minutes);
        }

        if (seconds < 0 || seconds > 60) {
            throw new SecException("Invalid seconds: " + seconds);
        }

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}

public class l9ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hrs, mini, sec;

        System.out.print("Enter hrs (0-24): ");
        hrs = sc.nextInt();

        System.out.print("Enter mini (0-60): ");
        mini = sc.nextInt();

        System.out.print("Enter sec (0-60): ");
        sec = sc.nextInt();
        sc.close();
        try {
            Time t = new Time(hrs, mini, sec);
            System.out.println("Time: " + t.getHours() + ":" + t.getMinutes() + ":" + t.getSeconds());
        } catch (HrsException | MinException | SecException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}