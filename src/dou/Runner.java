package dou;

import comp127graphics.CanvasWindow;

import java.util.ArrayList;
import java.util.List;


/**
 * @author Chris Imholte
 */
public class Runner {
    public static void main(String[] args){
        CanvasWindow canvas = new CanvasWindow("Game",800,800);
        int counter = 0;
        List<Card> cardList = new ArrayList<Card>();

        for(int i = 0; i<18; i++){
            Card newCard = new Card(i);
        }



        canvas.onMouseMove((mouseEvent)-> card.follower(mouseEvent.getPosition().getX(), canvas));


    }

}
