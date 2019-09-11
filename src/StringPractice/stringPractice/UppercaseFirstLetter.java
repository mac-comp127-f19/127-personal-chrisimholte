/***
 * A class for manipulating strings so that they are properly capitalized.
 *
 * @author Abigail Marsh, Fall 2019
 */

package StringPractice.stringPractice;

import java.util.Scanner;

public class UppercaseFirstLetter {

    /***
     * A method for converting the first letter of a string to uppercase.
     * TODO: Implement this method
     *
     * @param input A string to be modified
     * @return The input string, but with the first letter now capitalized
     */
    public static String uppercaseFirstLetter(String input) {

        if (input.length() != 0){

            if (input.length() > 1) {
                String randomName=input.substring(1);
                char bobby = input.charAt(0);

                String billy = Character.toString(bobby);

                String suzy = billy.toUpperCase();

                //input = input.replace(billy, suzy);
                input = suzy.concat(randomName);
            }
        }

        return input;
    }

    /***
     * Run this program to test your method on different input strings
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter something you would like to modify: ");

        String input = scan.next();

        System.out.println(uppercaseFirstLetter(input));
    }
}
