package Forme;
import java.awt.Color;
import java.awt.Graphics;

public abstract class Forme {
	private int CentreX=0,CentreY=0;
	private Color couleur;
	
	public Forme(int x,int y, Color coul){
		this.CentreX=x;
		this.CentreY=y;
		this.couleur=coul;
	};
	
	void deplacer(int x,int y){
		this.CentreX=x;
		this.CentreY=y;
	};
	
	public abstract void dessiner(Graphics g);
	
	int getX() {return CentreX;}
	int getY() {return CentreY;}
	Color getColor(){return couleur;}
}
