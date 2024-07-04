import java.util.Scanner;

class InputValidationException extends Exception {
    public InputValidationException(String message) {
        super(message);
    }
}

class Postpaid_Bill {
    long Mobile_number;
    int customer_id;
    int bill_date, bill_month, bill_year;
    int monthlyTransaction[] = { 1000, 1200, 2000, 200, 5000 };

    void getPostPaidbill(long Mobile_number, int customer_id, int bill_date, int bill_month, int bill_year)
            throws InputValidationException {
        if (Mobile_number < 10000000) {
            throw new InputValidationException("Invalid Mobile Number");
        }
        if (customer_id < 100000) {
            throw new InputValidationException("Invalid Customer Id");
        }
        this.Mobile_number = Mobile_number;
        this.customer_id = customer_id;
        this.bill_date = bill_date;
        this.bill_month = bill_month;
        this.bill_year = bill_year;
    }

    void getTotalAmount() {
        System.out.println("Monthly Transaction: ");
        for (int i = 0; i < monthlyTransaction.length; i++) {
            System.out.println(monthlyTransaction[i]);
        }
    }
}

public class sessional {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long Mobile_number;
        int customer_id, bill_date, bill_month, bill_year;
        System.out.println("Mobile Number: ");
        Mobile_number = sc.nextInt();
        System.out.println("Customer id: ");
        customer_id = sc.nextInt();
        System.out.println("Date(1-31): ");
        bill_date = sc.nextInt();
        System.out.println("Month(1-12): ");
        bill_month = sc.nextInt();
        System.out.println("Year(yyyy): ");
        bill_year = sc.nextInt();
        try {

            Postpaid_Bill p = new Postpaid_Bill();
            p.getPostPaidbill(Mobile_number, customer_id, bill_date, bill_month, bill_year);
            System.out.println(Mobile_number);
            System.out.println(customer_id);
            System.out.println(bill_date + "-" + bill_month + "-" + bill_year);
            p.getTotalAmount();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}