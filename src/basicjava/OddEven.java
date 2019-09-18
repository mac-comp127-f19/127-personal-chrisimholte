package basicjava;

import java.util.Scanner;

public class OddEven {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int number=input.nextInt();
        while(number > - 1){

            //System.out.println(isOdd(number));
            if (isOdd(number) == true) {
                System.out.println("That is odd");
            } else {
                System.out.println("That is even");
            }
            System.out.println("Please enter another number unless you want to quit, please then input a negative number\n");
            number = input.nextInt();
        }


        System.out.println();
/*

        if (isOdd(number) == true){
            System.out.println("Wow, that is odd!");
        }
*/
        int userNumber;

        int counter = 0;
        String userString = "yes";

        while(userString.equals("yes")) {
           System.out.println("Please input an integer");
           userNumber = input.nextInt();
            counter = 0;
            while (userNumber > 1) {
                    userNumber = userNumber / 2;
                    counter++;


            }
            System.out.println(counter);
            System.out.println("Please input yes if you would like to continue");
            userString = input.next();
        }







    }


    public static boolean isOdd(int number){
        int remainder=number%2;

        if (remainder==0){
            return false;
        }
        else {
            return true;
        }


    }
}