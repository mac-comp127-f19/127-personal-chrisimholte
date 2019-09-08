package basicjava;

import java.util.Scanner;

public class BasicStuff {

    /**
     * @author chris imholte
     * @author nicholas halligan mesa
     */

    public static void main (String[] args){

        double age0;
        double age1;
        age0 = 18;
        age1 = 19;
        System.out.println("We are " + age0 + " and " + age1 + " years old!");

        int sumOfAges;
        sumOfAges = (int) (age0 + age1);
        System.out.println("The sum of our ages is " + sumOfAges + "!");
        System.out.println("The sum of our ages is " + (age0 + age1) + "!");
        System.out.println(6/3);
        System.out.println(6/4);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE - 1);

        double totalHours = 1600.0;
        double weeks =totalHours/168.0;
        double hoursRemaining=(weeks - (int)weeks)*168;
        double days = hoursRemaining/24.0;
        double hoursFinal = (days - (int)days)*24.0;

        System.out.println();
        System.out.println("Weeks: " + (int)weeks + " Days: "+ (int)days+ " Hours: "+(int)hoursFinal);

        System.out.println();
        Scanner input = new Scanner(System.in);

        double radius;
        double height;
        System.out.println("Please input a double for radius and then height.");
        radius = input.nextDouble();
        height = input.nextDouble();
        System.out.println("Cone Volume: "+ getConeVolume(radius, height) + " Cone Surface Area: " + getConeSurfaceArea(radius, height));

    }

    /**
     * Returns the volume for a cone given radius and height
     * @param radius (double)
     * @param height (double)
     * @return volume
     */
    static double getConeVolume(double radius, double height){

        double firstVolume = radius*radius*height*Math.PI;

        double volume = firstVolume/3.0;

        return volume;
    }


    /**
     * Returns the area for a cone given radius and height
     * @param radius (double)
     * @param height (double)
     * @return area
     */
    static double getConeSurfaceArea(double radius, double height ){

        double firstHalfEq = Math.PI*radius*radius;
        double secondHalfEq = Math.PI*radius*(Math.sqrt((radius*radius)+(height*height)));
        double Area = firstHalfEq + secondHalfEq;

        return Area;
    }




}
