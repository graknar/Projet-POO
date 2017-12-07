import java.awt.Color;
import java.awt.Graphics;

public class Rectangle implements Forme{
	private int CentreX;		// abcisse
	private int CentreY;		// ordonnée
	private Color coul;	// couleur
	private int Longueur,Largueur;

	public Rectangle(int x, int y, Color coul, int Longueur,int Largueur) {
		this.CentreX = x;
		this.CentreY= y;
		this.coul = coul;
		this.Largueur=Largueur;
		this.Longueur=Longueur;
	}

	// Méthode de dessin dans un objet graphique g
	public void dessiner(Graphics g) {
	    g.setColor(coul);
	    g.drawOval(CentreX,CentreY,Longueur,Largueur);
	}
	
	public void setX(int X){
		CentreX=X;
	}
	
	public void setY(int Y){
		CentreY=Y;
	}
	
	public void deplacer(int X,int Y){
		CentreX=X;
		CentreY=Y;
	}
}
