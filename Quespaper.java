// import java.util.*;
// import java.io.*;

// class Quespaper {
//     String bankname;
//     int accid;
//     String accname;
//     int balance;
//     int pass;
//     Scanner sc = new Scanner(System.in);

//     void Get_acc_details() {
//         System.out.println("Bankname");
//         bankname = sc.nextLine();
//         System.out.println("AccountID");
//         accid = sc.nextInt();
//         System.out.println("AccName");
//         accname = sc.nextLine();
//         System.out.println("Balance");
//         balance = sc.nextInt();
//         System.out.println("Password");
//         pass = sc.nextInt();

//     }

//     void Display() {
//         System.out.println("Bankname" + bankname);
//         System.out.println("AccountId" + accid);
//         System.out.println("Accname" + accname);
//         System.out.println("Balance" + balance);
//         System.out.println("Password" + pass);
//     }

//     int deposit() {
//         System.out.println("Deposit amount:");
//         int dep = sc.nextInt();
//         balance = balance + dep;
//         return balance;
//     }

//     int withdraw() {
//         System.out.println("WithdrawalAxi amount:");
//         int witd = sc.nextInt();
//         balance = balance - witd;
//         return balance;
//     }

//     void Validate_pass() {
//         System.out.println("Enter pass:");
//         int x = sc.nextInt();
//         if (x == pass) {
//             System.out.println("1 for deposit and 2 for withdraw");
//             int val = sc.nextInt();
//             switch (val) {
//                 case 1:
//                     deposit();
//                     break;

//                 case 2:
//                     withdraw();
//                     break;

//             }
//             System.out.println("Balance is:" + balance);
//         } else {
//             System.out.println("Wrong pass");
//         }
//     }

//     public static void main(String a[]) {
//         Quespaper obj = new Quespaper();
//         obj.Get_acc_details();
//         obj.Display();
//         obj.Validate_pass();
//     }

// }

// abstract class Animal {
//     void makesound() {
//         System.out.println("Makes sound:");
//     }
// }

// class Dog extends Animal {
//     void makesound() {
//         super.makesound();
//         System.out.print("bark");
//     }
// }

// class Tiger extends Animal {
//     void makesound() {
//         super.makesound();
//         System.out.print("roar");
//     }
// }

// class Quespaper {
//     public static void main(String args[]) {
//         Animal obj = new Dog();
//         obj.makesound();
//         Animal ob1 = new Tiger();
//         ob1.makesound();
//     }
}