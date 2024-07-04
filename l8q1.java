abstract class Student {
    int rollNo;
    int regNo;

    public abstract void course();
}

class KIITian extends Student {
    public void course() {
        System.out.println("Roll number: " + rollNo);
        System.out.println("Registration number: " + regNo);
        System.out.println("KIITian is studying Computer Science Engineering");
    }
}

public class l8q1 {
    public static void main(String[] args) {

        KIITian kiitian = new KIITian();

        kiitian.rollNo = 101;
        kiitian.regNo = 2021;

        kiitian.course();
    }
}
