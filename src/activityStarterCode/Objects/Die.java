package activityStarterCode.Objects;

import java.util.Random;

/**
 * @author Chris Imholte and Hayley Hadges
 */
public class Die {

    private int numOfSides;
    private int value;
    private int maxvalue;


    public Die(){
        numOfSides = 6;
        value = -1;
    }
    public Die(int number){
        Random generator = new Random();
        int choice =generator.nextInt(number);
        value = choice+1;
        value = -1;
        numOfSides = choice;
        maxvalue = choice;
    }


    public void roll(){
        Random generator = new Random();
        int choice =generator.nextInt(getNumOfSides());
        value = choice+1;
    }
    public int getValue(){

        return(value);
    }
    public int getNumOfSides(){
        return numOfSides;
    }
    @Override
    public String toString() {
        return ""+value;
    }
}
