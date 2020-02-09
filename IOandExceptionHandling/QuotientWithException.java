package IOandExceptionHandling;

import org.w3c.dom.ls.LSOutput;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class QuotientWithException {
    public static int quotient(int number1, int number2){
        if(number2 == 0)
            throw new ArithmeticException("Divisor cannot be zero");

        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt the user to enter 2 integers
        System.out.println("Pls enter 2 integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        try {
            int result = quotient(number1, number2);
            System.out.println(number1 + " / " + number2 + " = " + result);
        }

        catch (ArithmeticException ex){
                System.out.println("Exception: an integer cannot be divided by zero");
        }

        System.out.println("Program execution continues");
    }

}
