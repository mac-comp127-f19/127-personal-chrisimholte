package inClass_Practice;

import java.util.Scanner;
/**
 * @author Chris Imholte
 */

public class Sept9 {


    public static void main(String[] args){
        boolean numberFlag = false;
        /**
         *
         * Conditions, operators, boolean, and testing
         */

        checkIfNumber(numberFlag);
        System.out.println(numberFlag);


    }



    public static boolean checkIfNumber(boolean flag){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");

        if (input.hasNextInt()){
            System.out.println("The input is an integer");
            flag = true;
        }
        else if (input.hasNextDouble()){
            System.out.println("The input is a decimal number");
            flag = true;
        }
        else {
            System.out.println("The input is not of the type needed. Please run again with correct format.");
            flag = false;
            System.out.println();



        }

        return flag;
    }

}
