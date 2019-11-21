package dou;

import comp127graphics.CanvasWindow;

/**
 * @author Chris Imholte
 */
public class Card {
    private int cardHeight;
    private int cardWidth;
    private int cardNum;

    public Card(int cardNum, CanvasWindow canvas){
        this.cardNum = cardNum;
        this.cardHeight = canvas.getHeight()/50;
        this.cardWidth = canvas.getWidth()/50;
    }

    /**
     * Follows the mouse and places the cards in a valid location
     * @return
     */
    public boolean follower(){

    }

    /**
     * Checks if the placement follows the rules
     * @return
     */
    public boolean isValid(){


    }
}
