package inClass_Practice;
import java.util.Random;
import java.util.Scanner;
/**
 * @author Chris Imholte
 */
public class Sept10 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Random generator = new Random();

        System.out.println("Please enter a positive integer.");
        int userInput = input.nextInt();
        if (userInput < 1) {
            System.out.println("The given number is not positive.");
        }
        else{

            int randomNum =generator.nextInt(userInput + 1);
            System.out.println();
            System.out.println("Your random number is: " + randomNum);
            System.out.println("The possibilities ranged between 0 and "+ userInput + ".");
        }

    }


}
