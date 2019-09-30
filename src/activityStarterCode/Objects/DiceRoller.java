package activityStarterCode.Objects;

/**
 * @author Chris Imholte and Hayley Hadges
 */
public class DiceRoller
{
    public static void main(String[] args){

        Die samuel = new Die();
        int counter = 0;
        while(counter < 10){
            samuel.roll();
            System.out.println("Roll "+counter+ " generated a " +samuel.toString());
            counter++;
        }
        Die georgia = new Die();
        counter = 0;
        int sameValue = 0;
        while(counter < 1000001){
            georgia.roll();
            samuel.roll();
            if(georgia.getValue() == samuel.getValue()){
                sameValue++;
            }

            counter++;
        }
        System.out.println();
        System.out.println("In one million roles, two dice agreed " + sameValue+" times" );

        System.out.println();
        Die craig = new Die(100);
        craig.roll();
        System.out.println(craig.toString());


    }


}
