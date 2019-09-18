package basicjava;

/**
 * @author Chris Imholte
 * Siyuan
 */
public class DoNDrills {

    public static void main(String[] args){

      for(int i = 1; i < 10;i++) {
          System.out.println(i);
        }
        System.out.println();

        for(int i = 10; i >= 0; i--){
            System.out.println(i);
        }
        System.out.println();

        for(int i = 1; i < 257; i = i*2){
            System.out.println(i);
        }
        System.out.println();
        for(int i = 0; i < 256; i = i*2+1){
            System.out.println(i);
        }
        System.out.println();
        for(int i= 1; i<51;i++) {
            if(i %2 == 1 || i == 1) {

                System.out.println(Math.sqrt(i));
            }
        }





    }


}
