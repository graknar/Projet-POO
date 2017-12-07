package Forme;
import java.awt.Color;
import java.awt.Graphics;

public class Cercle extends Forme{
	private int rayon;
	public Cercle(int x, int y, Color coul, int r){
		super(x,y,coul);
		rayon=r;
	}
	
	public void dessiner(Graphics g){
		g.setColor(this.getColor());
	}

	public int getRayon() {return rayon;}
}
