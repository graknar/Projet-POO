package Forme;
import java.awt.Color;
import java.awt.Graphics;

public class Triangle extends Forme{
	
	public Triangle(int x, int y, Color coul){
		super(x,y,coul);
	}
	
	public void dessiner(Graphics g){
		g.setColor(this.getColor());
	}
}
