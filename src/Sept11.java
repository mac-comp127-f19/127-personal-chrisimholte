import java.util.Scanner;

/**
 * @author Chris Imholte
 */

public class Sept11 {

    public static void main(String[] args)  {



        //obj.methodName(parameters){}
        //obj can be a variable a name for an object
        //obj can also be a class name


        //Using a static method
        System.out.println(Math.sqrt(4.0));


        //Using a non-static methods
        Scanner input = new Scanner(System.in);
        System.out.println("Input an int");

        input.nextInt();  //input actually calls the object from the constructor that was used previously


    }

}
