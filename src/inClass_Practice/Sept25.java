package inClass_Practice;


import comp127graphics.CanvasWindow;
import comp127graphics.Line;
import comp127graphics.Rectangle;

/**
 * @author Chris Imholte
 */
public class Sept25 {
    public static void main(String[] args){

        CanvasWindow cw = new CanvasWindow("Giraffe",780,780);

        Rectangle head = new Rectangle(100,100,60,30);
        Rectangle body = new Rectangle(135,350,250,100);
        Rectangle neck = new Rectangle(125,130,30,220);
        Rectangle ear1 = new Rectangle(140,90,10,20);
        Rectangle ear2 = new Rectangle(150,90,10,20);
        Line leg1 = new Line(110,600,135,450);
        Line leg2 = new Line(140,600,135,450);
        Line leg3 = new Line(385,450,370,600);
        Line leg4 = new Line(385,450,400,600);
        cw.add(ear2);
        cw.add(ear1);
        cw.add(leg4);
        cw.add(leg3);
        cw.add(leg2);
        cw.add(leg1);
        cw.add(neck);
        cw.add(body);
        cw.add(head);
        cw.draw();


    }//end of main
}
