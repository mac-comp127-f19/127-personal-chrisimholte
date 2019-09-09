package basicjava;

import java.util.Scanner;

public class OddEven {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int number=input.nextInt();

        //System.out.println(isOdd(number));
        if (isOdd(number) == true){
            System.out.println("That is odd");
        }
        else {
            System.out.println("That is even");
        }


        System.out.println();

        if (isOdd(number) == true){
            System.out.println("Wow, that is odd!");
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