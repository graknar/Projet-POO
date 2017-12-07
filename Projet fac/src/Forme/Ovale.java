package Forme;
import java.awt.Color;
import java.awt.Graphics;

public class Ovale extends Forme{
	private int rayonX, rayonY;
	public Ovale(int x, int y, Color coul, int rx, int ry){
		super(x,y,coul);
		rayonX=rx;
		rayonY=ry;
	}
	
	public void dessiner(Graphics g){
		g.setColor(this.getColor());
	}
	
	public int getRayonX() {return rayonX;}
	public int getRayonY() {return rayonY;}
}
