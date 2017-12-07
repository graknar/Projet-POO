package Forme;
import java.awt.Color;
import java.awt.Graphics;

public class Point extends Forme {
	
	public Point(int x, int y,Color coul){
		super(x,y,coul);
	}
	
	public void dessiner(Graphics g) {
        g.setColor(this.getColor());
        g.drawOval(this.getX(),this.getY(),1,1);
	}
}
