package Forme;
import java.awt.Color;
import java.awt.Graphics;

public class Carre extends Forme {
	private int cote;
	
	public Carre(int x, int y, Color coul, int c){
		super(x,y,coul);
		cote=c;
	}
	
	public void dessiner(Graphics g){
		g.setColor(this.getColor());
	}
	
	public int getCote() {return cote;}
}
