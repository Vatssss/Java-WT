/* public class learnjava {
    
}*/

import java.util.*; //used to load the contents of the java. util package in a Java program

class learnjava {
    public static void main(String args[]) {
        // public- access specifier, static-memory management(don't need an object to
        // execute), void- return type,
        // main- main method, string- pre defined class, args- object(input array) for
        // passing any value
        Scanner input = new Scanner(System.in);
        Scanner line = new Scanner(System.in);
        // scanner- type, input- object, system.in- system class input
        System.out.println("HI");
        // system.out- system class output, println- print line.
        int data = input.nextInt(); // nextInt- stores the next token of input as an
        // int value.
        System.out.println("you're:" + data); // string + variable name.
        System.out.println("Now printing line so:");
        String lnl = line.nextLine();
        System.out.println("You wrote: " + lnl);
    }
}

/*
 * ARRAY: contains similar datatype.
 * datatype variable[] = new datatype[5];
 * int arr[]= new int[5];
 */

/*
 * CLASSES: predefined: System, Scanner, String, Console; user defined: any
 * name;
 */

/*
 * class classname{
 * // data;
 * // method;
 * }
 */

/*
 * OBJECT: create object;
 * classname objname = new clasname();
 */

/*
 * CONSTRUCTOR: method
 * classname{
 * classname(){
 * //constructor.
 * }
 * }
 */

/*
 * METHOD OVERLOADING:
 * method with same name but different parameters.
 * void add(){}
 * void add(int x, float y){}
 * void add(double a, double b){}
 */

/*
 * super class: base class
 * sub class: child class
 * Syntax:
 * class A{
 * 
 * }
 * class B extends A{
 * 
 * }
 */
