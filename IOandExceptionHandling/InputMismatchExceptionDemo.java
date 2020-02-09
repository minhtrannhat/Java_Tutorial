package IOandExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean continuesInput = true;

        do{
            try{
                System.out.println("Enter a integer");
                int number = input.nextInt();

                System.out.println("The number entered is " + number);

                continuesInput = false;
            }

            catch (InputMismatchException ex){
                System.out.println("Try again, incorrect input: an integer is required");
                input.nextLine(); // discard input
            }


        }while(continuesInput);
    }
}
