
// How to Add two numbers using the User's Input
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        int x, y, sum; // yet to be definied
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Type a number: ");
        x = myScanner.nextInt(); // this reads the user's input
        // And stores it in the variable x

        System.out.println("Type in you second number: ");
        y = myScanner.nextInt(); // reads the user's input
        // And stores it in the variable y

        sum = x + y;
        System.out.println("The Sum of " + x + " and " + y + " is " + sum + ".");

        myScanner.close();

        // I can make a (very) simple Calculator Now in Java.
        // just replace the operator in sum = x _ y;
    }
}