package Forme;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Forme{
	private int longueur,largueur;
	public Rectangle(int x, int y, Color coul,int longueur, int largueur){
		super(x,y,coul);
		this.longueur=longueur;
		this.largueur=largueur;
	}
	
	public void dessiner(Graphics g){
		g.setColor(this.getColor());
	}
	
	public int getLongueur(){return longueur;}
	public int getLargueur(){return largueur;}
}
