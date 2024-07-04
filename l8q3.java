interface Employee {
    double earnings(double basic);

    double deductions(double basic);

    double bonus(double basic);
}

abstract class Manager implements Employee {

    public double earnings(double basic) {
        double da = 0.8 * basic;
        double hra = 0.15 * basic;
        return basic + da + hra;
    }

    public double deductions(double basic) {
        return 0.12 * basic;
    }

    public abstract double bonus(double basic);
}

class Substaff extends Manager {

    public double bonus(double basic) {
        return 0.5 * basic;
    }
}

public class l8q3 {
    public static void main(String[] args) {
        Substaff s = new Substaff();
        double basicSalary = 10000;
        double earnings = s.earnings(basicSalary);
        double deductions = s.deductions(basicSalary);
        double bonus = s.bonus(basicSalary);
        System.out.println("Earnings: " + earnings);
        System.out.println("Deductions: " + deductions);
        System.out.println("Bonus: " + bonus);
    }
}
