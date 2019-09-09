
package basicjava;
import java.util.Scanner;

public class Hypotenuse {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers on two seperate lines");
        double side1 = input.nextDouble();
        double side2 =input.nextDouble();
        System.out.println(calculateHypotenuse(side1,side2));


    }

    public static double calculateHypotenuse(double side1, double side2){

        double finalHypotenuse=Math.sqrt(side1*side1 + side2*side2);


        return finalHypotenuse;
    }


}
