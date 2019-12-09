package dou;

import comp127graphics.*;
import comp127graphics.Rectangle;

import java.awt.*;


public class Card extends Rectangle {
    private String name;
    private int rank;
    private double positionX;
    private double positionY;
    private double width;
    private double height;
    private double border;
    private static GraphicsObject beChosen;
    private Rectangle rect;


    public Card(String name, int rank, double positionX, double positionY,
                double width, double height, double border){
        this.name = name;
        this.rank = rank;
        this.positionX = positionX;
        this.positionY = positionY;
        this.width = width;
        this.height = height;
        beChosen = null;
        rect = new Rectangle(positionX, positionY, width, height);
        rect.setStroked(true);
        rect.setStrokeWidth(border);
        rect.setStrokeColor(Color.BLACK);
        add(rect);
        GraphicsText text = new GraphicsText(name, positionX+10, positionY+15);
        add(text);
    }

//    public static void main(String [] args) {
//        CanvasWindow canvas = new CanvasWindow("main", 70, 100);
//        Card card = new Card("1", 1,
//                10, 10, 50, 80, 5);
//        canvas.add(card);
//        canvas.draw();
//        canvas.onClick(event -> card.follower());
//    }

    public int getRank() {
        return rank;
    }

    public double getPositionX() {
        return positionX;
    }

    public double getPositionY() {
        return positionY;
    }

    public void setPositionX(double positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(double positionY) {
        this.positionY = positionY;
    }

    /**
     * If the card is clicked, the border will change color to indicate if it is chosen or not.
     * @return
     */
    public void follower(GraphicsGroup card){
        boolean chose = beChosen.equals(card);
        if (chose) {
            card.g setStrokeColor(Color.GREEN);
        }
        else {
            rect.setStrokeColor(Color.BLACK);
        }
    }
//
//    /**
//     * Checks if the placement follows the rules
//     * @return
//     */
//    public boolean isValid(){
//
//
//    }
}